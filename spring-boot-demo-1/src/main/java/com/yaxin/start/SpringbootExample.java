package com.yaxin.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author liruimin
 * @SpringBootApplication开启了Spring的组件扫描和Spring Boot的自动配置功能。
 * 实际上它将三个注解组合在一起。分别是@Configuration、@ComponentScan、@EnableAutoConfiguration。
 * 在使用的过程中，我们应该将springboot的启动类放在最外层
 */
@SpringBootApplication
public class SpringbootExample {
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootExample.class, args);
	}
}
