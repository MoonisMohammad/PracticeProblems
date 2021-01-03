
public class pathFound {

	public boolean Check;

	public  pathFound() {

		Check = false;
	}

	public void found() {

		Check = true;
	}

	public void reset() {

		Check = false;
	}
	
	public boolean isFound() {
		
		return Check;
	}

}
