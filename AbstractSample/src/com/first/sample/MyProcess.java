package com.first.sample;

public class MyProcess extends MyAbstractProcess {

	@Override
	public void action(String msg) {
		System.out.println("My " + msg);
	}

}
