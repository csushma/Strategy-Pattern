/**
 * 
 */
package org.java.strategy;

/**
 * @author SUSHMARAVI
 *
 */
public class CannotQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I cannot quack");
	}

}
