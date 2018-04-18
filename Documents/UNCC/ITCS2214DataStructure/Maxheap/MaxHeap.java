public class MaxHeap {

   private int[] heap;
   private int size;
   
   public MaxHeap(){
      heap = new int[100];
      size = 0;
   }

   public void add (int v){
      int index = size + 1;         //index where we'll add the new value
      heap[index] = v;              //add value at that position
            
      while ( index > 1 ) {                     //while our value has parents
         int parentIndex = index / 2;           //get parent index by dividing by 2
         if(heap[parentIndex] < v) {            //if parent's value is lower
            heap[index] = heap[parentIndex];    //perform swap
            heap[parentIndex] = v;     
            
            index = parentIndex;                //update index after swap
         }else{                     //no swap needed         
            break;         
         }
      }
         
      size ++;                      //increase size
         
   }
   
   public int remove () {
      int rootValue = heap[1];      //store root value to return at the end
      int v = heap[size];           //store last value in heap in v
      heap[1] = v;                  //take v and move to root
      heap[size] = 0;               //delete node at last position (b/c we moved it to the root)
   
      int index = 1;
      
      while(index * 2 < size){      //is there at least one child at index
         int leftIndex = index * 2;
         int rightIndex = leftIndex + 1;
         
         int leftValue = heap[leftIndex];
         int rightValue = -1000000;
         
         if(rightIndex < size){     //there is a right child
            rightValue = heap[rightIndex];
         }
         
         int maxChild, maxIndex;          //find index of and value of larger child
         if(leftValue >= rightValue){     //put in '=' so you get FIFO (swap with left child if values are the same
            maxChild = leftValue;
            maxIndex = leftIndex;
         }else{
            maxChild = rightValue;
            maxIndex = rightIndex;         
         }
         
         if(v < maxChild){             //value is less than the larger child -> swap
            heap[index] = maxChild;    //perform swap with larger of two children
            heap[maxIndex] = v;
            index = maxIndex;
         }else{
            break;                     //value is in a valid position -> stop
         }
      }
      
      size --;                      //update size
      
      return rootValue;             //return old root
   }
}