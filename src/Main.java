import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Defining input variables
		ArrayList<Integer> topology = new ArrayList<Integer>();
		ArrayList<Double> inputVals = new ArrayList<Double>();
		ArrayList<Double> targetVals = new ArrayList<Double>();
		ArrayList<Double> resultVals = new ArrayList<Double>();		
		
		//Setting Net test topology		
		topology.add(3);//Number of inputs.
		topology.add(2);//Number of hidden layers.
		topology.add(1);//Number of outputs.
		
		Net myNet = new Net(topology);
		
		
		myNet.feedForward(inputVals);
		
		
		myNet.backProp(targetVals);
		
		
		myNet.getResults(resultVals);
		
		System.out.println("hello world");

	}

}
