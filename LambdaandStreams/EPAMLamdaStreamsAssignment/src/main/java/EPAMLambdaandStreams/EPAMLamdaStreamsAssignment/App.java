package EPAMLambdaandStreams.EPAMLamdaStreamsAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in) ;
        AverageOfIntegers avg = new AverageOfIntegers() ;
        ArrayList<Integer> al = new ArrayList<Integer>() ;
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
        	int x = sc.nextInt() ;
        	al.add(x) ;
        }
        System.out.println(avg.averageOfIntegersList(al)) ;
        ArrayList<String> sl = new ArrayList<String>() ;
        int m = sc.nextInt();
        for(int i= 0 ; i < m; i++) {
        	String y = sc.next() ;
        	sl.add(y) ;
        }
        StringAWithLength3 findString = new StringAWithLength3() ;
        System.out.println(findString.searchStringA(sl));
        PalindromeString ps = new PalindromeString() ;
        ArrayList<String> psl = new ArrayList<String>() ;
        int b = sc.nextInt();
        String mb = sc.nextLine() ;
        for(int i = 0 ; i < b ; i++) {
        	String z = sc.nextLine().replaceAll("\\s+","");
        	psl.add(z) ;
        }
        System.out.println(ps.isPalindromeOrNot(psl)) ;
    }
}
