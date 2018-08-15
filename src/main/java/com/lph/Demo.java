package com.lph;

public class Demo {
	public static void main(String[] args) {
		int i = 2;
		System.out.println(get(i));
	}
	public static int get(int i){
		int result = 0;
		switch(i){
		case 1:
			result = result+i;
		case 2:
			result = getI(i);
			break;
		case 3:
			result = result + i*3;
		}
		return result;
	}
	public static int getI(int x){
		return 2*x;
	}
}
