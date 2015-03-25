package testAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testAOP/AOPBean.xml");
		inter it = (inter)ac.getBean("proxybean");
		it.saywhat("select * from user where userId =  '"+"wohaha"+"' ","AAAAA");
	}
}
