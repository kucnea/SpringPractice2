package spring.aop2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop2.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				new ClassPathXmlApplicationContext("spring/aop2/setting.xml");		
		
		Exam proxy = (Exam) context.getBean("proxy");
		
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("total is %f\n",proxy.avg());
		
		
		
	}

}
