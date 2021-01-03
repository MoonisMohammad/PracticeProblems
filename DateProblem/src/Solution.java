import java.util.ArrayList;

public class Solution {

	public void solve(Person head,Person dump) {

		ArrayList<Relationship> seen = new ArrayList<Relationship>();
		ArrayList<Relationship> path = new ArrayList<Relationship>();

		pathFound check = new pathFound();

		relationFinder(head,dump,seen,path,check);

		while(check.isFound()!= false) {

			check.reset();
			relationFinder(head,dump,seen,path,check);

		}

		seen.clear();
		path.clear();
		
		print(head,dump,seen,path) ;



		System.out.println(head.relationships.get(0).capacity);

	}

	public void relationFinder(Person head,Person dump,ArrayList<Relationship> seen,ArrayList<Relationship> path,pathFound check) {

		if(check.isFound() == true) {return;}

		if(head == dump) {


			new RelationshipManager(path);

	

			check.found();
			return;}



		for(Relationship r : head.relationships) {
			if(r.positiveFlowAvailable) {

				if(seen.contains(r)) {return;}

				ArrayList<Relationship> path2 = clone(path);
				path2.add(r);
				seen.add(r);

				relationFinder(r.girl,dump,seen,path2,check);

				seen.remove(r);}}

		for(Relationship r : head.backTrackRelationships) {
			if(r.backFlowAvailable) {

				if(seen.contains(r)) {return;}

				ArrayList<Relationship> path3 = clone(path);
				path3.add(r);
				seen.add(r);


				relationFinder(r.boy,dump,seen,path3,check);

				seen.remove(r);}}

	}

	public ArrayList<Relationship> clone(ArrayList<Relationship> I) {

		ArrayList<Relationship> Items = new ArrayList<Relationship>();

		for(int i = 0;i<I.size();i++){

			Items.add(I.get(i));}

		return Items;
	}

	public void print(Person head,Person dump,ArrayList<Relationship> seen,ArrayList<Relationship> path) {

		if(head == dump) {


			for(int i=1;i<path.size()-1;i++) {
				path.get(i).print();
				
				return;}}



		for(Relationship r : head.relationships) {
			if(!r.positiveFlowAvailable) {

				if(seen.contains(r)) {return;}

				ArrayList<Relationship> path2 = clone(path);
				path2.add(r);
				seen.add(r);

				print(r.girl,dump,seen,path2);

				seen.remove(r);}}
	}

}
