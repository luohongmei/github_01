package com.yc.mybatis.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JavaMailSenderTest01 {
	@Autowired
    private JavaMailSender javaMailSender;//邮件发送媒介
	   @Test
         public void test01(){
        	 MimeMessage mm=javaMailSender.createMimeMessage();
        	 try {
				MimeMessageHelper smm=new MimeMessageHelper(mm,true);
				smm.setFrom("15074781247@163.com");//邮件发送者
				smm.setTo("1165820264@qq.com");//邮件接收者
				smm.setSubject("这是一张图片");//邮件主题
				smm.setText("我是罗欧红梅<br>"+"<a href='http://www.baidu.com'>去百度玩吗</a><br>"+
				"<img src='cid:pic123'/>",true);//邮件内容
				FileSystemResource fsr=new FileSystemResource("f:/a.PNG");//创建文件系统资源
				smm.addInline("pic123",fsr);//把内容与文件系统绑定
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 javaMailSender.send(mm);
        	 System.out.println("邮件发送成功");
         }
}
