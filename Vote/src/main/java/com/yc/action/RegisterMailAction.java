package com.yc.action;

import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionContext;
@Controller("registerMailAction")
public class RegisterMailAction {
	      @Autowired
          private JavaMailSender javaMailSender;
          public String sendEmail(){
        	  MimeMessage mm=javaMailSender.createMimeMessage();//邮件信息类
        	  try {
				MimeMessageHelper smm=new MimeMessageHelper(mm,true);
				smm.setFrom("");
				smm.setTo("");
				smm.setSubject("");
				String actionId=UUID.randomUUID().toString();
				String activePath="http://localhost:8080/Vote/user_active.action?actionId="+actionId;//激活路径
				smm.setText("激活账号:<a href='"+activePath+"'>"+activePath+"</a>",true);
				javaMailSender.send(mm);
				ActionContext.getContext().getSession().put("actionId",actionId);
				return "success";
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  return "fail";
          }
}
