import java.util.Random;

public class SelectionSort{
   public static void main(String[] asdf){
      
      Random r = new Random();
      
      int[] a = new int[50];
      
      //populate array with random numbers from 0-99
      for(int i = 0; i < a.length; i++)
         a[i] = r.nextInt(100);
      
      //output array before sort
      for(int i = 0; i < a.length; i++)
         System.out.print(a[i] + ", ");

      //sort array
      sortArray(a);
      
      System.out.println();
      
      //output array after sort
      for(int i = 0; i < a.length; i++)
         System.out.print(a[i] + ", ");
         
   }
   public static void sortArray(int[] a){
      int lowestPos;
      
      for(int outer = 0; outer < a.length - 1; outer++){
         
         lowestPos = outer;
         
         for(int inner = outer + 1; inner < a.length; inner ++){
            if(a[inner] < a[lowestPos]){
               lowestPos = inner;
            }
         }
         
         //swap
         int temp = a[outer];
         a[outer] = a[lowestPos];
         a[lowestPos] = temp;
      }
   }
}