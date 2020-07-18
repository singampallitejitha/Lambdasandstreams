package EPAMLambdaandStreams.EPAMLamdaStreamsAssignment;

import java.util.ArrayList;
import java.util.List;

public class PalindromeString {

	public List<String> isPalindromeOrNot(ArrayList<String> psl) {
		List<String> p = new ArrayList<String>() ;
		for(String x:psl) {
			String reverseString = new StringBuilder(x).reverse().toString() ;
			if(reverseString.equalsIgnoreCase(x)) {
				p.add(x) ;
			}
		}
		return p;		
	}

}
