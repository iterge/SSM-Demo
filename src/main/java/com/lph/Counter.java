package com.lph;


class Counter {
	private static int count = 0;
	public int increment(){
		return count++;
	}
	public int anment(){
		return ++count;
	}
}
