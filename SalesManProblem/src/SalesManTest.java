import java.util.ArrayList;

public class SalesManTest {

	public static void main(String args[])
	{	
		ArrayList<Node> allNodes =  new ArrayList<Node>();

		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node E = new Node("E");
		Node D = new Node("D");
		Node F = new Node("F");

		allNodes.add(A);
		allNodes.add(B);
		allNodes.add(C);
		allNodes.add(E);
		allNodes.add(F);
		allNodes.add(D);

		A.addAdj(B,10);
		A.addAdj(C,2);
		A.addAdj(D,12);

		B.addAdj(E,1);
		B.addAdj(C, 1);

		C.addAdj(E,10);
		C.addAdj(F,1);
		C.addAdj(D,5);
		C.addAdj(B, 1);

		D.addAdj(C,5);
		D.addAdj(F, 10);

		F.addAdj(E,4);
		F.addAdj(C,1);
		F.addAdj(D,10);



		Route sol ;

		Solution solver = new Solution() ;

		sol = solver.solution(A,E,allNodes);



		System.out.print("Best Path is = ");
		sol.print();


	}

}
