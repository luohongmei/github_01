package com.yc.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.biz.AddBiz;
import com.yc.po.AddSubjectBean;
@Controller("addAction")
public class AddAction implements ModelDriven<AddSubjectBean>{
	private AddSubjectBean add;
	@Autowired
	private AddBiz biz;
    public String add(){
    	LogManager.getLogger().debug("SubjectAction取到的参数数据"+add);
    	try {
			biz.add(add);  
			return "addsuccess";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "addFail"; 
    }
	@Override
	public AddSubjectBean getModel() {
		add=new AddSubjectBean();
		return add;
	}
	 
}
