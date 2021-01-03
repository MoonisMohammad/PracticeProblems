import java.util.ArrayList;

public class MergeSort {

	public ArrayList<Integer> Merge(ArrayList<Integer> array){
		ArrayList<Integer> List1 =  new ArrayList<Integer>();
		ArrayList<Integer> List2 =  new ArrayList<Integer>();

		int n = array.size();
		int n1 = 0;

		if(n==1) {
			return array;
		}

		if(n%2 == 0) {
			n1 = n/2;			
		} else if (n%2 != 0) {
			n1 = (n-1)/2;
		}

		for(int i =0 ; i<n;i++) {
			if(i<n1) {
				List1.add(array.get(i));
			} else {
				List2.add(array.get(i));
			}
		}

		List1  = Merge(List1);
		List2 = Merge(List2);

		return Sort(List1,List2);
	}

	private ArrayList<Integer> Sort(ArrayList<Integer> a ,ArrayList<Integer> b){

		ArrayList<Integer> SortedList =  new ArrayList<Integer>();


		while(!a.isEmpty() && !b.isEmpty()) {

			if (a.get(0)>=b.get(0) ) {

				SortedList.add(b.get(0));
				b.remove(0);
			} else {
				SortedList.add(a.get(0));
				a.remove(0);
			}
		}

		while(!a.isEmpty()) {
			SortedList.add(a.get(0));
			a.remove(0);
		}

		while(!b.isEmpty()) {
			SortedList.add(b.get(0));
			b.remove(0);
		}
		
		return SortedList;
	
	

	}
}
