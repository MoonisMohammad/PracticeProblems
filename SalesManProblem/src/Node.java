import java.util.ArrayList;

public class Node {
	public String name;
	public ArrayList<Node> adjacents =  new ArrayList<Node>();
	public ArrayList<Path> paths =  new ArrayList<Path>();

	public Node() {}

	public Node(String n) {name = n;}

	public ArrayList<Node> adjacents() {return adjacents;}

	public String print() {return name;}



	public void addAdj(Node n,int distance) {

		adjacents.add(n);
		paths.add(new Path(distance, this,n));

	}
	

	public int distanceFrom(Node destination) {

		for(Path n:paths) {

			if(n.to == destination) {

				return n.distance;}

		}

		return 0;}

	}
