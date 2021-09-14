
import java.util.Scanner;
//import java.util.Queue;


public class SLLVideostore extends SLL//ConstructAVLTree  

{
 
     //private video rootNode; //have video extend node and use video instead 
     //private video leftVideo = super.leftChild;
     //private video rightVideo = super.rightChild;
     boolean inStore = false;
     
     //− customer: Data Structure<… Customer>
     
     SLLcustomer customer = new SLLcustomer();
     SLLvideo outOfStore = new SLLvideo();


      
     //public VideoStore()
     //{
         
      //rootNode = null;  
       
     //}
             //− setVideoInStore(…): void
            public void setVideoInStore(String input)
            {
              Node temp = new Node(input, null);
              
              //temp.setElement(input);
              
              if(head == null)
               head = new Node(input, null);
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
                
                //this.add(temp);
            //this.head = head;
           
            //Node root = null;
           
            //videoInStore = videoInStore.insert(root, video);
              //root.data = input;
              
              /*SLL temp = this.head;
              int count = 0;
              
              while(temp.getElement() != input)
              {
               temp = temp.getNext(); 
               count++;              
              //put(input,input);                       
              //inStore = true;
              }
              temp = this.head;
              for(int i = 1; i < 0; i++)
              {*/
                  
                    
              //}

             }
             
             public boolean searchElement(String input)
             {
                  //String nana = "";
                  //head = new Node(head.getElement(),);
                  Node node = new Node(head.getElement(),head.getNext());
                  Node node1 = new Node(head.getElement(),head.getNext());

                  
                  //node = this.head;
                  //node1.setHead(head;

                  
                  int count = 1;
                  
                  boolean found; 
                  found = false;

                  
                  while(!(head.getNext() == null))
                  {
                  /*{
                      node1 = node1.next;

                  }*/
                  
                   count ++;

                 
                 
                  //Node node = this.head;
			      //boolean found = false;
			      //for(int i=1;i<count; i++){
				  //if(true)//{                //!head.getElement().equals(input)){
					//System.out.println("Item "+item+" was found at location "+i+" in the linked list");
                    found = true;
                    //count ++;
				   //}
			    	head = head.getNext();
			       //}
			       
                  }
                    if(head.getNext() == null)
                       found = (head.getElement().equals(input));

                  //found = true;
			
			//if(!found)
				//System.out.println("Item "+item+" was not found in the Linked list");
				//String nana = "";
				// = true;
				//System.out.println(count + node1.getElement() + input);

				return found;
                 
                 //return nana;
             }

             
             public String deleteVideo(String input)
             {
              //delete(input);
              String emptyString = "";
              //Node temp = new Node(null,null); 
              //temp = head;
              //temp.setNext(head.next);
              //temp = head;
              //int count = 0;
              
              /*while(temp.getElement() != input)
              {
               temp = head.getNext(); 
               count++;              
              //put(input,input);                       
              //inStore = true;
              }
              System.out.println(count);
              Node temp2 = temp.getNext();
              
              /*for(int i = 0; i < (count + 1); i++)
              {
               temp2 = head.getNext(); 
              } */
              
              /*Node holder = this.head;
              
              for(int i = 0; i < (count - 1); i++)
              {
               holder = head.getNext(); 
              }    
              
              holder.setNext(temp2);*/
              
              int count = 0;
              
              //if(head.getElement().equals(input))
                //head.setElement(null);
            
              Node temp = this.head;

    
              while(!temp.getElement().equals(input))
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
              //head.setNext(holder2);
              
              //head = holder
              
              inStore = false;
              return emptyString;
             }
             
             //− setCustomer(…): void
            public void setCustomer(String cInput)
            {
              /*Node temp = null;
              
              //if(head == null)
               //head.setElement(input);
              //else
              temp.setElement(cInput);
               
              customer.add(temp);     
             //customer.put(cInput,cInput);*/
             
             Node temp = new Node(cInput, null);
              
              //temp.setElement(input);
              
              if(customer.head == null)
               customer.head = new Node(cInput, null);
              //head.setElement(input);
              //else
              //this.(temp); 
              //this.head.setElement(input);
              else
                {
                //temp = temp.getNext();    
                customer.add(temp);
                //while(temp.getElement() != input)
                //{
                //temp = temp.getNext(); 
                //}
                } 
             
             
            }
            
