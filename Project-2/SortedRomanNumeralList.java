public class SortedRomanNumeralList extends RomanNumeralList{

  public void add(int[] array){
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
  }
    



