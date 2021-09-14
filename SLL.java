/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//SLL addendum
public class SLL{
public Node head;
public SLL(){
head = null;
}
public Node getHead(){
return head;
}
public void setHead(Node head){
this.head = head;
}
public void print(){
Node current = head;
while(current !=null){
System.out.println(current.getElement());
current = current.getNext();
}
//System.out.println();
}

public void add(Node n){
if(head == null){
head = n;
}
else{
Node current = head;

while(current.getNext() != null){
current = current.getNext();    
}
current.setNext(n);
}
n.setNext(null);

}

public void remove(){
    
Node current = head; 

Node scurrent = head;

if (head != null)
System.out.println("");
else{
while (current.getNext() == null){
current.setNext(head.getNext());
//scurrent.setNext(scurrent);
}

head = new Node(current.getElement(),null);
}


} 


public void reverse(){
   // Node reverse(Node node)
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
        next = current.getNext();
        current.setNext(prev);
        prev = current;
        current = next;
}

head.setNext(prev);

}



//while  
//}
}

 

    
    