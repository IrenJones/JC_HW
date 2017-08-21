package cw20170821;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<String> ss = () ->{
			return "hetalia";
		};
		
		Supplier<String> ss2 = () -> "hetalia";
		
		Supplier <LocalDate> ld = ()-> LocalDate.now();
		Supplier <LocalDate> ld2 = LocalDate::now;
		
		System.out.println(ld2.get());
		
		Supplier <LocalDate> ld3 = new Supplier<LocalDate>(){

			@Override
			public LocalDate get() {
				return LocalDate.now();
			}
			
		};
		
		Supplier <ArrayList<String>> aS = () -> new ArrayList<>();
		Supplier <ArrayList<String>> aS2 = ArrayList::new;
		
		ArrayList<String> al = aS.get();

	}

}
