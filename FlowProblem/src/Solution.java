import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public void solution(Junction head,Junction destination) {

		ArrayList<Junction> seen = new ArrayList<Junction>();
		ArrayList<Pipe> pipes =  new ArrayList<Pipe>();
		ArrayList<Route> routes = new ArrayList<Route>();
		routes.add(new Route());

		while(!routes.isEmpty() ) {
			routes.clear();			
			routesFinder( head, destination, seen, pipes, routes);
			for(Route r: routes) {

				r.print();
			}
		}
	}





	public void routesFinder(Junction head,Junction destination,ArrayList<Junction> seen,ArrayList<Pipe> pipes,ArrayList<Route> routes) {

		if(destination.name.equals(head.name)){
			
			routes.add(new Route(pipes));
			
			return;}


		if(seen.contains(head)) {return;}


		for(Pipe p : head.pipesPositive) {

			if(p.posAvailable) {
				ArrayList<Pipe> pipes2 = new ArrayList<Pipe>();
				pipes2 = clone(pipes);
				pipes2.add(p);

				seen.add(head);


				routesFinder(p.to(),destination,seen,pipes2,routes);

				seen.remove(head);}}

		for(Pipe p : head.pipesNegetive) {

			if(p.negAvailable) {
				ArrayList<Pipe> pipes3 = new ArrayList<Pipe>();
				pipes3 = clone(pipes);
				pipes3.add(p);

				seen.add(head);


				routesFinder(p.from(),destination,seen,pipes3,routes);

				seen.remove(head);}}

	}

	public ArrayList<Pipe> clone(ArrayList<Pipe> I) {

		ArrayList<Pipe> Items = new ArrayList<Pipe>();

		for(int i = 0;i<I.size();i++){

			Items.add(I.get(i));}

		return Items;
	}




}