            public String deleteCustomer(String cInput)
            {
             /*Node temp = customer.head;
             
              int count = 0;
              while(temp.getElement() != cInput)
              {
               temp = temp.getNext(); 
               count++;              
              //put(input,input);                       
              //inStore = true;
              }
              
              Node temp2 = customer.head;
              
              for(int i = 1; i < (count + 1); i++)
              {
               temp2 = temp2.getNext(); 
              } 
              
              Node holder = customer.head;
              
              for(int i = 1; i < (count - 1); i++)
              {
               holder = holder.getNext(); 
              }    
              
              holder.setNext(temp2);/*/
              
              int count = 0;
              
              //if(head.getElement().equals(input))
                //head.setElement(null);
            
              Node temp = customer.head;

    
              while(!temp.getElement().equals(cInput))
              {
              temp = temp.getNext(); 
              count++;
              }
              
              if(count == 0)
              customer.head = new Node("",customer.head.getNext());
              else
              {
               Node holder2 = temp.next;
               Node holder = customer.head;
              
              for(int i = 0; i < (count-1); i++)
              {
               holder = holder.getNext(); 
              }    
              
              holder.setNext(holder2);
              
                  
              }
              //head.setNext(holder2);
              
              //head = holder
              //String emptyString ="";
              inStore = false;
              //return emptyStringC;
             
             
             /*customer.delete(cInput);
             //inStore = false;*/
             String emptyStringC = "";

             return emptyStringC;

            }
            
             //− checkOut(…): boolean
             public boolean checkOut(String target, String target2)
             {
                 deleteVideo(target2);
                 outOfStore.setVideoR(target2);
                 customer.getRentVideo().setVideoR(target2);
                 /*String buffer = rootNode.element;
                 
                 while (rootNode.element == target)
                 {
                 if (buffer.compareTo(target) < 0)  
                    rootNode = rootNode.leftChild;  
                 else if (buffer.compareTo(target) > 0)
                    rootNode = rootNode.rightChild;  
                 }    
                 rootNode = null;*/
                 inStore = false;
                 return inStore;
                 
             }
             
             public boolean checkIn(String target)
             {
                 setVideoInStore(target);
                 outOfStore.deleteVideoR(target);
                 /*String buffer = rootNode.element;
                 
                 while (rootNode.element == target)
                 {
                 if (buffer.compareTo(target) < 0)  
                    rootNode = rootNode.leftChild;  
                 else if (buffer.compareTo(target) > 0)
                    rootNode = rootNode.rightChild;  
                 }    
                 rootNode = null;*/
                 customer.head.rentVideo.deleteVideoR(target);
                 inStore = true;
                 return inStore;
                 
             }

             
             //public boolean inStore()

             //− printAllVideos(): void
             public void printInStoreVideos()
             {
                 
               this.print();  
 
             }   
             
             //− printAllCustomers(): void
             public void printAllCustomers()
             {
                customer.print(); 
             }

             

            //VideoStore videoInStore = new VideoStore();
            
            public void printAllVideos()
             {
               this.print(); 
               outOfStore.getTitles();  
 
             }     
             
            //− printVideosRentByACustomer(…): void
            
            public void printVideosRentByACustomer(String cTargetx)
            { 
             customer.getRentVideo().getTitles();                       

               
             //customer.getRentVideo(cTarget);       
            
            }
            
            public void printVideosRent()
            { 
             outOfStore.print();
;                       

               
             //customer.getRentVideo(cTarget);       
            
            }

//}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

******************************************************************************
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}*/

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************
#include <stdio.h>

int main()
{
    printf("Hello World");

    return 0;
}*/

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

******************************************************************************
#include <stdio.h>

int main()
{
    printf("Hello World");

    return 0;
}
*/

//import java.util.Scanner;
//import java.util.Queue;





