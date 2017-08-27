package cw20170825;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseTraider {

	public static void main(String[] args) {


		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Transaction> tr = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high)
		
		List<Transaction> trFirst =  tr.stream().
				filter((t) -> 2011 == t.getYear()).
				sorted(Comparator.comparing(Transaction::getValue)).
				collect(Collectors.toList());
		System.out.println(trFirst);
		
		// 2. What are all the unique cities where the traders work
		
		/*tr.stream().
		map(t -> t.getTraider()).
		map(t->t.getCity()).
		collect(Collectors.toSet()).
		stream().
		collect(Collectors.toList()).
		forEach(System.out::println);
		
		*/
		
		tr.stream().
		map(t -> t.getTrader()).
		map(t->t.getCity()).
		distinct().
		collect(Collectors.toList()).
		forEach(System.out::println);
		
		// 3. Find all traders from Cambridge and sort them by name
		
		tr.stream().
		map(Transaction::getTrader).
		filter((t) -> t.getCity().equals("Cambridge")).
		sorted(Comparator.comparing(Trader::getName)).
		distinct().
		collect(Collectors.toList()).
		forEach(System.out::println);
		
		// 4. Return a string of all traders' names sorted alph
		
		String res = tr.stream().
		map(t->t.getTrader()).
		distinct().
		map(s->s.getName()).
		sorted().
		collect(Collectors.joining(", "));
		System.out.println(res);
		
		String res1 = tr.stream().
				map(t->t.getTrader()).
				distinct().
				map(s->s.getName()).
				sorted().
				reduce("", (s, t) ->s + " " + t);
		System.out.println(res1);
		
		// 5. Are any traders based in Milan?
		
		boolean res2 = tr.stream().
				map(t-> t.getTrader()).
				distinct().
				anyMatch(t -> t.getCity().equals("Milan"));
		System.out.println(res2);
		
		// 6. Print all transactions' values from the traders living in Cambridge
		
		tr.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map( t-> t.getValue()).forEach(System.out::println);
		
		
		// 7. What's the highest value of all the transactions?
		
		tr.stream().map(t -> t.getValue()).reduce(Integer::max).ifPresent(System.out::println);
		System.out.println(tr.stream().map(t -> t.getValue()).max(Integer::compare));
		
		// 8. Find the transaction with the smallest value
		tr.stream().min(Comparator.comparing(Transaction::getValue)).ifPresent(System.out::println);
	}

}
