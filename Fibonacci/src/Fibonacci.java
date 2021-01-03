import java.util.ArrayList;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class Fibonacci { 

	public static void main(String args[])
	{

		Instant start ;

		Instant end ;

		Duration timeElapsed;



		FibonachiRecursive TestRec = new FibonachiRecursive();

		FibonachiIterative TestIt = new FibonachiIterative();



		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		start = Instant.now();
		
		System.out.println(TestRec.solution(N));

		end = Instant.now();

		timeElapsed = Duration.between(start, end);

		System.out.println("Time taken Recursively: "+ timeElapsed.toMillis() +" milliseconds");



		start = Instant.now();

		System.out.println(TestIt.solution(N));

		end = Instant.now();

		timeElapsed = Duration.between(start, end);

		System.out.println("Time taken Iteratively: "+ timeElapsed.toMillis() +" milliseconds");

	}



}



//FibonachiRecursive

class FibonachiRecursive {



	public int solution(int n) {

		

		//System.out.println("call for :" + n);



		if(n==0) {return 0;}



		if(n==1) {return 1;}



		return solution(n - 1) + solution(n - 2);



	}

}



class FibonachiIterative {



	public int solution(int n) {

		

		if(n <= 1) {

			return n;

		}

		int fib = 1;

		int prevFib = 1;

		

		for(int i=2; i<n; i++) {

			int temp = fib;

			fib+= prevFib;

			prevFib = temp;

		}

		return fib;

	}

}