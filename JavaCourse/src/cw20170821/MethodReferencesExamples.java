package cw20170821;

import java.util.function.Function;

public class MethodReferencesExamples {

	public static void main(String[] args) {
		Function<String, Integer> slength = s->s.length();
		Function<String, Integer> slength1 = String::length;
		
		Runnable r = () -> Thread.currentThread().getName();
		Runnable r2 = Thread.currentThread()::getName;
	}

}
