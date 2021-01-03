
import java.util.*;

public class Solution {

	public Route solution(Node head,Node destination, ArrayList<Node> allNodes) {


		ArrayList<Node> seen = new ArrayList<Node>();
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Route> routes  = new ArrayList<Route>();
		routesFinder(head,seen,destination,nodes,routes,allNodes);

		PriorityQueue<Route> pq = new PriorityQueue<Route>(new RouteComperator());

		for(Route r: routes)
		{
			if(r.allVisit == true) {
				pq.add(r);}

			r.print();
		}

		return pq.poll();
	}


	public void routesFinder(Node head,ArrayList<Node> seen,Node destination,ArrayList<Node> nodes,ArrayList<Route> routes,ArrayList<Node> allNodes ) {

		if(destination == head){
			nodes.add(head);
			routes.add(new Route(nodes,allNodes));
			return;}


		if(seen.contains(head)) {return;}


		for(Node adjacent : head.adjacents()) {

			ArrayList<Node> path2 = new ArrayList<Node>();
			path2 = clone(nodes);
			path2.add(head);

			seen.add(head);

			routesFinder(adjacent,seen,destination,path2,routes,allNodes);

			seen.remove(head);

		}

		return;

	}

	public ArrayList<Node> clone(ArrayList<Node> I) {

		ArrayList<Node> Items = new ArrayList<Node>();

		for(int i = 0;i<I.size();i++){

			Items.add(I.get(i));}

		return Items;
	}

}


