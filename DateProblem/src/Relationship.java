
public class Relationship {
	public int capacity;
	public int backFlowCapacity;
	public int posFlowCapacity;


	public Person boy;
	public Person girl;

	public boolean positiveFlowAvailable;
	public boolean backFlowAvailable;


	public  Relationship(Person boy, Person girl ,int rank1,int rank2){

		this.boy = boy;
		this.girl = girl;

		capacity =202 - rank1 + rank2;

		backFlowCapacity = 0;
		posFlowCapacity = capacity;

		positiveFlowAvailable =true;
		backFlowAvailable =false ;

	}

	public void positiveFlow() {
		
		backFlowCapacity = capacity;
		posFlowCapacity = 0;

		backFlowAvailable = true;
		positiveFlowAvailable = false;


	}

	public void negetiveFlow() {
		
		posFlowCapacity = capacity;
		backFlowCapacity = 0;

		positiveFlowAvailable = true;
		backFlowAvailable = false;


	}

	public void print() {System.out.println(boy.name +" and "+ girl.name +" with Score "+  (capacity+202));}



}
