package spring.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam(1,1,1,1);
		
//		NewlecExam 이 구현하고 있는 인터페이스 모두를 인자로해야함
//		Exam proxy = Proxy.newProxyInstance(A,B,C);
//		A : 객체 클래스
//		B : A가 구현하고 있는 인터페이스를 모두 인자로 함
//		C : new InvocationHandler() {} 로 이게 aop 그 cross-cutting Concern 이 들어감
				
		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						long start = System.currentTimeMillis();
						
						Object result = method.invoke(exam, args);
						
						long end = System.currentTimeMillis();
						
						String message = (end - start) + "ms시간이 걸렸습니다.";
						System.out.println(message);
						
						return result;
					}
				});
				
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("total is %f\n",proxy.avg());
		
	}

}
