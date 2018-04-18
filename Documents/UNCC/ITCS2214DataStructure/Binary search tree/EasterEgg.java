import java.util.Random;

public class EasterEgg {
   
   private int prettyness;
   private EasterEgg left, right;   
   
   public EasterEgg () {
      prettyness = new Random().nextInt (100);
      left = null;
      right = null;
   }
   
   public EasterEgg (int p) {
      prettyness = p;
      left = null;
      right = null;
   }
   
   
   
   public void add (EasterEgg e){
      if(e.getPrettyness() <= prettyness){  //left
         if(left == null){       //no left child
            left = e;
         }else{                  //there is a left child
            left.add (e);        
         }
      }else{                              //right
         if(right == null){
            right = e;
         }else{
            right.add(e);
         }
      }
   }
   
   public EasterEgg search (int p){
      if(prettyness == p){
         return this;
      }else{
         if(p <= prettyness){
            if(left == null){
               return null;            //no left child -> value doesn't exist in tree
            }else{
               return left.search (p); //recursively call search on left child
            }
         }else{
            if(right == null){
               return null;
            }else{
               return right.search (p);
            }
         }
      }
   }
   

   public void setLeft(EasterEgg e){
      left = e;
   }
   public void setRight(EasterEgg e){
      right = e;
   }
   public EasterEgg getLeft () {
      return left;
   }
   public EasterEgg getRight () {
      return right;
   }
   public int getPrettyness () {
      return prettyness;
   }
   
   public String toString () { 
      return "Egg prettyness: " + prettyness;
   }
   
}