package com.yc.mybatis.util;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.VoteBiz;
import com.yc.po.OptionBean;
import com.yc.po.Subject;
import com.yc.po.SubjectBean;
import com.yc.po.VoteBean;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Test1 {
	
	@Autowired
	private VoteBiz biz;
	@Test
	public void test() {
		List<SubjectBean> subjects=biz.getSubject();
		System.out.println(subjects);
		assertNotNull(subjects);
	}
    @Test 
    public void test1() {
		OptionBean op=biz.findOptionsById(101);
		System.out.println(op);
		assertNotNull(op);
	}
    @Test
    public void test2() {
  		VoteBean vote=biz.getVoteBeanById(101);
  		System.out.println(vote);
  		assertNotNull(vote);
  	}
}
