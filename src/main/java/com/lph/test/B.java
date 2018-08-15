package com.lph.test;

public class B extends A{
	public B(){
		System.out.println("B构造函数");
	}
	{
		System.out.println("B构造代码块");
	}
	static{
		System.out.println("B静态代码块");
	}
	public static void main(String[] args) {
		/*A ab = new B();
		ab = new B();*/
		A b = new B();
		B b1 = new B();
	}
}
