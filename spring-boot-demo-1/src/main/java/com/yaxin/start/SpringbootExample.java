package com.yaxin.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author liruimin
 * @SpringBootApplication������Spring�����ɨ���Spring Boot���Զ����ù��ܡ�
 * ʵ������������ע�������һ�𡣷ֱ���@Configuration��@ComponentScan��@EnableAutoConfiguration��
 * ��ʹ�õĹ����У�����Ӧ�ý�springboot����������������
 */
@SpringBootApplication
public class SpringbootExample {
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootExample.class, args);
	}
}
