public class Person {

   private String name;
   private Person next;
   
   public Person (String n){
      name = n;
      next = null;
   }
   
   public void setNext (Person p){
      next = p;
   }
   public Person getNext () {
      return next;
   }
   
   public String toString () {
      return "Name: " + name;
   }
   
}