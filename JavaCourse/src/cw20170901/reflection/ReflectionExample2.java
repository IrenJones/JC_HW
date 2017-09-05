package cw20170901.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class ReflectionExample2 {

	public static void main(String[] args) {
		
		Object o = new Object(){
			public void one(){
				System.out.println("my one!");
			}
		};
		
		
		process (o);
		
		Object o1 = new Object();
		
		
		process (o1);

	}

	private static void process(Object object) {
		Class<? extends Object> clazz = object.getClass();
		Method m = null;
		try {
			m = clazz.getMethod("one", null);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Optional.ofNullable(m).ifPresent( mt -> {
			
			try {
				mt.invoke(object, null);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
