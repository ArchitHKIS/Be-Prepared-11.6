import java.util.*;
import java.io.*;
public class IndexMaker
   {
       public static void main(String[] args) throws IOException
      {
         Scanner keyboard = new Scanner(System.in);
         System.out.print("\nEnter input file name: ");
         String fileName = keyboard.nextLine().trim();
         Scanner inputFile = new Scanner(new File(fileName));
         System.out.print("\nEnter output file name: ");
         fileName = keyboard.nextLine().trim();
         PrintWriter outputFile = new PrintWriter(new FileWriter(fileName));
         DocumentIndex index = new DocumentIndex();   
         String line = null;
         int lineNum = 0;
         while(inputFile.hasNextLine())
         {
            lineNum++;
            index.addAllWords(inputFile.nextLine(), lineNum);
         }
         for(IndexEntry entry : index)
            outputFile.println(entry);
         inputFile.close(); 						
         outputFile.close();
         System.out.println("Done.");
      }
   }