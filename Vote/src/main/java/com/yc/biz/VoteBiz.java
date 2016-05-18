package com.yc.biz;

import java.util.List;












import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yc.mapper.SubjectMapper;
import com.yc.po.Item;
import com.yc.po.OptionBean;
import com.yc.po.SubjectBean;
import com.yc.po.VoteBean;
@Service("voteBiz")
@Transactional
public class VoteBiz {
	@Autowired
	private SubjectMapper mapper;
	
    public List<SubjectBean> getSubject(){
	   return  mapper.findAllSubjectBeans();
    }
    public OptionBean findOptionsById(int sub_id){
	      return mapper.getOptionsBySId(sub_id);
    }
    public VoteBean getVoteBeanById(int sub_id){
  	     return mapper.getVoteBeanById(sub_id);
    }
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean saveVote(Item item){
    	try {
			mapper.insertItem(item);
			return true;
		} catch (Exception e) {
			LogManager.getLogger().error("Í¶Æ±Ê§°Ü",e);
		}
    	return false;
    }
    @Transactional(propagation=Propagation.REQUIRED)
	public boolean saveVote(Item item, String[] op_id) {
		boolean flag=true;
		if(op_id.length>1){ 
			for(String op:op_id){
				item.setOp_id(Integer.parseInt(op));
				if(!saveVote(item)){
					return false;
				}
			}
			return true;
		}
		return saveVote(item);
	}
}
