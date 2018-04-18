
/**
 * Write a description of class Driver here.
 * 
 * @author (Kheang Tang) 
 * @version (03/24/2015)
 */
import java.util.*;
public class Driver
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        PriorityQueue line = new PriorityQueue();
        int totalService=0;
        int maxLine=0;
        int inQueue=0;
        
        for(int i=0; i<60; i++)
        {
            if(rand.nextInt(4)==1)
            {
               PriorityCustomer customer= new PriorityCustomer();
               line.addCustomer(customer);
               inQueue++;
               System.out.println("New customer added!  Queue length is now: " + inQueue);//notify new customer added
              if(inQueue>maxLine)//check if customer is maxinum in the 60 minute
              maxLine=inQueue;//store only the maxinum of customer in the line within 60 minute
              
            }
            
            if(!line.isEmpty())//check to see if the line isn't empty
            {  
            PriorityCustomer customer=line.peek();//look for priority customer
            customer.decServiceTime();//decrease service time
            if(customer.getServiceTime()==0)
            {
            line.removeCustomer();    //remove customer
            inQueue--;//decrement after service
            totalService++;//adding number of customer serviced
            //notify the customer have been removed
            System.out.println("Customer serviced and removed from the queue.  Quest length is now :" + inQueue);
            }
            }
            
            System.out.println("-----------------------------------");//each minute has passed
        }
        System.out.println("Total number of customers serviced is : " + totalService);//notify total serviced
        System.out.println("Maximum line length during the simulation :" + maxLine);//notify the max people in line
    } 
    
}
