public class Queue {
   
   private Person first, last;
   
   public Queue () {
      first = null;
      last = null;
   }
   
   public void enqueue (Person p){
      if( isEmpty () ){
         first = p;
      }else{
         last.setNext (p);
      }
      
      last = p;
   }
   
   public Person dequeue () {
      if( isEmpty() )   return null;
      
      Person p = first;                   //store reference to first
      
      if(first == last){                  //only 1 person in queue
         last = null;
      }
      
      first = first.getNext();            //set first to next in queue
      
      return p;                           //return the stored person           
   }
   
   public void printQueue () {
      Person p = first;
      
      while (p != null){
         System.out.println(p.toString());
         p = p.getNext ();
      }
   }
   
   public boolean isEmpty () {
      return first == null;
   }

}