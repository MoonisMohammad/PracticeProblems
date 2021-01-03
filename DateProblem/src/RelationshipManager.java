import java.util.ArrayList;


public class RelationshipManager {

	ArrayList<Relationship> relationships = new ArrayList<Relationship>();

	public RelationshipManager(ArrayList<Relationship> path) {



		if(Viable(path)) {

			path.get(0).positiveFlow();
			path.get(1).positiveFlow();
			path.get(path.size() -1).positiveFlow();


			if(path.size() > 3) {

				for(int i = 2; i< path.size() -1;i++) {
					if(path.get(i-1).girl == path.get(i).girl) {

						path.get(i).negetiveFlow();}

					else  {path.get(i).positiveFlow();}
				}
			}
		}

	}



	public boolean Viable(ArrayList<Relationship> path) {

		int bottleNeck;

		bottleNeck = path.get(1).posFlowCapacity;

		if(path.size() > 3) {

			for(int i = 2; i< path.size() -1;i++) {


				if(path.get(i-1).girl == path.get(i).girl) {

					if(path.get(i).backFlowCapacity !=bottleNeck ) {return false;}
				}


				else if(path.get(i).posFlowCapacity !=bottleNeck ) {return false;}

			}}

		return true;


	}

}
