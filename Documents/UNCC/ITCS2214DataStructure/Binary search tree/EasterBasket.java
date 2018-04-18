public class EasterBasket {
   public static void main(String[] args){
   
      BST tree = new BST ();
      
      tree.add (new EasterEgg (50) );
      tree.add (new EasterEgg (25) );
      tree.add (new EasterEgg (75) );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      tree.add (new EasterEgg () );
      
      System.out.println( tree.search(33) );
                        
      
      
      
      
      
   
   
   }
}