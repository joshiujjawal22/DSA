import java.util.*;
class infix_to_postfix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(intopo(a));
	}
		public static String intopo(String a)
		{
			String  z=new String();
			LinkStack s=new LinkStack();
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)=='(') s.push(a.charAt(i));
				else if( (a.charAt(i)>='a'&&a.charAt(i)<='z') || (a.charAt(i)>='A'&&a.charAt(i)<='Z') )
					z+=a.charAt(i);
				else if(a.charAt(i)==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
					z+=s.pop();
				if(!s.isEmpty())
					s.pop();
				else
					return "Wrong expression";
			}
			else
			{
				while(!s.isEmpty() && pi(s.peek())>=pi(a.charAt(i)))
					z+=s.pop();
				s.push(a.charAt(i));
			}
		}
		while(!s.isEmpty())
			z+=s.pop();
		return z;
	}
	public static int pi(char c)
	{
		switch(c)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			default:
				return 0;
		}
	}
			}
		
	
class LinkList
{
  public char d;
  public LinkList next; 
  public LinkList(char dd)
  { d = dd; } 
}

class LinkStack
{
  private LinkList first; 
  public LinkStack() 
  {
    first = null; 
  }
  public boolean isEmpty()
  {
    return (first==null); 
  }
  public void push(char dd)
  {
    LinkList newLink = new LinkList(dd);
    newLink.next = first; 
    first = newLink; 
  }
  public char pop()
  {
    if (isEmpty())
    {
      return '\0';
    }
    char temp = first.d;
    first = first.next; 
    return temp;
  }
  public char peek(){
  	return first.d;
  }
}