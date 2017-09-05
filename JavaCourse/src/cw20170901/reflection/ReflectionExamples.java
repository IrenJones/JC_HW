package cw20170901.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples {

	public static void main(String[] args) {
		
		// get link to the class
		//Class<ReflectionExamples> clazz = ReflectionExamples.class;
		
		Class<Sample> clazz = Sample.class;

		Constructor<?> [] constructors = clazz.getConstructors();
		
		
		for (Constructor<?> cons : constructors){
			System.out.println(cons);
		}
		
		try {
			Sample sample = clazz.newInstance();
			Method m = clazz.getMethod("getInt", null);
			
			System.out.println(m.invoke(sample, null));
			
		} catch (InstantiationException | IllegalAccessException | 
				NoSuchMethodException | SecurityException | 
				IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}

class Sample {
	static int MAX = 10;
	static{
		System.out.println("static simple init");
	}
	
	public int getInt(){
		return MAX;
	}
}
