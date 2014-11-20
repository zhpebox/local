package testIOC;

import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testIOC/IOCBean.xml");
		bean model = (bean)ac.getBean("am");
		//输出显示
		System.out.println("uid = "+model.getUid());
		System.out.println("uname = "+model.getName());
		System.out.println("friend = "+model.getFriend().getName());
		
		for(String e : model.getSteam()) System.out.print("steam is = "+e+" ");
		System.out.println();
		
		for(String e : model.getSlist()){
			System.out.print("slist is "+e+" ");
		}
		System.out.println();
		
		for(String e : model.getSset()){
			System.out.print("sset is "+e+" ");
		}
		System.out.println();
		
		Iterator<Entry<String,String>> it = model.getSmap().entrySet().iterator();
		while(it.hasNext()){
			Entry<String,String> e =it.next();
			System.out.print("map is "+e.getKey()+"  = "+e.getValue()+"   "+e.getClass());
		}
	}
}
