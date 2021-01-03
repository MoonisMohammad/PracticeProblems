

public class TestFlow {

	public static void main(String args[])
	{	
	Junction A = new Junction("A");
	Junction B = new Junction("B");
	Junction C = new Junction("C");
	Junction E = new Junction("E");

	
	A.addPipe(new Pipe(A,B,3));
	A.addPipe(new Pipe(A,C,2));

	B.addPipe(new Pipe(B,C,3));
	B.addPipe(new Pipe(B,E,2));
	
	C.addPipe(new Pipe(C,E,3));

	
	
	Solution sol = new Solution();
	sol.solution(A, E);
	
	System.out.println(E.flowDelivered);
	


	}
}
