public class StackLinkedList{
   
   private InventoryItem first;

   public StackLinkedList(){
      first = null;
   }
   
   public void add (InventoryItem newItem){
      if(!isEmpty()){
         newItem.setNext(first);   
      }
      first = newItem;
   }
   
   public void remove(){
      if(!isEmpty()){
         first = first.getNext();
      }
   }
   
   public boolean isEmpty(){
      return first == null;
   }
}