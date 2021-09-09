package spring.aop2.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
//	throwingAdvice는 무엇이 던져질지 알 수 없기때문에 구현할 메소드가 정해져있지 않음. 아래는 예시
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생하였습니다. : "+e.getMessage());
	}
}
