package homework20170710;

public class UseStringLinkedList {
	
	public static void main(String[] args) {
		
		StringLinkedList list = new StringLinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		list.add("yo1");
		System.out.println(list.remove("yo1"));
		list.add("yo2");
		System.out.println(list);
		String removed = list.remove(0);
		System.out.println(removed);
		list.add("yo2");
		list.add(removed);;
		System.out.println(list);
		/*list = new StringLinkedList();
		
		System.out.println(list.remove("two"));
		
		list.add("One");
		System.out.println(list.remove("two"));
		System.out.println(list.remove("One"));
		
		System.out.println(list);
		*/
	}

}
