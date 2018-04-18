
/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (Kheang Tang) 
 * @version (04/19/2015)
 */
public class Node {
   
   private String name;
   private Node left, right;  
      
   public Node(String p) {
      name = p;
      left = null;
      right = null;
   }
    
   public void insert (Node e){
      if(e.getName().compareTo(name)<0){  //left
         if(left == null){       //no left child
            left = e;
         }else{                  //there is a left child
            left.insert (e);        
         }
      }else{                              //right
         if(right == null){
            right = e;
         }else{                  //there is a right child
            right.insert(e);
         }
      }
   }
   
   public Node search (String p){
      if(p.equals(name)){
         return this;
      }else{
         if(p.compareTo(name)<0){
            if(left == null){
               return null;            //no left child -> value doesn't exist in tree
            }else{
               return left.search (p); //recursively call search on left child
            }
         }else{
            if(right == null){
               return null;          //no right child -> value doesn't exist in tree
            }else{
               return right.search (p);//recursively call search on left child
            }
         }
      }
   }
   
  public Node printPreOrder(Node currRoot) {
    if (currRoot == null){      //there nothing in the tree return null
        return this;
       }
       else                      //recursive the from the root to the left and to the right last
       System.out.print(currRoot.getName()+ ", ");
       printPreOrder(currRoot.left);
       printPreOrder(currRoot.right);
       return currRoot;
  }
  
  public Node printInOrder(Node currRoot) {
      if(currRoot == null){         //there nothing in the tree return null
          return this;
        }
        else                     //recursive the from the left to root and right last
        printInOrder(currRoot.left);
        System.out.print(currRoot.getName()+ ", ");
        printInOrder(currRoot.right);
        return currRoot;
    }
    
  public Node printPostOrder(Node currRoot) {
      if(currRoot == null){             //there nothing in the tree return null
          return this;
        }
        else                         //recursive the from the left to right and root  last
        printPostOrder(currRoot.left);     
        printPostOrder(currRoot.right);
        System.out.print(currRoot.getName()+ ", ");
        return currRoot;
  }

   public void setLeft(Node e){
      left = e;
   }
   public void setRight(Node e){
      right = e;
   }
   public Node getLeft () {
      return left;
   }
   public Node getRight () {
      return right;
   }
   public String getName () {
      return name;
   }
   
   public String toString () { 
      return "Name: " + name;
   }
   
}