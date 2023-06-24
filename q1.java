


import java.util.*;
/*class Node
{
	protected int reg_no;
	protected float mark;
	protected Node next;
}

public class q1 extends Node{
	static Scanner sc=new Scanner (System.in);

	public static void create(Node start)
	{
		q1 p=new q1();
		System.out.println("enter the reg_no of first node ");
		p.reg_no=sc.nextInt();
	}
	public static void main(String[] args) {
		

	}

}*/
class Node
{
protected int regd_no;
protected Float mark;
protected Node next;
}
public class q1
{
	public static Node start=null;
	static Scanner sc=new Scanner (System.in);
public static void create(Node start)
{
	
	/*Node p=new Node();
	System.out.println("enter the reg_no and mark of first node");
	p.regd_no=sc.nextInt();
	p.mark=sc.nextFloat();
	p.next=null;
	start=p;*/
	Node p=start;//to give a node starting value
	System.out.println("enter your choice y/n");
	char ch=sc.next().charAt(0);
	
	while(ch!='n')
	{
		Node q=new Node();Scanner sc=new Scanner (System.in);
		System.out.println("enter new reg_no and mark");
		q.regd_no=sc.nextInt();
		q.mark=sc.nextFloat();
	    p.next=q;
	     p=q;
	     System.out.println("do you want to create more nodes y/n");
	     char ch1=sc.next().charAt(0);
	     ch=ch1;
		
	}
	

}
public static void display(Node start)
{
Node temp=start;
while(temp!=null)
{
	System.out.print(temp.regd_no+" "+temp.mark+"--->");
	temp=temp.next;
}
}
public static Node InsBeg(Node start)
{
	Node new_node=new Node();
	System.out.println("enter the reg no and marks of the new node to be inserted at beginning");
	new_node.regd_no=sc.nextInt();
	new_node.mark=sc.nextFloat();
	new_node.next=start;
	start=new_node;
	//display(start);
    return start ;
	
	
}
public static Node InsEnd(Node start)
{
	Node new_node=new Node();
	Node temp=start;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	System.out.println("enter the regd number and mark of the node at the ending");
	new_node.regd_no=sc.nextInt();
	new_node.mark=sc.nextFloat();
	temp.next=new_node;
	new_node.next=null;
	//display(start);
	return start;
}
public static Node InsAny(Node start)
{
	Node new_node=new Node();
	System.out.println("enter the regd no and mark  of the new node");
	new_node.regd_no=sc.nextInt();
	new_node.mark=sc.nextFloat();
	System.out.println("enter the postion the new node is to be inserted");
	int y=sc.nextInt();int i=1;
	Node temp=start;
	while(i<y-1)
	{
		temp=temp.next;i++;
	}
	new_node.next=temp.next;
	temp.next=new_node;
	return start ;
}
 public static Node DelBeg(Node start)
 {
	 Node temp=start;
	 start=temp.next;
	 temp=null;
	 return start;
 }
  public static Node DelEnd(Node start)
  {
	  Node temp=start;
	  while(temp.next.next!=null)
	  {
		  temp=temp.next;
	  }
	  temp.next=null;
	  return start;
  }
  public static Node DelAny(Node start)
  {
	  int pos;
	  System.out.println("enter position");
	  pos=sc.nextInt();
	  int i=1;
	  Node temp=start;
	  while(i<pos-1)
	  {
		 temp=temp.next; i++;
	  }
	  temp.next=temp.next.next;
	  return start;
  }
     public static Node delregdno(Node start)
     {
    	 Node temp=start;
    	 int regd;
    	 System.out.println("enter the registration number to be deleted");
    	 regd=sc.nextInt();
    	 if(temp.regd_no==regd)
    	 {
    		 start=temp.next;//at first position deletion
    	 }
    	 while(temp.next.regd_no!=regd)
    	 {
    		 
    		 temp=temp.next;
    	 }
    	 temp.next=temp.next.next;
    	 return start;
     }
     public static void search(Node start)
     { int f=0;
    	 Node temp=start;
    	 int regd;
    	 System.out.println("enter the regd number");
    	 regd=sc.nextInt();
    	 while(temp!=null)
    	 {
    		 if(temp.regd_no!=regd)
    		 temp=temp.next;
    		 else
    		 {
    			 f=1;
    			 Node r=temp;
    			 break;
    		 }
    		 
    	 }
    	 if(f==1)
    	 {
    		 float new_mark;
    		 System.out.println("enter marks");
    		 new_mark=sc.nextFloat();
    		 temp.mark=new_mark;
    		 
    	 }
    	 else
    	 {
    		 System.out.println("node not present");
    	 }
    	 display(start);
    	 
     }
     
