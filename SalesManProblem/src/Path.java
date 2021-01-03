
public class Path {
	int distance;
	public Node from;
	public Node to;


	public Path(int w, Node f,Node t) {

		distance = w;
		from =f;
		to = t;}

	public int distance() {return distance;	}

}

