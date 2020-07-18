package EPAMLambdaandStreams.EPAMLamdaStreamsAssignment;

import java.util.ArrayList;

public class AverageOfIntegers {

	public Double averageOfIntegersList(ArrayList<Integer> al) {
		return al.stream().mapToDouble(n -> n).average().getAsDouble() ;	
	}
	

}
