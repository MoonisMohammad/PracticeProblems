

public class Item { 

	int value;
	int visualValue;
	int weight;
	public int NodalWeight;
	public int NodalValue;
	public Item boxedItemNode;
	public Item unboxedItemNode;
	boolean boxed;
	

	public Item(int v,int w) {

		value = v;
		visualValue = v;
		weight = w;
		NodalWeight = 0;
		NodalValue = 0;
	}


	public int getValue() {

		return value;
	}


	public int getWeight() {

		return weight;
	}


	public void setBoxed() {

		boxed = true;
	}


	public void setUnBoxed() {
		value = 0;
		boxed = false;
	}

	public int getvisualValue() {

		return visualValue;
	}

}
