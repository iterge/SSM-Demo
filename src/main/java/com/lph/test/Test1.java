package com.lph.test;

public class Test1 {
	public void method(Long l){
		System.out.println(l);
	}
	public void method(float f){
		System.out.println(f);
	}
	public static void main(String[] args) {
		/*Test1 t = new Test1();
		t.method(1.2f);
		t.method(8);*/
		char c = 'a';
		int n = 5;
		float f = 3.6f;
		double d = 1.2;
		f = f+n+c;
		System.out.println(d);
	}
}
