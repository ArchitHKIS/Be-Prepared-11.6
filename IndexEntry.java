import java.util.*;

public class IndexEntry {
	private static String word;
	private static ArrayList<Integer> numList;

	public IndexEntry(String w){
		word = w.toUpperCase();
		numList = new ArrayList<Integer>();
	}
	
	public static void add(int num) {
		if(numList.contains(num) == false){
			numList.add(num);
		}
	}

	public static String getWord() {
		return word;
	}

	public String toString() {
		String index = word + numList.toString();
		index.replace("[", "");
		return index;
	}

}
