
/**
 * Write a description of class StoreDriver here.
 * 
 * @author (Kheang Tang) 
 * @version (02/24/2015)
 */
import java.util.*;
public class StoreDriver
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        CustomerLinkedlist store = new CustomerLinkedlist();//create a store queue that hold customer object
        int totalService=0;
        int maxLine=0;
        int inqueue=0;
        
        for( int i = 0; i<60; i++)//looping 60 minute time and possible add one customer every minute
        {
                        if(rand.nextInt(4)+1==4)//giving 25% chance add new customer
            {
              Customer client = new Customer();//instantiable new customer

              store.add(client);//adding new customer
              inqueue++;//increment number customer in line
              System.out.println("New customer added!  Queue length is now: " + inqueue);//notify new customer added
              if(inqueue>maxLine)//check if customer is maxinum in the 60 minute
              maxLine=inqueue;//store only the maxinum of customer in the line within 60 minute
            }
            
            if(!store.isEmpty())//check if there is customer in the list
            {
            Customer client=store.peek(); //look for the first customer
            client.decServiceTime();//get the customer in 1-5 minute serviced
            if(client.getServiceTime()==0)
            {
            store.remove();//removed customer from the list
            inqueue--;//decrement after service
            totalService+=1;//adding number of customer serviced
            //notify the customer have been removed
            System.out.println("Customer serviced and removed from the queue.  Quest length is now :" + inqueue);
            } 
            }          
            System.out.println("-----------------------------------");//each minute has passed
        }
        
        System.out.println("Total number of customers serviced is : " + totalService);//notify total serviced
        System.out.println("Maximum line length during the simulation :" + maxLine);//notify the max people in line 
        }
              
    }//end main
    

