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
		int place = foundOrInserted(word);
		IndexEntry dd = super.get(place);
		dd.add(num);
		
	}

	public void addAllWords(String str, int num) {
		String[] array = str.split("\\W+");
		for(String string : array){
			if(string.length() > 0){
				addWord(string, num);
			}
		}

	}
	private int foundOrInserted(String word){
	
		return 0;	
	}

}
