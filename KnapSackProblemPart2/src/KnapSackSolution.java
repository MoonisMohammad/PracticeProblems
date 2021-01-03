import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class KnapSackSolution {

	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new IntegerComparator());

	public 	void solution(ArrayList<Item> Items, int weight, int value) {

		if(weight <0) {
			return ;}

		if(Items.isEmpty()) {

			pq.add(value);
			return ;}	

		int n = Items.size();

		int weight2 = weight - Items.get(n-1).getWeight();
		int value2 = value + Items.get(n-1).getValue();

		ArrayList<Item> Items2 = new ArrayList<Item>();
		Items2 = clone(Items);
		Items2.remove(n-1);

		solution(Items2,weight2,value2);

		ArrayList<Item> Items3 = new ArrayList<Item>();
		Items3 = clone(Items);
		Items3.remove(n-1);

		solution(Items3,weight,value);

	}

	public ArrayList<Item> clone(ArrayList<Item> I) {

		ArrayList<Item> Items = new ArrayList<Item>();

		for(int i = 0;i<I.size();i++){

			Items.add(I.get(i));}

		return Items;
	}

}
