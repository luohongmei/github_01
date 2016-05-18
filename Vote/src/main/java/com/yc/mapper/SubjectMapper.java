package com.yc.mapper;

import java.util.List;

import com.yc.po.AddSubjectBean;
import com.yc.po.Item;
import com.yc.po.Option;
import com.yc.po.OptionBean;
import com.yc.po.Subject;
import com.yc.po.SubjectBean;
import com.yc.po.VoteBean;

public interface SubjectMapper {
	List<Subject> getSubject();
	List<SubjectBean> findAllSubjectBeans();
	OptionBean getOptionsBySId(int sub_id);
	VoteBean getVoteBeanById(int sub_id);
	void insertItem(Item item);
	void insertItem(AddSubjectBean add);
	void insertOption(Option option);
	void insertSubject(AddSubjectBean add);
}
