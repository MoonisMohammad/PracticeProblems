import java.util.ArrayList;

public class BubbleSort {
	
	
	int n1;
	int n2;
	int j;
	
	public ArrayList<Integer> DoubleBubbleSort(ArrayList<Integer> List ) {
		
	for(int x=1;x<List.size();x++) {
		for(int i=0;i<List.size()-1;i++) {
			
				j = i+1;
				n1= List.get(i);
				n2 = List.get(j);
				
					if(n1>n2) {
					
					List.set(i, n2);
					List.set(j, n1);
					
					}
											
		}
	}	
		return List;
		
	}
		
		
		
	public ArrayList<Integer> TripleBubbleSort(ArrayList<Integer> List ){
		
		
	for(int x=1;x<List.size();x++) {
		for(int i=0;i<List.size()-2;i++) {
		
			    j = i+2;
				n1= List.get(i);
				n2 = List.get(j);
			
					if(n1>n2) {
				
					List.set(i, n2);
					List.set(j, n1);
					
					}
										
		}
	}
	
		return List;
		
	}
		
		
		
}
