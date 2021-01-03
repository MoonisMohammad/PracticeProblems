
public class Pipe {

	Junction from;
	Junction to;

	public int capacity;
	public int capacityInUse;
	public int capacityAvailable;

	boolean posAvailable;
	boolean negAvailable;

	public Pipe(Junction from,Junction to,int capacity) {

		this.from = from;
		this.to=to;
		this.capacity= capacity;
		this.capacityAvailable = capacity;
		capacityInUse=0;
		posAvailable = true;

		if (capacity == 0) {posAvailable = false;}

		negAvailable = false;
	}



	public int capacity() {return capacity;}

	public Junction from() {return from;}

	public Junction to() {return to;}

	public boolean PosFlowAvailable() {return posAvailable; }	

	public void print() {

		System.out.print(from.name +"->"+ to.name+"||");}
	

	public void posFlow(int i) {

		capacityInUse =capacityInUse +i;
		capacityAvailable = capacity - capacityInUse ;
		
		if(capacityInUse>0) {negAvailable = true;}

		if(capacityAvailable == 0) {posAvailable = false;}
		}
	

	public void negFlow(int i) {

		capacityInUse =capacityInUse -i;
		capacityAvailable = capacity - capacityInUse ;

		if (capacityAvailable > 0) {posAvailable = true;}


		if(capacityInUse <= 0) {negAvailable = false;}
		
	}


}


