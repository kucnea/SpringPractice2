package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class program {

	public static void main(String[] args) {
		
//		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(NewlecDIConfig.class, OtherConfig.class); 여러개도 가능
		context.register(NewlecDIConfig.class);
		context.refresh();
		
//				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
	}

}
 