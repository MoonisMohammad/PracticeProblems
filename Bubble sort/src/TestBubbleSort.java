import java.util.ArrayList;

public class TestBubbleSort {

	public static void main(String args[])
	{	
		ArrayList<Integer> testList1 =  new ArrayList<Integer>();
		ArrayList<Integer> testList2 =  new ArrayList<Integer>();

		for(int i=0; i< 30;i++) {

			double randNumber = Math.random()*100;
			int randomInt = (int)randNumber + 1;
			testList1.add(randomInt);

			randNumber = Math.random()*100;
			randomInt = (int)randNumber + 1;
			testList2.add(randomInt);
		}

		BubbleSort solution =  new BubbleSort();

		System.out.println(testList1);
		System.out.println(solution.DoubleBubbleSort(testList1));

		System.out.println(testList2);
		System.out.println(solution.TripleBubbleSort(testList2));



	}
}