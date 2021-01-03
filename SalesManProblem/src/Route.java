import java.util.ArrayList;

public class Route {
	public int distance;
	public ArrayList<Node> nodes;
	public boolean allVisit;

	public Route(ArrayList<Node> n,ArrayList<Node> allNodes) {

		nodes=n;
		distance = distanceCalculatar(n);
		allVisit =allVisitCheck( allNodes);

	}

	public int distanceCalculatar(ArrayList<Node> route) {

		int distance=0;

		for(int i = 0;i<route.size()-1;i++) {

			distance = distance + route.get(i).distanceFrom(route.get(i+1));

		}
		return distance;
	}


	public boolean allVisitCheck(ArrayList<Node> allNodes) {

		if (nodes.size() != allNodes.size()) {

			return false;
		}
		
			return true;
			
	}

	public void print() {

		for(Node n :nodes) {

			System.out.print(n.name + ",");

		}


		if(allVisit) {
			System.out.print(":Distance=" + distance+"\n");
		}else {
			System.out.print(":Distance=" + distance+" X"+"\n");
		}

	}
}