import java.util.Scanner;

public class Club {
   public static void main(String[] args){
      
      Queue line = new Queue ();
      Scanner k = new Scanner(System.in);
      int input = 0;
   
      while(input != 4){
         System.out.println("1 - Add Person");
         System.out.println("2 - Let Person In");         
         System.out.println("3 - Examine Line");
         System.out.println("4 - QUIT!");
         
         input = k.nextInt ();
         
         if(input == 1){
            k.nextLine();                          //clear buffer
         
            System.out.println("Enter Name: ");
            
            String name = k.nextLine ();           //get name
            Person p = new Person( name );         //create Person
            line.enqueue ( p );                    //add person to queue               
            
         }else if(input == 2){
            Person p = line.dequeue();             //remove & return 1st in line
            if(p != null){
               System.out.println("Let in: " + p.toString());
            }else{
               System.out.println("No one to let in"); 
            }         
         }else if(input == 3){
            line.printQueue ();
         }
      }
   }  
}