/*
  
// create Node class to design the structure of the AVL Tree Node  
class Node  
{      
    int element;  
    int h;  //for height  
    Node leftChild;  
    Node rightChild;  
      
    //default constructor to create null node  
    public Node()  
    {  
        leftChild = null;  
        rightChild = null;  
        element = 0;  
        h = 0;  
    }  
    // parameterized constructor  
    public Node(int element)  
    {  
        leftChild = null;  
        rightChild = null;  
        this.element = element;  
        h = 0;  
    }       
}  
  
// create class ConstructAVLTree for constructing AVL Tree  
class ConstructAVLTree  
{  
    private Node rootNode;       
  
    //Constructor to set null value to the rootNode  
    public ConstructAVLTree()  
    {  
        rootNode = null;  
    }  
      
    //create removeAll() method to make AVL Tree empty  
    public void removeAll()  
    {  
        rootNode = null;  
    }  
      
    // create checkEmpty() method to check whether the AVL Tree is empty or not  
    public boolean checkEmpty()  
    {  
        if(rootNode == null)  
            return true;  
        else   
            return false;  
    }  
      
    // create insertElement() to insert element to to the AVL Tree  
    public void insertElement(int element)  
    {  
        rootNode = insertElement(element, rootNode);  
    }  
      
    //create getHeight() method to get the height of the AVL Tree  
    private int getHeight(Node node )  
    {  
        return node == null ? -1 : node.h;  
    }  
      
    //create maxNode() method to get the maximum height from left and right node  
    private int getMaxHeight(int leftNodeHeight, int rightNodeHeight)  
    {  
    return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;  
    }  
      
      
    //create insertElement() method to insert data in the AVL Tree recursively   
    private Node insertElement(int element, Node node)  
    {  
        //check whether the node is null or not  
        if (node == null)  
            node = new Node(element);  
        //insert a node in case when the given element is lesser than the element of the root node  
        else if (element < node.element)  
        {  
            node.leftChild = insertElement( element, node.leftChild );  
            if( getHeight( node.leftChild ) - getHeight( node.rightChild ) == 2 )  
                if( element < node.leftChild.element )  
                    node = rotateWithLeftChild( node );  
                else  
                    node = doubleWithLeftChild( node );  
        }  
        else if( element > node.element )  
        {  
            node.rightChild = insertElement( element, node.rightChild );  
            if( getHeight( node.rightChild ) - getHeight( node.leftChild ) == 2 )  
                if( element > node.rightChild.element)  
                    node = rotateWithRightChild( node );  
                else  
                    node = doubleWithRightChild( node );  
        }  
        else  
            ;  // if the element is already present in the tree, we will do nothing   
        node.h = getMaxHeight( getHeight( node.leftChild ), getHeight( node.rightChild ) ) + 1;  
          
        return node;  
          
    }  
      
    // creating rotateWithLeftChild() method to perform rotation of binary tree node with left child        
    private Node rotateWithLeftChild(Node node2)  
    {  
        Node node1 = node2.leftChild;  
        node2.leftChild = node1.rightChild;  
        node1.rightChild = node2;  
        node2.h = getMaxHeight( getHeight( node2.leftChild ), getHeight( node2.rightChild ) ) + 1;  
        node1.h = getMaxHeight( getHeight( node1.leftChild ), node2.h ) + 1;  
        return node1;  
    }  
  
    // creating rotateWithRightChild() method to perform rotation of binary tree node with right child        
    private Node rotateWithRightChild(Node node1)  
    {  
        Node node2 = node1.rightChild;  
        node1.rightChild = node2.leftChild;  
        node2.leftChild = node1;  
        node1.h = getMaxHeight( getHeight( node1.leftChild ), getHeight( node1.rightChild ) ) + 1;  
        node2.h = getMaxHeight( getHeight( node2.rightChild ), node1.h ) + 1;  
        return node2;  
    }  
  
    //create doubleWithLeftChild() method to perform double rotation of binary tree node. This method first rotate the left child with its right child, and after that, node3 with the new left child  
    private Node doubleWithLeftChild(Node node3)  
    {  
        node3.leftChild = rotateWithRightChild( node3.leftChild );  
        return rotateWithLeftChild( node3 );  
    }  
  
    //create doubleWithRightChild() method to perform double rotation of binary tree node. This method first rotate the right child with its left child and after that node1 with the new right child  
    private Node doubleWithRightChild(Node node1)  
    {  
        node1.rightChild = rotateWithLeftChild( node1.rightChild );  
        return rotateWithRightChild( node1 );  
    }      
  
    //create getTotalNumberOfNodes() method to get total number of nodes in the AVL Tree  
    public int getTotalNumberOfNodes()  
    {  
        return getTotalNumberOfNodes(rootNode);  
    }  
    private int getTotalNumberOfNodes(Node head)  
    {  
        if (head == null)  
            return 0;  
        else  
        {  
            int length = 1;  
            length = length + getTotalNumberOfNodes(head.leftChild);  
            length = length + getTotalNumberOfNodes(head.rightChild);  
            return length;  
        }  
    }  
  
    //create searchElement() method to find an element in the AVL Tree  
    public boolean searchElement(int element)  
    {  
        return searchElement(rootNode, element);  
    }  
  
    private boolean searchElement(Node head, int element)  
    {  
        boolean check = false;  
        while ((head != null) && !check)  
        {  
            int headElement = head.element;  
            if (element < headElement)  
                head = head.leftChild;  
            else if (element > headElement)  
                head = head.rightChild;  
            else  
            {  
                check = true;  
                break;  
            }  
            check = searchElement(head, element);  
        }  
        return check;  
    }  
    // create inorderTraversal() method for traversing AVL Tree in in-order form  
    public void inorderTraversal()  
    {  
        inorderTraversal(rootNode);  
    }  
    private void inorderTraversal(Node head)  
    {  
        if (head != null)  
        {  
            inorderTraversal(head.leftChild);  
            System.out.print(head.element+" ");  
            inorderTraversal(head.rightChild);  
        }  
    }  
  
    // create preorderTraversal() method for traversing AVL Tree in pre-order form  
    public void preorderTraversal()  
    {  
        preorderTraversal(rootNode);  
    }  
    private void preorderTraversal(Node head)  
    {  
        if (head != null)  
        {  
            System.out.print(head.element+" ");  
            preorderTraversal(head.leftChild);               
            preorderTraversal(head.rightChild);  
        }  
    }  
      
    // create postorderTraversal() method for traversing AVL Tree in post-order form  
    public void postorderTraversal()  
    {  
        postorderTraversal(rootNode);  
    }  
      
    private void postorderTraversal(Node head)  
    {  
        if (head != null)  
        {  
            postorderTraversal(head.leftChild);               
            postorderTraversal(head.rightChild);  
            System.out.print(head.element+" ");  
        }  
    }       
} */ 
  
