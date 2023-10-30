public class Lab3 {
  public static void main(String[] args) {

//initializing variables for fahrenheit 
    float fahrenheit = 98.6f;

//initializing centigrade
// making centigrade into a conversion from f -> c

    float centigrade = 0.555555555f;
    centigrade = centigrade*(fahrenheit-32);

// Printing the results
    System.out.println("Fahrenheit is " + fahrenheit);
    System.out.println("Centigrade is " + centigrade);

// for loop to print centigrade values from these float numbers
    System.out.println("For loop results:");
    for(float i=0.0f; i <= 40.0; i+=5.0){

       /* centigrade = 0.555555555f;
        centigrade = centigrade*(i-32);
        fahrenheit = i;
        System.out.println("This is the fahrenheit value: " + fahrenheit);
        System.out.println("This is the centigrade value: " + centigrade);
*/  

System.out.println("This is fahrenheit: " + i);
System.out.println("This is celsius: "+ (5.0)*(i-32.0)/(9.0));
 
 }

    System.out.println("");
    System.out.println("While loop results:");
// while loop that does the same thing
    //reinitializing the fahrenheit to work for the while loop
    fahrenheit = 0.0f;


    while(fahrenheit <=40.0){
      centigrade = 0.555555555f;
      centigrade = centigrade*(fahrenheit-32);
      System.out.println("This is the fahrenheit value: "+ fahrenheit);
      System.out.println("This is the centigrade value: "+ centigrade);
      fahrenheit+=5.0;
    }

  }
}
