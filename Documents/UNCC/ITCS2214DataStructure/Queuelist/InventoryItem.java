public class InventoryItem{

   private double price;
   private int quantity;
   private String name;
   private InventoryItem next;
   
   public InventoryItem(double p, int q, String n){
      price = p;
      quantity = q;
      name = n;
      next = null;
   }
   
   public void setNext(InventoryItem n){
      next = n;
   }
   public InventoryItem getNext(){
      return next;
   }
   
   public String getName(){
      return name;
   }
  
   public String toString(){
      return "Name: " + name + "\nQuantity: " + quantity + "\nPrice: " + price;
   }
}