import java.util.Random;

public class LinearSearch{
   public static void main(String[] args){
   
      int[] array = new int[50];
      Random r = new Random();
   
      //populate the array with random numbers
      for(int i = 0; i < array.length; i++){
         array[i] = r.nextInt(100);
      }
      
      //output array
      for(int i = 0; i < array.length; i++){
         System.out.print(array[i] + ", ");
      }
      System.out.println();
      
      //pick a random number to search for   
      int searchingFor = r.nextInt(100);
      System.out.println("Searching For: " + searchingFor);
      
      //call linear search
      int indexOfNumber = linearSearch(searchingFor, array);
   
      //output result
      System.out.println("Result: " + indexOfNumber);
   }
   
   public static int linearSearch(int n, int[] array){
   
      for(int i = 0; i < array.length; i++){
         if(n == array[i]){
            return i;
         }
      }
      return -1;  
   }
}