public class BST {

   private EasterEgg root;   
   private int size;
   
   public BST () {
      root = null;
      size = 0;
   }
   
   public void add (EasterEgg e){
      
      if(root == null){    //is tree empty
         root = e;
      }else{
         root.add (e);
      }

      size ++;
   }

   public EasterEgg search (int p){
      
      if(root == null)  return null;
      
      return root.search (p);
      
   }

}