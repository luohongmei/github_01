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
    private JavaMailSender javaMailSender;//�����ʼ���ý��
	@Test
	public void test(){
		SimpleMailMessage smm=new SimpleMailMessage();//�ʼ���Ϣ����
		smm.setFrom("15074781247@163.com");//�ʼ�������
		smm.setTo("1165820264@qq.com");//�ʼ�������
		smm.setSubject("��ð�");//�ʼ�����
		smm.setText("Hi,Spring�ʼ����ͺü�");//�ʼ�����
		javaMailSender.send(smm);//�����ʼ�
		System.out.println("�ʼ����ͳɹ�"); 
	}

}
