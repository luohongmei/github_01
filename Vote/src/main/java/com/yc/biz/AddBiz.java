package com.yc.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.mapper.SubjectMapper;
import com.yc.po.AddSubjectBean;
import com.yc.po.Option;

@Service("addBiz")
public class AddBiz {
    @Autowired
    private SubjectMapper mapper;
    public AddSubjectBean addSubject(AddSubjectBean subject){
    	mapper.insertSubject(subject);
    	return subject;
    }
    public void addOption(Option option){
    	mapper.insertOption(option);
    }
    public void add(AddSubjectBean subject){
    	//1、插入subject
    	subject=addSubject(subject);
    	//2、插入所有的option
    	List<String> options=subject.getOptions();
    	for(int i=0;i<options.size();i++){
    		Option option=new Option(options.get(i),subject.getSub_id(),i+1);
    		addOption(option);
    	}
    }
}
