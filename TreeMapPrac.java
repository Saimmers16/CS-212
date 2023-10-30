import java.util.TreeMap;
import java.util.Iterator;
import java.util.Comparator;

public class TreeMapPrac{
    public static void main(String args[]){
        TreeMap <String, Integer> french = new TreeMap<> ( );
french.put("cat",1);
french.put("water",2);
french.put("moon",3);
int frenchWord = french.get("water");
System.out.println(frenchWord);
    }

}
