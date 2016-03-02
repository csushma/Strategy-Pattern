/**
 * 
 */
package org.java.strategy;

/**
 * @author SUSHMARAVI
 *
 */
public class CannotFly implements FlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}

}
