/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


    
    
public class Node{
private String element;    
    
Node next;    
SLLvideo rentVideo = new SLLvideo();    
    
public Node(String element, Node next)
{    
    
this.element = element;
this.next = next;}

public String getElement(){return element;
}
public Node getNext(){return next;}
public void setElement(String element){this.element = element;}
public void setNext(Node next){this.next = next;}

}
