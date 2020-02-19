import java.util.*;
class postfixEvaluation
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String exp=new String(in.nextLine());
    System.out.println(eval(exp));
  }
  public static int eval(String exp)
  {
    char c;
    Stack s=new Stack();
    for(int i=0;i<exp.length();i++)
    {
      c=exp.charAt(i);
      if(c>='0' && c<='9')
        s.push(c-'0');
      else
      {
        int op2=s.pop(),op1=s.pop();
        switch(c)
        {
          case '+': s.push(op1+op2); break;
          case '-': s.push(op1-op2); break;
          case '*': s.push(op1*op2); break;
          case '/': s.push(op1/op2); break;
          case '^': s.push((int)Math.pow(op1,op2)); break;
        }
      }
    }
    return s.pop();
  }
}
class Stack
{
  private LinkList head;
  public Stack()
  {
    head=null;
  }

  public boolean isEmpty()
  {
    return head==null;
  }

  public void push(int c)
  {
    LinkList l=new LinkList(c);
    l.next=head;
    head=l;
  }

  public int pop()
  {
    if(isEmpty())
      return -1;
    int x=head.data;
    head=head.next;
    return x;
  }

  public int peek()
  {
    return head.data;
  }
}
class LinkList
{
  public int data;
  public LinkList next;
  public LinkList(int c)
  { data = c; }
}