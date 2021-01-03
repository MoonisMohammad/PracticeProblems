import java.util.Scanner;

public class DiagonalProblemTest {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() -1;
		DiagonalProblem Trial = new DiagonalProblem();
		Trial.solution(n);
	}
}
