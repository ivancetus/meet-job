package Unit8.Basic_Sort;
import java.util.*;

public class Integer_Sort
{
    public static void main(String[] args) 
    {
        Integer[] num = {15, 8, 25, 48, 2, 10, 33, 20};
        System.out.println("由大到小排序:");
        System.out.println("排序前:");
        
        for( int n=0; n<num.length; n++ ) System.out.print(num[n] + "\t");
        
        System.out.println();
        
        Arrays.sort( num, Collections.reverseOrder());
        
        System.out.println("\n\n排序後的結果:");
        
        for(int element : num ) System.out.print(element + "\t");

        System.out.println();
    }
}