public class MaxHeapDriver{
   public static void main(String[] args){
   
      MaxHeap heap = new MaxHeap ();
      
      heap.add (10);
      heap.add (15);
      heap.add (12);
      System.out.println ("Removing: " + heap.remove ());
      heap.add (17);
      heap.add (10);
      heap.add (14);
      System.out.println ("Removing: " + heap.remove ());
      heap.add (500);
      System.out.println ("Removing: " + heap.remove ());
      heap.add (1);
      heap.add (222);
      heap.add (75);
      heap.add (96);
      heap.add (3);
      heap.add (46);
      heap.add (0);
      heap.add (-1);
      
   }
}   