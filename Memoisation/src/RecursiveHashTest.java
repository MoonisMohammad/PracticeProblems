import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class RecursiveHashTest {
	
	public static void main(String args[])
	{

		Instant start ;

		Instant end ;

		Duration timeElapsed;
		FibonachiRecursiveHash TestRec = new FibonachiRecursiveHash();

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		start = Instant.now();
		
		System.out.println(TestRec.solution(N));

		end = Instant.now();

		timeElapsed = Duration.between(start, end);

		System.out.println("Time taken Recursively: "+ timeElapsed.toMillis() +" milliseconds");



	}


}