// create AVLTree class to construct AVL Tree  

//import java.util.Scanner;  

//public class Main//VideoStoreAVL
//{
    


//{
        //AVLTree videoInStore = new AVLTree();

        //− videoInStore: Data Structure<… Video>
       
  //      VideoStore videoInStore = new VideoStore();

        //− customer: Data Structure<… Customer>
       
       
        //− setVideoInStore(…): void
        //private void setVideoInStore(int video)
        //{
            //this.head = head;
           
            //Node root = null;
           
            //videoInStore = videoInStore.insert(root, video);


//        }


//public class Main//AVLTreeExample  
//{
    //main() method starts  
    /*public static void main(String[] args)  
    {              
        //creating Scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
  
        // create object of ConstructAVLTree class object for costructing AVL Tree  
        VideoStore obj = new VideoStore();   
  
        char choice;    //initialize a character type variable to choice  
        
        String temp;
          
        // perform operation of AVL Tree using switch  
        do      
        {  
            System.out.println("\nSelect an operation:\n");  
            System.out.println("1. To add a video");  
            System.out.println("2. To delete a video");  
            System.out.println("3. To add a customer");  
            System.out.println("4. To delete a customer");  
            //System.out.println("5. Remove all nodes from AVL Tree");
            System.out.println("5. To check if a particular video is in store");
            System.out.println("6. To check out a video");  
            System.out.println("7. To check in a video");  
            System.out.println("8. To print all customers");
            System.out.println("9. To print all videos");  
            System.out.println("10. To print in store videos");
            System.out.println("12. To print the videos rent by a customer");  

            System.out.println("13. To exit");  
  
            //get choice from user  
            int ch = sc.nextInt();              
            switch (ch)  
            {  
                case 1 :   
                    System.out.println("Please enter an element to insert in AVL Tree");  
                    //String get = "nana";
                    //String str= sc.next(); //reads string.
                    //obj.insertElement(sc.next());
                    obj.setVideoInStore(sc.next());      //insertElement( sc.nextInt() );                       
                    break;                            
                case 2 :   
                    System.out.println("Enter video to delete");  
                    System.out.println(obj.deleteVideo(sc.next()));  
                    break;                                            
                case 3 :   
                    //System.out.println(obj.getTotalNumberOfNodes());
                    System.out.println("Please enter a customer to insert in AVL Tree");  
                    obj.setCustomer(sc.next());      //insertElement( sc.nextInt() );                       
                    break;       
                case 4 :   
                    System.out.println("Enter Customer to delete");  
                    System.out.println(obj.deleteCustomer(sc.next()));  
                    break;       
                case 5 :   
                    System.out.println("Enter string element to search");  
                    System.out.println(obj.searchElement(sc.next()));  
                    //obj.removeAll();  
                    //System.out.println("\nTree Cleared successfully");  
                    break;  
                case 6 :   
                    //System.out.println("\nDisplay AVL Tree in Post order");
                    System.out.println("Enter Customer name");  
                    temp = sc.next();
                    System.out.println("Enter video to check out");  
                    obj.checkOut(temp,sc.next());  
                    break;  
                case 7 :   
                    //System.out.println("\nDisplay AVL Tree in Pre order");  
                    //obj.preorderTraversal();  
                    System.out.println("Enter Video to check in");  
                    obj.checkIn(sc.next()); 
                    //continue;
                    break;  
                case 8 :   
                    //System.out.println("\nDisplay AVL Tree in In order");  
                    obj.printAllCustomers();
                    //inorderTraversal();  
                    break;
                case 9 :   
                    //System.out.println("\nDisplay AVL Tree in In order");  
                    obj.printAllVideos();
                    //inorderTraversal();  
                    break;    
                case 10 :
                    //System.out.println("10: To print in store videos");  
                    obj.printInStoreVideos();
                    break;
                case 12 :
                    System.out.println("Enter Customer in question");
                    obj.printVideosRentByACustomer(sc.next());
                    //obj.printAllVideos();
                    break;    
                case 13 :   
                    System.out.println("Goodbye");
                    return;
                    //break;      
            }  
            System.out.println("\nPress 'y' or 'Y' to continue \n");  
            choice = sc.next().charAt(0);                          
        } while (choice == 'Y'|| choice == 'y');         
    }*/  
}  




