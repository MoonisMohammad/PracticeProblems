import java.util.*;

public class KnapSackSolution {


	ArrayList<Item> Items1 = new ArrayList<Item>();
	ArrayList<Item> Items2 = new ArrayList<Item>();
	static final int COUNT = 10;

	public void Solution(ArrayList<Item> array,int weight){

		PriorityQueue<Item> pq = new PriorityQueue<Item>(new ItemComparator());

		Item head = new Item(0,0);
		MakePaths(array,head);
		BestNode(head, 0,0,weight,pq);
		printTree(head,0);

		System.out.print(pq.poll().NodalValue);
	}

	public void BestNode(Item root,int NodeWeight,int NodeValue,int Weight,PriorityQueue<Item> pq)  
	{  

		if (root.boxedItemNode == null) {
			NodeWeight = NodeWeight + root.weight;
			root.NodalWeight = NodeWeight;

			NodeValue =NodeValue + root.value;
			root.NodalValue = NodeValue;

			if(NodeWeight<=Weight) {

				pq.add(root);

			}
			return;  
		}

		NodeWeight = NodeWeight + root.weight;
		NodeValue = NodeValue + root.value;

		BestNode(root.boxedItemNode, NodeWeight,NodeValue,Weight,pq);  
		BestNode(root.unboxedItemNode, NodeWeight,NodeValue,Weight,pq); 
	}

	public Item MakePaths(ArrayList<Item> Items, Item Head){

		Items1 = new ArrayList<Item>();
		Items2 = new ArrayList<Item>();
		Items1 = clone(Items);

		if(Items.size()==1 ) {

			Item a1 = new Item(Items.get(0).getValue(),Items.get(0).getWeight());
			Item a2 = new Item(Items.get(0).getValue(),0);

			a1.setBoxed();
			a2.setUnBoxed();


			Head.boxedItemNode = a1;
			Head.unboxedItemNode = a2;

			return Head;
		}

		Item a1 = new Item(Items1.get(0).getValue(),Items1.get(0).getWeight());
		a1.setBoxed();
		Items1.remove(0);

		Head.boxedItemNode = MakePaths(Items1,a1);

		Items2 = clone(Items);
		Item a2 = new Item(Items2.get(0).getValue(),0);
		a2.setUnBoxed();
		Items2.remove(0);

		Head.unboxedItemNode = MakePaths(Items2,a2);	

		return Head;
	}

	public ArrayList<Item> clone(ArrayList<Item> I) {

		ArrayList<Item> Items = new ArrayList<Item>();

		for(int i = 0;i<I.size();i++){

			Items.add(I.get(i));}

		return Items;
	}

	static void printTree(Item root, int space)  
	{  
		if (root == null)  
			return;  

		space += COUNT;  

		printTree(root.boxedItemNode, space);  

		System.out.print("\n");  
		for (int i = COUNT; i < space; i++)  
			System.out.print(" "); 

		if (root.boxedItemNode == null) {
			if(root.boxed == false) {

				System.out.print("!"+  root.getvisualValue()+"("+root.getWeight()+")"+" Final Path Weight "+root.NodalWeight +","+" Final Path Value "+root.NodalValue + "\n");
			}else {

				System.out.print(root.getvisualValue()+"("+root.getWeight()+")"+"Final Path Weight "+root.NodalWeight +","+" Final Path value "+root.NodalValue + "\n");
			}  
			return;}

		if(root.boxed == false) {

			System.out.print("!"+  root.getvisualValue()+"("+root.getWeight()+")" + "\n");
		}else {

			System.out.print(root.getvisualValue()+"("+root.getWeight()+")" + "\n");
		}

		printTree(root.unboxedItemNode, space);  
	}

}




