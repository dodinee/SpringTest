package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;


@Component("console")
public class GridExamConsole implements ExamConsole {

//	@Autowired(required = false) // bean optional 
	@Autowired
//	@Qualifier("exam2")
	private Exam exam;

	public GridExamConsole() {
	}

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		if (exam == null) {
			System.out.println("exam is null");
		} else {
			System.out.println("----------------------------------");
			System.out.println("|   	total	  |	    avg 	 |");
			System.out.println("----------------------------------");
			System.out.printf("|	 %3d  	|    %3.2f	   |\n", exam.total(), exam.avg());
			System.out.println("----------------------------------");
		}
	}

//	@Autowired = 자동으로 바인딩 해줌. 기준은 Class명 
//	꼭 같은 Class가 아니어도 참조가능한 Class라면 바인딩해줌
//	만약 같은 Class의 Bean이 여러 개 있다면, @Qualifier로 id명을 지정해주면 됨 
//	@Autowired
//	@Qualifier("exam2")
//	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
