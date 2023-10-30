public class Question1 {
    public static void main(String[] args) {
   
    String items[] = {"10","exam","20","five"};
    for (int i = -1; i<items.length; i++)
    try {
    System.out.println("The answer is: "+Integer.parseInt(items[i]));
    }
    catch (NumberFormatException nfe) {
    System.out.println("Oops! "+items[i]);
    }
    catch (ArrayIndexOutOfBoundsException aob){
    System.out.println("Bad array.");
    }
    catch (Exception e) {
    System.out.println("Oh, no!");
    }
   finally {System.out.println("Let's go");
}
    }
}
   