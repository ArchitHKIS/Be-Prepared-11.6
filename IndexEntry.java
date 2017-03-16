import java.util.*;

public class IndexEntry {
	private static String word;
	private static ArrayList<Integer> numList;

	public IndexEntry(String w){
		word = w.toUpperCase(); // makes the word an uppercase string only
		numList = new ArrayList<Integer>(); //initializes the numlist array as an integer array
	}
	
	public static void add(int num) {
		Integer num1 = num;
        if (!numList.contains( num1 ) )
        {
            numList.add( num1 );
        }
	}

	public static String getWord() {
		return word; // returns private var word 
	}

	public String toString() {
	/*	String index = word + " " + numList.toString(); // makes a string with word followed by numlist as a string
		index.replace("[", ""); // removes the square brackets
		return index; // return statement*/
		String result = word;
        for ( Integer num : numList )
        {
            result += ( " " + num + ",");
        }
        result = result.substring( 0 , result.length() - 1 );
        return result;
	}

}
