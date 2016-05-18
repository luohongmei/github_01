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
    private JavaMailSender javaMailSender;//�ʼ�����ý��
	   @Test
         public void test01(){
        	 MimeMessage mm=javaMailSender.createMimeMessage();
        	 try {
				MimeMessageHelper smm=new MimeMessageHelper(mm,true);
				smm.setFrom("15074781247@163.com");//�ʼ�������
				smm.setTo("1165820264@qq.com");//�ʼ�������
				smm.setSubject("����һ��ͼƬ");//�ʼ�����
				smm.setText("������ŷ��÷<br>"+"<a href='http://www.baidu.com'>ȥ�ٶ�����</a><br>"+
				"<img src='cid:pic123'/>",true);//�ʼ�����
				FileSystemResource fsr=new FileSystemResource("f:/a.PNG");//�����ļ�ϵͳ��Դ
				smm.addInline("pic123",fsr);//���������ļ�ϵͳ��
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 javaMailSender.send(mm);
        	 System.out.println("�ʼ����ͳɹ�");
         }
}
