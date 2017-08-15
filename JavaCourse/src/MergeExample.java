import java.util.Arrays;

public class MergeExample {

	
	public static void main(String[] args){
		
		Integer [] a = {10,20,90,40,15,25,35,45};
		Integer []aux = new Integer[a.length];
		sort(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	static public void sort(Comparable[]a){
		Comparable [] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length -1);
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <=lo) {
			return;
		}
		
		int mid = lo + (hi-lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge (a, aux, lo, hi, mid);
		
	}

	static public void merge(Comparable [] a, Comparable[] aux, int lo, int hi, int mid){
		for(int i=lo;i<=hi;i++){
			aux[i] = a[i];
		}
		
		int i=lo;
		int j=mid+1;
		
		for(int k=lo;k<=hi;k++){
			if (i>mid){
				a[k] = aux[j++];
			}
			else if (j>hi){
				a[k] = aux[i++];
			}
			else if ( aux[j].compareTo(aux[i]) < 0){
				a[k] = aux[j++];
			}
			else{
				a[k] = aux[i++];
			}
		}
	}
}
