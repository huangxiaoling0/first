package com.briup.web.Converter ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter 
	implements Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("date.............toString()");
		Date date=null;
				try {
					date=sdf.parse(arg0);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return date;
	}

}




