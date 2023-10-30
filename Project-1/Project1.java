import java.util.StringTokenizer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project1 {
    public static void main(String[] args) {

        // Initializing the GUI
        RomanNumeralGUI myRomanNumeralGUI = new RomanNumeralGUI("Project 1 GUI", 500, 500);
        myRomanNumeralGUI.setVisible(true);
       
        //Initializing the array to contain the inputs from the txt file
        String[] wordArray = new String [100];
        int a = inputFromFile("input.txt", wordArray);

        //Making a different array that is adjusted to the size and contents of the file
        // This allows the file to contain lines less that 100 and be put into a customized file that fits its size

        String[] diffArray = new String[a];

        for(int i = 0; i < wordArray.length; i++){
        if(wordArray[i]!=null){
            diffArray[i] = wordArray[i];
            }
        }

        //This is to find out how many "numbers" are present in the file using Tokenizer
        int j = 0 ;

        for(int i = 0; i < a; i++ ){
        StringTokenizer st = new StringTokenizer(wordArray[i]);  
          while (st.hasMoreTokens()) {  
            System.out.println(st.nextToken(","));
            j++;  
            }  
        }

        // We take the number of tokens, use it to determine the size of the new array
        // Then we use the "diffArray" and transfer its contents to the newArray
        String[] newArray = new String[j];

        int x = 0;
        for(int i = 0; i < a; i++ ){
            StringTokenizer st = new StringTokenizer(diffArray[i]);  
              while (st.hasMoreTokens()) {  
                newArray[x] = st.nextToken(",");
                x++;  
                }  
            }
        // We use this to print the contents of the input file to the GUI
        // We use j as the integer input to represent the size of the new array

       // printRNtoJFrame(myRomanNumeralGUI, newArray, j);
        
    }

//This prints the values of the Roman and Arabic numbers to the GUI

private static void printRNtoJFrame(JFrame jf, String[] list, int size) {
 Container myContentPane = jf.getContentPane();
 TextArea myTextArea = new TextArea();
 TextArea mySubscripts = new TextArea();
 myContentPane.add(myTextArea);
 myContentPane.add(mySubscripts);
 

  for (int i=0;i<size;i++) {
  mySubscripts.append(valueOf(list[i])+"\n");
  if (list[i]!=null)
  myTextArea.append(list[i]+"\n");
  }


        jf.setVisible(true);
}

//This translates the Roman Numerals to Arabic Numbers
//Adjusted to get the right value of the Roman Numerals
private static int valueOf(String letter){
    int number = 0;
    char[] letterArray = letter.toCharArray(); 
    for(int i = 0; i < letterArray.length; i++){
        // Numbers need to be adjusted in case there is an I, X, or C that comes before it.

        /* It subtracts twice the amount for I, X, and C because it has already accounted for those values
         * Meaning that we must subtract the amount we had added in originally AND the amount we have to because
         * of the position the numbers are in.
        */

        if(letterArray[i]== 'I'){
            number++;
        } 
        if(letterArray[i]=='V'){
            number = number + 5;
            if( i > 0 && letterArray[i-1]== 'I'){
                number = number - 2;
            }
        }
        if(letterArray[i]=='X'){
            number = number + 10;
            if( i > 0 && letterArray[i-1]== 'I'){
                number = number - 2;
            }
        }
        if(letterArray[i]=='L'){
            number = number + 50;
            if( i > 0 && letterArray[i - 1] == 'X'){
                number = number - 20;
            }
        }
        if(letterArray[i]=='C'){
            number = number + 100;
            if( i > 0 && letterArray[i-1]== 'X'){
                number = number - 20;
            }
        }
        if(letterArray[i]=='D'){
            number = number + 500;
            if( i > 0 && letterArray[i-1]== 'C'){
                number = number - 200;
            }
        }
        if (letterArray[i]=='M'){
            number = number + 1000;
            if( i > 0 && letterArray[i-1]== 'C'){
                number = number - 200;
            }
        }
    }
    return number;
}

private static int inputFromFile(String filename, String[] words){
    TextFileInput in = new TextFileInput(filename);
    int lengthFilled = 0;
    String line = in.readLine();
    while ( lengthFilled < words.length && line != null ) {
       words[lengthFilled++] = line;
       line = in.readLine();
    } // while 
    if ( line != null ) {
       System.out.println("File contains too many numbers.");
       System.out.println("This program can process only " +
                          words.length + " words.");
       System.exit(1);
    } // if
    in.close();
    return lengthFilled;
 }  // method inputFromFile 

}
