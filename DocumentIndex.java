import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DocumentIndex extends ArrayList<IndexEntry> {

	public DocumentIndex() {
		super();
	}

	public DocumentIndex(int num) {
		super(num);
	}

	public void addWord(String word, int num) {
		get(foundOrInserted(word)).add(num);
	}

	public void addAllWords(String str, int num) {
		String[] strArray = str.split("[., \"!?]"); // Splits the array except
													// for blank lines
		for (String s : strArray) // For every String sorted
			if (!s.equals("")) // If it is not an empty line
				addWord(s, num); // Add this to the num position
	}

	private int foundOrInserted(String word) {
		int num;
		int num1;
		for (num = 0; num < super.size(); num++) {
			num1 = get(num).getWord().compareToIgnoreCase(word);
			System.out.println(get(num).getWord().compareToIgnoreCase(word));
			if (num1 == 0) {
				return num;
			} else if (num1 > 0) {
				break;
			}
		}
		super.add(num, new IndexEntry(word));
		return num;
	}

}
