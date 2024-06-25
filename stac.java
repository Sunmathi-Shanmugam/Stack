import java.util.*;
class stack
{
  int size;
  int arr[];
  int top;
    stack (int s)
  {
	size = s;
	arr = new int[s];
	  top = -1;
  }

  boolean isfull ()
  {
	return top == size - 1;
  }

  boolean isempty ()
  {
	return top == -1;
  }

  void push (int d)
  {
	if (isfull ())
	  {
		System.out.println (":(Sorry! your Stack is overflow");
	  }
	else
	  {
		top++;
		arr[top] = d;
	  }
	return;
  }

  int pop ()
  {
	if (isempty ())
	  {
		System.out.println (":(Sorry! your Stack is underflow");
		return -10;
	  }
	else
	  {
		int d = arr[top];
		top--;
		return d;
	  }
  }

  void peek ()
  {
	if (isempty ())
	  {
		System.out.println (":(Sorry! your Stack is underflow");
	  }
	else
	  {
		System.out.println ("[.] Your Peek value is " + arr[top]);
	  }
  }

  void display ()
  {
	if (isempty ())
	  {
		System.out.println (":(Sorry! your Stack is underflow");
	  }
	else
	  {
		for (int i = top; i >= 0; i--)
		  System.out.print (arr[i] + " ");
		System.out.println ("\n");
	  }
	return;
  }
}


public class stac
{
  public static void main (String args[])
  {
	System.out.print (" |:-:|Please! Enter the size of the stack|:-:| ");
	Scanner s = new Scanner (System.in);
	int n = s.nextInt ();
	int c;
	stack s1 = new stack (n);
	do
	  {
		System.out.println ("1.PUSH");
		System.out.println ("2.POP");
		System.out.println ("3.PEEK");
		System.out.println ("4.DISPLAY");
		System.out.println ("5.EXIT");
		System.out.println ("\n Hello Pick your Choice <*~*>: ");
		c = s.nextInt();
		switch (c)
		  {
		  case 1:
			System.out.print ("Hey your value is INSERTED from the Stack[*'.'*]: ");
			int v = s.nextInt ();
			  s1.push (v);
			  break;
			case 2:System.out.println ("Your value is DELETED From the Stack (^~^) " +
									   s1.pop ());
			  break;
			case 3:s1.peek ();
			  break;
			case 4:s1.display ();
			case 5:System.out.println ("ThankYou <@~@>");

			  break;
			default:System.out.println ("PLEASE!(*~*) Enter valid option");
		  }
	  }
	while(c!=5);
 }
}