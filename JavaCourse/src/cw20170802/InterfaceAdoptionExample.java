package cw20170802;

public class InterfaceAdoptionExample {

}


interface Makeable<T>{
	void doSomethigWith(T a);
}


class D{
	
}

class E{
	
}

class Z implements Makeable<D>{

	@Override
	public void doSomethigWith(D d) {
		
	}

	
}

class Y implements Makeable<E>{

	@Override
	public void doSomethigWith(E e) {
		
	}
	
}