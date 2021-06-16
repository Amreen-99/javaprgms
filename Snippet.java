public class Snippet{
int add(int ...x){
int sum=0;
for(int i=0;i<x.length;i++)
{
sum=sum+x[i];
}
return sum;
}
public static void main(String []args){
Snippet s=new Snippet();
System.out.println("sum=" +s.add(3,4,5));
}
}