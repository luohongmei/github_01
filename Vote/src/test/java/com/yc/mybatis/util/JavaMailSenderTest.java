package com.yc.mybatis.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JavaMailSenderTest {
	@Autowired
    private JavaMailSender javaMailSender;//发送邮件的媒介
	@Test
	public void test(){
		SimpleMailMessage smm=new SimpleMailMessage();//邮件信息对象
		smm.setFrom("15074781247@163.com");//邮件发送者
		smm.setTo("1165820264@qq.com");//邮件接收者
		smm.setSubject("你好啊");//邮件主题
		smm.setText("Hi,Spring邮件发送好简单");//邮件内容
		javaMailSender.send(smm);//发送邮件
		System.out.println("邮件发送成功"); 
	}

}
