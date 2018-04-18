public class StoreDriver{
   public static void main(String[] args){

      StackLinkedList list = new StackLinkedList();
      
      InventoryItem item1 = new InventoryItem(1.55, 50, "Hammer");
      InventoryItem item2 = new InventoryItem(1.85, 500, "Screwdriver");
      InventoryItem item3 = new InventoryItem(100.55, 50, "Nail");
      InventoryItem item4 = new InventoryItem(5.15, 10, "Bolt");

      list.add(item1);
      list.add(item2);
      
      list.remove();
      
      list.add(item3);
      list.add(item4);


   }
}