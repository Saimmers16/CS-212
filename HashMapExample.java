import java.util.HashMap;
import java.util.Iterator;
import java.lang.Integer;
import javax.swing.*;
public class HashMapExample{
 public static void main(String args[]){
 HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
 String inputWord;
 inputWord = JOptionPane.showInputDialog(null, "Enter a word:");
        // System.out.println(inputWord); This was a test to see if option pane worked
        
        while(inputWord.equalsIgnoreCase("Stop")==false){
        // For loop to traverse the string to check if the 'E' or 'e' characters are present
        
            for(int i = 0; i < inputWord.length(); i++){
                hashMap.put(inputWord, valueOf(inputWord));
                 // Displays message of how many 'E' or 'e' exist
            }
            
            inputWord = JOptionPane.showInputDialog(null, "Enter a word:");

        }

 
 if(hashMap.containsValue((1)))
 System.out.println("HashMap contains 1 as value");
 else{
 System.out.println("HashMap does not contain 1 as value");

 if( hashMap.containsKey("X") )
 System.out.println("HashMap contains X as key");
 else
 System.out.println("HashMap does not contain One as value");

}
 Iterator itr;
 System.out.println("Retrieving all keys from the HashMap");

 itr = hashMap.keySet().iterator();
 while(itr. hasNext()){
 System.out.println(itr.next());
 }


 System.out.println("Retrieving all values from the HashMap");
 itr = hashMap.entrySet().iterator();
 while(itr. hasNext()){
 System.out.println(itr.next());
 }
 }
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
}