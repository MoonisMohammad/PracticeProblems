import java.util.ArrayList;

public class Route {

	ArrayList<Pipe> pipes = new ArrayList<Pipe>();



	public Route() {

	}
	public Route(ArrayList<Pipe> pipes) {

		this.pipes = pipes; 
		bottleNeckApply(pipes);

	}

	public void print() {

		for(Pipe p:pipes) {

			p.print();
		}

		System.out.println();
	}

	public void bottleNeckApply(ArrayList<Pipe> pipes) { //bottleNeckApply
		int bottleNeck =pipes.get(0).capacityAvailable ;


		for(int i =1;i < pipes.size();i++) {

			if(pipes.get(i-1).to == pipes.get(i).to ) {

				if(bottleNeck>pipes.get(i).capacityInUse) {


					bottleNeck = pipes.get(i).capacityInUse;}}


			else if(bottleNeck>pipes.get(i).capacityAvailable) {
				System.out.println(bottleNeck);

				bottleNeck = pipes.get(i).capacityAvailable;}

		}

		System.out.println(bottleNeck);
		pipes.get(0).posFlow(bottleNeck);

		for(int y =1;y < pipes.size();y++) {

			if(pipes.get(y-1).to == pipes.get(y).to ) {



				pipes.get(y).negFlow(bottleNeck);}

			else {

				pipes.get(y).posFlow(bottleNeck);

			}

		}


		pipes.get(pipes.size()-1).to.flowDelivered= pipes.get(pipes.size()-1).to.flowDelivered +bottleNeck;


	}






}
