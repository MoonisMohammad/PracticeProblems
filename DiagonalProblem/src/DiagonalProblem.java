import java.util.ArrayList;

public class DiagonalProblem {


	public void solution(int n) {

		ArrayList<Point> array2 = new ArrayList<Point>();
		print(BoardCreator(0,0,n),array2);


	}



	public Point BoardCreator(int x, int y,int n) {

		Point Head = new Point(x,y);

		if(y==n && x==n) {return Head;}

		else if(y==n) {
			Head.rightNode = BoardCreator(x+1,y,n);
			return Head;}

		else if (x==n) {
			Head.upNode = BoardCreator(x,y+1,n);
			return Head;}

		Head.upNode = BoardCreator(x,y+1,n);
		Head.rightNode = BoardCreator(x+1,y,n);

		return Head;
	}

	public void print(Point head, ArrayList<Point> array)  
	{   
		ArrayList<Point> array2 = new ArrayList<Point>();
		array2 = clone(array);

		array2.add(head);

		if (head.upNode == null && head.rightNode == null) {

			printItems(array2);
			return;
		}
		else if(head.upNode == null) {

			print(head.rightNode , array2);

		}
		else if(head.rightNode == null) {

			print(head.upNode , array2);

		}else{

			print(head.upNode , array2); 
			print(head.rightNode , array2);
		}

	}  


	public ArrayList<Point> clone(ArrayList<Point> I) {

		ArrayList<Point> Points = new ArrayList<Point>();

		for(int i = 0;i<I.size();i++){

			Points.add(I.get(i));}

		return Points;
	}

	public void printItems(ArrayList<Point> I) {

		System.out.print("[");

		for(int i = 0;i<I.size();i++){

			if(i==I.size()-1) {

				System.out.print("(" + I.get(i).xAxis+","+I.get(i).yAxis+")"+"]"+"\n");
				return;

			}

			System.out.print("(" + I.get(i).xAxis +","+I.get(i).yAxis+")");


			}

		}



	
}
