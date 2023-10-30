import java.util.*;  
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;


public class Project2 {
    public static void main(String args[]){
       
        RomanNumeralGUI myRomanNumeralGUI = new RomanNumeralGUI("Project 2 GUI", 500, 500);

        myRomanNumeralGUI.setVisible(true);

        RomanNumeralList RNL = new RomanNumeralList();
        UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();
       // SortedRomanNumeralList sortedList = new SortedRomanNumeralList();
        
        int a = inputFromFile("input.txt", RNL);
       
        int j = 0 ;

        for(int i = 0; i < a; i++ ){
        StringTokenizer st = new StringTokenizer(RNL.find(i));  
          while (st.hasMoreTokens()) {  
            unsortedList.append(j, st.nextToken(","));
            j++;  
            }  
        }

        for(int i =0; i < j; i++){
        RomanNumeral RN = new RomanNumeral(unsortedList.find(i));  
        System.out.println(RN.getRomanNumeral()); 
        }
        int[] newArray = new int[8];
        for(int i = 0; i < j; i ++){
            RomanNumeral RN = new RomanNumeral(unsortedList.find(i));
            newArray[i] = RN.getArabicNumeral();
            System.out.println(RN.getRomanNumeral());
        }
        sortedList(newArray);
        printRNtoJFrame(myRomanNumeralGUI,unsortedList,newArray,j);

       
    }

    private static void printRNtoJFrame(JFrame jf,RomanNumeralList unsortedList,int[] array, int size) {
        Container myContentPane = jf.getContentPane();
        TextArea myTextArea = new TextArea();
        TextArea mySubscripts = new TextArea();
        TextArea myOtherArea = new TextArea();
        myContentPane.add(myTextArea);
        myContentPane.add(mySubscripts);
        myContentPane.add(myOtherArea);
         for (int i=0;i<size;i++) {
        
         RomanNumeral RN = new RomanNumeral(unsortedList.find(i));
         
         mySubscripts.append(RN.getArabicNumeral()+"\n"); // Second Pane (Unsorted)
         myOtherArea.append(array[i]+"\n"); // Third Pane (Sorted)


         if (unsortedList!=null)
         myTextArea.append(unsortedList.find(i)+"\n"); // First Pane (Roman Numerals)
         }
               jf.setVisible(true);
       }


public static void sortedList(int[] array){
    for ( int i = 0; i < array.length; i++ ) {
        int indexLowest = i;
        for ( int j = i + 1; j < array.length; j++ )
        if ( array[j] < array[indexLowest] )
            indexLowest = j;
        if ( array[indexLowest] != array[i] ) {
            int temp = array[indexLowest];
            array[indexLowest] = array[i];
            array[i] = temp;
        } // if
     } // for i
} 

private static int inputFromFile(String filename, RomanNumeralList words){
        TextFileInput in = new TextFileInput(filename);
        int lengthFilled = 0;
        String line = in.readLine();
        while ( lengthFilled < 100 && line != null ) {
           words.insert(lengthFilled++,line);
           line = in.readLine();
        } // while 
        if ( line != null ) {
           System.out.println("File contains too many numbers.");
           System.out.println("This program can process only " +
                              100 + " words.");
           System.exit(1);
        } // if
        in.close();
        return lengthFilled;
     }  // method inputFromFile 
}
