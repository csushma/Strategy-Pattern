/**
 * 
 */
package org.java.strategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SUSHMARAVI
 *
 */
public class DuckSimulator {
	
	public static void main(String[] args) {
	/*	Duck mallard = new MallardDuck();
		mallard.performfly();
		mallard.performquack();
		mallard.display();
		mallard.swim(); */
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Duck duck = (Duck) context.getBean("duck2");
		duck.display();
		duck.performfly();
		duck.performquack();
		duck.swim();
	}

}
