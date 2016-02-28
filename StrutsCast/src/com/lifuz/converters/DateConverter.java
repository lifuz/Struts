package com.lifuz.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * Date类型数据转换器
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月28日
 */
@SuppressWarnings("rawtypes")
public class DateConverter extends StrutsTypeConverter {
	
	private DateFormat df;
	
	public DateConverter() {
		df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	}

	/**
	 * 从String型转换成Date型
	 */
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		
		if(arg2 == Date.class) {
			if (arg1 != null && arg1.length > 0) {
				String value = arg1[0];
				try {
					return df.parseObject(value);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//转换失败，则返回arg1
		return arg1;
	}

	/**
	 * 从Date型转换成String型
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		
		if (arg1 instanceof Date) {
			Date date = (Date) arg1;
			
			return df.format(date);
		}
		
		return null;
	}

}
