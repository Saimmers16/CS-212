public class Question {
 public static void main (String[] args) {
 Alpha myArray [] = new Alpha[5];
 myArray[0] = new Beta(7);
 myArray[1] = new Beta(10);
 myArray[2] = new Gamma(15);
 myArray[3] = new Gamma(16);
 myArray[4] = new Gamma(17);
 }
}
public class Alpha {
 public Alpha(int x) {
 super();
 System.out.println("I am Alpha, and x is "+x);
 }
}
public class Beta extends Alpha {
 public Beta (int y) {
 super(y+3);
 System.out.println("I am Beta, and y is "+y);
 }
}
public class Gamma extends Alpha {
 public Gamma (int y){
 super(y+5);
 y++;
 System.out.println("I am Gamma and y is "+y);
 }
}