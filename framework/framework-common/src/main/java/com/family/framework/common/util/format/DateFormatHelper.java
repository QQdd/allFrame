package com.family.framework.common.util.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatHelper {
	//可以使用注解的格式化
	private DateFormatHelper(){}
	private final static String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
	public static String long2str(long time){
		Date d = new Date(time);
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.format(d);
	}
/*	public static long str2long(String str) throws ParseException{
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.parse(str).getTime();
	}*/
}