      public static int count(Node start)
      {
    	  Node temp=start;int i=0;
    	  while(temp!=null)
    	  {
    		  i++;
    		  temp=temp.next;
    	  }
    	  return(i);
      }
      public static Node reverse(Node start)
      {
    	  Node p=null;Node q=start;Node r=q.next;q.next=null;
    	 // Node p=start;Node q=p.next;
    	  //start.next=null;
    	  while(r!=null)
    	  {
    		 /*q.next=p;
    		  q=p;
    		  q=q.next;*/
    		  p=q;
    		  q=r;
    		  r=r.next;
    	  q.next=p; }
    	  start=q;
    	  return start;
      }
      public static void sort(Node start)
      {
    	  int t=count(start);
    	  int r=0;
    	  Node p=start;
    	  Node q=p;
    	  for(int i=1;i<t;i++)
    	  {
    		 while(p!=null)
    		 {  if(p.next!=null)
    			 q=p.next;
    			 if(p.regd_no>q.regd_no)
    			 {
    		        int y=q.regd_no;
    		        q.regd_no=p.regd_no;
    		        p.regd_no=y;
    		        float m1=q.mark;
    		        q.mark=p.mark;
    		        p.mark=m1;
    		        
    		        
    			 }
    			 p=p.next;
    			 //q=p;
    			// p=p.next;
    		 }
    		 
    	  }
      }
/* Code for the remaining user defined methods*/
public static void main(String[] args) 
{
	Node p=new Node();
	System.out.println("enter the reg_no and mark of first node");
	p.regd_no=sc.nextInt();
	p.mark=sc.nextFloat();
	p.next=null;
	start=p;
	//create(start);
   
     
	
	//System.out.println("the intially entered linked list is=");
	//display(start);
	
		
	
	
	
//System.out.println("enter ");
	
while(true)
{
System.out.println("\n****MENU*****");
System.out.println("0:Exit");
System.out.println("1:Creation");
System.out.println("2:Display");
System.out.println("3:insert at beginning");
System.out.println("4insert at end");
System.out.println("5 insert in middle");
System.out.println("6:delete at beginning");
System.out.println("7:delete at end");
System.out.println("8:delete in the middle");
System.out.println("9:delete a node according to the reg_no");
System.out.println("10:search if the noide with regnumber is present or not");
System.out.println("11:sort the  nodes");
System.out.println("12:count the  number of nodes");
System.out.println("13:reverse the linked list");
System.out.println("enter your choice");
int choice=sc.nextInt();
switch(choice)
{
case 0:
System.exit(0);
case 1:
create(start);
break;

case 2:
display(start);
break;

case 3:
	 Node ob1=InsBeg(start);
     display(ob1);
break;

case 4:
	Node ob2=InsEnd( start);
    display(ob2);
break;

case 5:
	Node ob3=InsAny(start);
	display(ob3);
break;

case 6:
	System.out.println("\nthe linked list after deleting the first node ");
	Node ob4=DelBeg(start);
	display(ob4);
break;

case 7:
	System.out.println("\nthe list after deleting the last node");
	Node obj5= DelEnd(start);
	display(obj5);
break;

case 8:
	System.out.println("\nthe node after deletion at a given specific position is");
	Node ob6=DelAny( start);
	display(ob6);
break;

case 9:
	System.out.println("\nthe list after deleting the node with regn number");
	Node ob7=delregdno(start);
	display(ob7);
			break;
case 10:
	System.out.println("\nthe node searched based on regd_no and updated mark is");
	search(start);
break;

case 12:
int y=count(start);
System.out.println("the number of nodes="+y);

break;
case 11:
sort(start);

break;
case 13:
	System.out.println("the linked list after  reverse is=");
	Node ob8=reverse(start);
	display(ob8);
	break;
default:
System.out.println("Wrong choice");
}
}
}
}







