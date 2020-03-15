package org.pivanchev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		
		((ConfigurableApplicationContext)context).close();
		
	}

}
