package com.example.dummy;

import java.lang.reflect.Field;

/**
 * Created by BoBinLee on 2015. 10. 26..
 */
public class DummyUtils {

	public static void setAutoMatch(Object obj){

		Field[] fields = obj.getClass().getDeclaredFields();

		for(Field field : fields){
			field.setAccessible(true);
			Dummy dummy = field.getAnnotation(Dummy.class);

			try {
				field.set(obj, dummy.value());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
}
