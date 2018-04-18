
/**
 * Write a description of class PriorityQueue here.
 * 
 * @author (Kheang Tang) 
 * @version (03/24/2015)
 */
public class PriorityQueue
{
   private PriorityCustomer[] heap;
   private int size, index;
   
   
   public PriorityQueue(){
      heap = new PriorityCustomer[100];
      size = 0;
      index =0;
   }

   public void addCustomer (PriorityCustomer c){
      index = size + 1;         //index where we'll add the new value
      heap[index] = c;              //add value at that position
            
      while ( index > 1 ) {                     //while our value has parents
         int parentIndex = index / 2;           //get parent index by dividing by 2
         if(heap[parentIndex].getPriority() < c.getPriority()) {            //if parent's value is lower
            heap[index] = heap[parentIndex];    //perform swap
            heap[parentIndex] = c;     
            
            index = parentIndex;                //update index after swap
         }else{                     //no swap needed         
            break;         
         }
      }
         
      size ++;                      //increase size
         
   }
   
    public PriorityCustomer removeCustomer() {
      PriorityCustomer rootValue = heap[1];      //store root value to return at the end
      PriorityCustomer c = heap[size];           //store last value in heap in c
      heap[1] = c;                  //take c and move to root
      heap[size] = null;               //delete node at last position (b/c we moved it to the root)
   
      index = 1;
      
      while(index * 2 < size){      //is there at least one child at index
         int leftIndex = index * 2;
         int rightIndex = leftIndex + 1;
         
         int leftValue = heap[leftIndex].getPriority();
         int rightValue = -1000000;
         
         if(rightIndex < size){     //there is a right child
            rightValue = heap[rightIndex].getPriority();
         }
         
        int maxChild;
        int maxIndex;          //find index of and value of larger child
         if(leftValue >= rightValue){     //put in '=' so you get FIFO (swap with left child if values are the same
            maxChild = leftValue;
            maxIndex = leftIndex;
         }else{
            maxChild = rightValue;
            maxIndex = rightIndex;         
         }
         
         if(c.getPriority() < heap[maxIndex].getPriority()){             //value is less than the larger child -> swap
            heap[index] = heap[maxIndex];    //perform swap with larger of two children
            heap[maxIndex] = c;
            index = maxIndex;
         }
         else{
            break;                     //value is in a valid position -> stop
         }
      }
      
      size --;                      //update size     
      return rootValue;             //return old root
   }
   
   public boolean isEmpty()//check if the array is empty
   {
       if (size==0)
       return true;
       else
       return false;
    }
   
   public PriorityCustomer peek()//look for the max heap
   {
       return heap[1];
    }
}
