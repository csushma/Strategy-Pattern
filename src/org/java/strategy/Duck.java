/**
 * 
 */
package org.java.strategy;

/**
 * @author SUSHMARAVI
 *
 */
public class Duck {

	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	Duck duckType;
	
	public Duck getDuckType() {
		return duckType;
	}

	public void setDuckType(Duck duckType) {
		this.duckType = duckType;
	}

	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}

	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public QuackBehavior getQuackbehavior() {
		return quackbehavior;
	}

	public void setQuackbehavior(QuackBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}

	public void performfly(){
		flybehavior.fly();
	}
	
	public void performquack(){
		quackbehavior.quack();
	}
	
	public void display(){
		duckType.display();
	}
	
	public void swim(){
		System.out.println("I am swimming");
	}
}
