package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import teacher.teacher;

public class app {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		teacher teacher = (teacher)context.getBean("teacherbean");

	
		teacher.showMessage();
		teacher.showTeachersStudent();
		
	}

}
