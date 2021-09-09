package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan({"spring.di.ui", "spring.di.entity"})
@Configuration
public class NewlecDIConfig {
	
	@Bean
	public Exam exam() { //exam()이 xml 지시서에서 id와 같은 역할
		return new NewlecExam();
	}
	
}
