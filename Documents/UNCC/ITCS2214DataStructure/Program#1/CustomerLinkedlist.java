
/**
 * Write a description of class CustomerLinkedlist here.
 * 
 * @author (Kheang Tang) 
 * @version (02/24/2015)
 */
public class CustomerLinkedlist
{
    private Customer first, last;//declare variable to private
    
    //default constructor set first and last customer to null
    public CustomerLinkedlist()
    {
        first = null;
        last = null;
    }
    
    public boolean isEmpty()
    {
        return first == null; //return null if there nothing in the list
    }
    
    
    public void add (Customer newCustomer)// add method
    {
        if(isEmpty())//check if nothing in the list
        {
            first = newCustomer;// set new customer in the list
        }else{
            last.setNext(newCustomer);//if someone in the list then put in the last 
        }
        last = newCustomer;//reference the last to the last customer
    }
        
    public Customer remove() //remove method
    {
      if( isEmpty() )   return null;  
      Customer newCustomer = first;                   //store reference to first      
      if(first == last){                  //only 1 person in queue
         last = null;
      }      
      first = first.getNext();            //set first to next in queue      
      return newCustomer;                           //return the stored person     
    }
    
    public Customer peek()
    {
        return first;
    }
}
