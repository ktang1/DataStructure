
/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (Kheang Tang) 
 * @version (04/19/2015)
 */
public class BinarySearchTree
{
   private Node root;   
   
   public BinarySearchTree () {
      root = null;  

   }
   
   public void insert (String e){ 
       Node node = new Node(e);        //create new node object       
      if(root==null){
         root = node;                   //set root to the node
      }else{             
         root.insert (node);            //calling recursive method
      }
   }

   public Node search (String p){
      
      if(root == null)  
      return null;
      else
      System.out.println( root.search (p));
      return root.search(p);

     
    }

   public Node printPreOrder() {
     if(root==null)
     return null;
     else
     System.out.println("Preorder ");
     return root.printPreOrder(root);
   }
   
   public Node printInOrder(){
       if(root==null)
       return null;
       else 
       System.out.println();
       System.out.println("Inorder ");
       return root.printInOrder(root);
    }
 
     public Node printPostOrder(){
       if(root==null)
       return null;
       else 
       System.out.println();
       System.out.println("Postorder ");
       return root.printPostOrder(root);
    }
 
}




