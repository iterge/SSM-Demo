package com.lph.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Demo1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		/*System.out.println(cal.getTime());
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getWeekYear());*/
		//cal.add(Calendar.YEAR,-1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));//获取某月最大天数
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTimeInMillis()));
	}
}
