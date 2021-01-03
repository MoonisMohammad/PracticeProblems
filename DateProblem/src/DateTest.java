
public class DateTest {

	public static void main(String args[])
	{	
		Person head = new Person("head","M");
		Person dump = new Person("dump","M");
		
		
		Person J = new Person("Jon","M");
		Person C = new Person("Carl","M");
		
		Person A = new Person("Annie","F");
		Person V = new Person("Victoria","F");
		
		J.addGirlRelationship(1, A, 1);
		J.addGirlRelationship(2, V, 1);
		
		C.addGirlRelationship(1, V, 2);
		
		head.addGirlRelationship(1, J, 1);
		head.addGirlRelationship(1, C, 1);
		
		A.addGirlRelationship(1, dump, 1);
		V.addGirlRelationship(1, dump, 1);
		
		
		
		
		Solution sol = new Solution();
		sol.solve(head, dump);
		
		
	}
}
