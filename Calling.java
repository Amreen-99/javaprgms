class Call{
int add(int x,int y)
{int a;
a=x+y;
return a;
}
int sub(int x,int y)
{int b;
b=x-y;
return b;
}
int mul(int x,int y)
{int c;
c=x*y;
return c;
}
int div(int x,int y)
{int c;
c=x/y;
return c;
}}
 public class Calling{
public static void main(String []args){
Call obj=new Call();
System.out.println("sum="+obj.add(5,7));
System.out.println("subtraction="+obj.sub(5,7));
System.out.println("multiplication="+obj.mul(5,7));
System.out.println("division="+obj.mul(5,7));
}
}



 