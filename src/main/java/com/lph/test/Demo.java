package com.lph.test;

public class Demo {
	public static void main(String[] args) {
		String str = "asdfghjkl";
		//System.out.println(str.substring(1)+str.charAt(0));
		//System.out.println(str);
		//System.out.println(reverse(str));
		int[] arr = {1,20,3,4,18,5};
		arr = bubbling(arr);
		for(int i = 0;i <arr.length;i++){
			System.out.println(arr[i]+".");
		}
	}
	public static String reverse(String str){
		if(str==null||str.length() <= 1){
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static int[] getSorte(int[] arr){
		for(int i=arr.length-1;i > 0;i--){
			for(int j=0;j<i;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					//System.out.println(arr[i]+" "+i+"..."+arr[j]+" "+j);
				}
				//System.out.println("....");
			}
		}
		return arr;
	}
	//冒泡排序
	public static int[] bubbling(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr.length-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
