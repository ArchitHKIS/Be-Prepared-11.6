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

	public void addWord(String str, int num) {
		boolean exist = false; // Set a boolean to false
		IndexEntry ie = new IndexEntry(str); // Instantiate a new IndexEntry
												// object holding String str
		ie.add(num); // Add a number to the IndexEntry
		for (IndexEntry i : this) // For all the IndexEntries in this current
									// object
			if (str.toUpperCase().equals(i.getWord())) // If the word is equal
														// to the IndexEntry
														// word
			{
				i.add(num); // Add the number to the IndexEntry
				exist = true; // Set the boolean to true
			}
		if (exist == false && size() > 0) // Ignore if the word was exist
		{
			if (get(size() - 1).getWord().compareTo(str.toUpperCase()) < 0) {
				add(ie); // DocumentIndex adds the IndexEntry
				return; // Ends the method
			}
			for (IndexEntry i : this) // For all IndexEntries in this
										// DocumentIndex
			{
				if (i.getWord().compareTo(str.toUpperCase()) > 0) // Selectively
																	// sorts the
																	// list
				{
					add(indexOf(i), ie); // Adds the IndexEntry to the object in
											// the alphabetic position
					return; // Quit the method to lessen runtime if possible
				}
			}
		} else if (exist == false) // If and only if boolean exist is false
			add(ie); // Add the IndexEntry to the current DocumentIndex
	}

	public void addAllWords(String str, int num)
    {
       String[] strArray = str.split("[., \"!?]"); //Splits the array except for blank lines
       for(String s : strArray) //For every String sorted
          if(!s.equals("")) //If it is not an empty line
             addWord(s, num); //Add this to the num position
    }

	private int foundOrInserted(String word) {
		IndexEntry temp = new IndexEntry(word); // Instantiates IndexEntry with word
		for (IndexEntry element : this) //for each in document index
		{
			if (element == get(indexOf(element)))
				return 0; //nothing
		}

		for (IndexEntry element : this) //for each in document index
		{
			if (word.compareTo(element.getWord()) > 0) // ascii comparator
			{
				add(indexOf(element) - 1, temp); // Add the String to that position in DocumentIndex
				return indexOf(element) - 1; // Return that position
			}
		}
		return -1; //i need to return something
	}

}
