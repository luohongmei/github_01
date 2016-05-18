package com.yc.action;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.biz.VoteBiz;
import com.yc.po.Item;
import com.yc.po.OptionBean;
import com.yc.po.VoteBean;


@Controller("voteAction")
public class VoteAction  implements SessionAware,ModelDriven<Item>{
    @Autowired
    private VoteBiz biz;
    private Item item;
    private Map<String,Object> session; 
	
	//投票详情
    public String view(){
    	OptionBean options=biz.findOptionsById(item.getSub_id());
        session.put("optionBean",options);
		return "view";
    }
    //我要参与
    public String vote(){
		VoteBean vote=biz.getVoteBeanById(item.getSub_id());
		session.put("voteBean",vote);
		return "vote";
    }
    //点击投票选项
    public String save(){
    	String[] op_id=ServletActionContext.getRequest().getParameterValues("op_id");
    	LogManager.getLogger().debug("save取到的数据为"+item+"op_id="+Arrays.toString(op_id));
    	if(biz.saveVote(item,op_id)){
    		return "saveSuccess";
    	}
    	session.put("saveFail", "投票失败");
    	return "saveFail";
    }
	@Override
	public void setSession(Map<String,Object> session) {
	    this.session=session;
	}
	@Override
	public Item getModel() {
		item=new Item();
		return item;
	}
 
}
