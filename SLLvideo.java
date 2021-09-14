public class SLLvideo extends SLL//ConstructAVLTree  
{
//  − title: String

//Node vidName = root;  
  
//− id: String

//String Customer;

//+ Video(…)


//+ getTitle(): String
public void getTitles()
{
  print();   
}

//+ getId(): String
//public String getId()
//{
  //return Customer;    
//}
public void setVideoR(String cInput)
            {
              /*Node temp = null;
              
              //if(head == null)
               //head.setElement(input);
              //else
              temp.setElement(cInput);
               
              this.add(temp); */    
              
               Node temp = new Node(cInput, null);
              
              //temp.setElement(input);
              
              if(head == null)
               head = new Node(cInput, null);
              //head.setElement(input);
              //else
              //this.(temp); 
              //this.head.setElement(input);
              else
                {
                //temp = temp.getNext();    
                this.add(temp);
                //while(temp.getElement() != input)
                //{
                //temp = temp.getNext(); 
                //}
                } 
             //customer.put(cInput,cInput);
            }

public String deleteVideoR(String cInput)
            {
             /*Node temp = this.head;
             
              int count = 0;
              while(!temp.getElement().equals(cInput))
              {
               temp = temp.getNext(); 
               count++;              
              //put(input,input);                       
              //inStore = true;
              }
              
              Node temp2 = this.head;
              
              for(int i = 1; i < (count + 1); i++)
              {
               temp2 = temp2.getNext(); 
              } 
              
              Node holder = this.head;
              
              for(int i = 1; i < (count - 1); i++)
              {
               holder = holder.getNext(); 
              }    
              
              holder.setNext(temp2);*/
             
             
             
             //customer.delete(cInput);
             
             //inStore = false;
              int count = 0;
              
              //if(head.getElement().equals(input))
                //head.setElement(null);
            
              Node temp = this.head;

    
              while(!temp.getElement().equals(cInput))
              {
              temp = temp.getNext(); 
              count++;
              }
              
              if(count == 0)
              head = new Node("",head.getNext());
              else
              {
               Node holder2 = temp.next;
               Node holder = this.head;
              
              for(int i = 0; i < (count-1); i++)
              {
               holder = holder.getNext(); 
              }    
              
              holder.setNext(holder2);
              
                  
              }
             String emptyStringC = "";

             return emptyStringC;

            }


//+ toString(): String
}
