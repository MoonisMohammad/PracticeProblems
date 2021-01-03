import java.util.ArrayList;

public class Junction {
	public String name;
	
	public ArrayList<Pipe> pipesPositive = new ArrayList<Pipe>();
	public ArrayList<Pipe> pipesNegetive= new ArrayList<Pipe>();
	
	public int flowDelivered;

	
	public Junction(String name) {
		
		this.name = name;
		flowDelivered = 0 ;
	}

	

	
	public void addPipe(Pipe p) {
		
		pipesPositive.add(p);
		p.to.pipesNegetive.add(p);
	}
	


}
