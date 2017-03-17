import java.util.*;

public class IndexEntry{
	private static String word;
	private static ArrayList<Integer> numList;

	public IndexEntry(String w){
		word = w.toUpperCase(); // makes the word an uppercase string only
		numList = new ArrayList<Integer>(); //initializes the numlist array as an integer array
	}
	
	public static void add(int num) {
        if (!numList.contains(num))
        {
            numList.add(num);
        }
	}

	public static String getWord() {
		return word; // returns private var word 
	}

	public String toString() {
		String result = word;
        for ( Integer num : numList )
        {
            result += (" " + num +",");
        }
        result = result.substring( 0 , result.length() - 1 );
        return result;
	}

}
