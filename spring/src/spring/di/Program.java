package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		// ExamConsole console = new InlineExamConsole(exam); // DI

//		Spring에 지시하는 방법으로 코드 변경
//		1. Exam exam = new NewlecExam();
//		2. ExamConsole console = new GridExamConsole(exam);
//		3. console.setExam(exam);

//		지시서를 넘겨주는 애 = ApplicationContext
//		- ClassPathXml~ = 클래스 내부의 xml파일 지정 
//		- FileSystemXml~ =로컬 저장 
//		- XmlWeb~ =Web url
//		- AnnotationConfig~ = 파일이 아닌 Annotation스캔 

		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context =new AnnotationConfigApplicationContext(AppDiConfig.class);
		
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); // 이거 꺼내줘, 형변환 필요
		ExamConsole console = context.getBean(ExamConsole.class); // 이 타입 꺼내줘

		console.print();

//		List<Exam> exams = (List<Exam>) context.getBean("exams"); // ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));		

//		for(Exam e :exams) {
//			System.out.println(e);
//		}
	}

}
