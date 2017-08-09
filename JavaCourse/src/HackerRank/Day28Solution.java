package HackerRank;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pattern p = Pattern.compile(".+@gmail\\.com$");
		
		int n = in.nextInt();
		List <String> names = new LinkedList<>();
		for (int i=0;i<n;i++){
			String name = in.next();
			String email = in.next();
			Matcher m = p.matcher(email);
			if( m.find() ) {
				names.add(name);
			}
		}
		
		Collections.sort(names);
		
		for (String name : names){
			System.out.println(name);
		}
		
		in.close();
	}

}
