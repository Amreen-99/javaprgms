public class Calculate{
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
public static void main(String []args){
Calculate obj=new Calculate();
System.out.println("sum="+obj.add(5,7));
System.out.println("subtraction="+obj.sub(5,7));
System.out.println("multiplication="+obj.mul(5,7));
}
}



 