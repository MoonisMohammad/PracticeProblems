import java.util.ArrayList;

public class Person {

	public int maxScore; 
	String name;
	boolean male;
	
	public ArrayList<Relationship> relationships = new ArrayList<Relationship>();
	public ArrayList<Relationship> backTrackRelationships = new ArrayList<Relationship>();


	Person(String name,String gender){

		this.name = name;
		if(gender.equals("F")) {

			male = false;
		}else {

			male = true;
		}

		maxScore = 100;

	}

	public void addGirlRelationship(int boyRank,Person girl, int girlRank) {
		
		Relationship r= new Relationship(this,girl,boyRank,girlRank);
		
		
		relationships.add(r);
		girl.backTrackRelationships.add(r);
	}

}
