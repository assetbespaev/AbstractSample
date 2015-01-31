package com.first.sample;

public abstract class MyAbstractProcess {

	public void process() {
		stepBefore();
		action("action!!!\n");
		stepAfter();
	}

	private void stepAfter() {
		System.out.println("AFTER");
	}

	public abstract void action(String msg);

	private void stepBefore() {
		System.out.println("BEFORE\n");
	}
}
