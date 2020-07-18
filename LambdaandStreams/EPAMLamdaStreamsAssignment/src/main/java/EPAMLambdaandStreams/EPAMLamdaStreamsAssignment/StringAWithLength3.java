package EPAMLambdaandStreams.EPAMLamdaStreamsAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringAWithLength3 {

	public List<String> searchStringA(ArrayList<String> sl) {
		return sl.stream().filter(s->s.startsWith("a")).filter(s->(s.length()==3)).collect(Collectors.toList());
	}
	

}
