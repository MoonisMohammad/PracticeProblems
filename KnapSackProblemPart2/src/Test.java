import java.util.ArrayList;

public class Test {

	public static void main(String args[])
	{	
		ArrayList<Item> testList =  new ArrayList<Item>();
		ArrayList<Integer> testList1 =  new ArrayList<Integer>();
		ArrayList<Integer> testList2 =  new ArrayList<Integer>();
		int randomListLength = 25;

		for(int i=0; i< randomListLength;i++) {

			double randNumber = Math.random()*100;
			int randomInt = (int)randNumber + 1;
			testList1.add(randomInt);

			double randNumber2 = Math.random()*100;
			int randomInt2 = (int)randNumber2 + 1;
			testList2.add(randomInt2);

			testList.add(new Item(randomInt,randomInt2));
		}

		System.out.print(testList1);
		System.out.print(testList2);

		KnapSackSolution Trial = new KnapSackSolution();
		Trial.solution(testList,100000,0);
		System.out.print(Trial.pq.poll());


	}

}
