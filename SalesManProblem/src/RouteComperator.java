import java.util.Comparator;

public class RouteComperator implements Comparator<Route>{

	public int compare(Route I1, Route I2) { 
		if (I1.distance > I2.distance) 
			return 1; 
		else if (I1.distance < I2.distance) 
			return -1; 
		return 0; 
	} 
}
