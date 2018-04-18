public class QueueLinkedList{
   
   private InventoryItem first, last;

   public QueueLinkedList(){
      first = null;
      last = null;
   }
   
   public void add (InventoryItem newItem){
      if(isEmpty()){
         first = newItem;       
      }else{
         last.setNext(newItem);
      }  
      last = newItem;
   }
   
   public void remove(){
      if(!isEmpty()){
         first = first.getNext();
      }
   }
   
   public InventoryItem search(String n){
      if(!isEmpty()){
         InventoryItem i = first;
         
         while(i != null){
            if(i.getName().equals(n)){
               return i;   
            }
            i = i.getNext();
         }
      }
      System.out.print("Object not found!");
      return null;
   }
   
   public boolean isEmpty(){
      return first == null;
   }
}