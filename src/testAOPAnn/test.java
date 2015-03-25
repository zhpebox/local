 package testAOPAnn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testAOPAnn/AOPBean.xml");
		intera it = (intera)ac.getBean("hellobb");
		it.sayBB("zhp",12);
		inter is = (inter)ac.getBean("hello");
		System.out.println(it.toString());
	}
}
