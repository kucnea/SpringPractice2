package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console") //component 이름 지정
public class InlineExamConsole implements ExamConsole {

//	@Autowired(required = false)
	@Autowired
//	@Qualifier("exam1")
	private Exam exam;
	
	
	public InlineExamConsole() {
		System.out.println("생성자");
	}
	
//	@Autowired
	public InlineExamConsole(@Qualifier("exam1")Exam exam) {
		System.out.println("오버로드 생성자");
		this.exam = exam;
	}



	@Override
	public void print() {
		if(exam==null) {
			System.out.printf("total is %d, avg is %f\n",0,0.0);
		}
		else {
			System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());	
		}
		

	}


//	@Autowired
//	@Qualifier("exam1")
	@Override
	public void setExam(Exam exam) {
		System.out.println("세터");
		this.exam = exam;
		
	}

}
