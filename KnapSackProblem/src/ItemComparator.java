import java.util.*;

public class ItemComparator implements Comparator<Item>{

	// Overriding compare()method of Comparator  
	// for descending order of cgpa 
	public int compare(Item I1, Item I2) { 
		if (I1.NodalValue < I2.NodalValue) 
			return 1; 
		else if (I1.NodalValue > I2.NodalValue) 
			return -1; 
		return 0; 
	} 
}
