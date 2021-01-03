import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class MergeTest {

	public static void main(String args[])
	{	
				
		Instant start ;
		Instant end ;
		Duration timeElapsed;
		
		ArrayList<Integer> testList =  new ArrayList<Integer>();
		int randomListLength = 200000;
			

		for(int i=0; i< randomListLength;i++) {

			double randNumber = Math.random()*100;
			int randomInt = (int)randNumber + 1;
			testList.add(randomInt);
		}
		
		System.out.println(testList);

		MergeSort Trial = new MergeSort();
		
		start = Instant.now();
		
		System.out.println(Trial.Merge(testList));
		
		end = Instant.now();
		timeElapsed = Duration.between(start, end);
		System.out.println("Time taken double merge: "+ timeElapsed.toMillis() +" milliseconds");


	}
}
