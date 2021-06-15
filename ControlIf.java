public class ControlIf
{ 
void c1(){
int a = 0;
System.out.println("**if statement**");
if (a > 5){
System.out.println("greater than 5");}
else{
System.out.println("less than 5");}
}
void c2(){
int value=3;
System.out.println("**switch statement**");
switch (value) {
case 1:
System.out.println("first");
break;
case 2:
System.out.println("second");
break;
case 3:
System.out.println("third");
break;
default:
System.out.println("Have a nice day");
}
}
void c3(){
int num=1;
System.out.println("**while statement**");
while(num<10)
{
System.out.println(num);
num++;}}
void c4(){
int num=1;
System.out.println("**do while statement**");
do{
System.out.println(num);
num++;
}
while(num<10);}
void c5(){
System.out.println("**for statement**");
for(int i=0;i<10;i++)
{
System.out.print("*");}}
void c6(){
int s[] = {18,25,28,29,30};
for (int i : s) {
System.out.println(i);
}
}
void c7(){
int a;
for(a=0;a<10;a++){
if(a==5)break;
System.out.println(a);}
System.out.println("break complete");
}
void c8(){
int a;
for(a=0;a<10;a++){
if(a==5)
continue;
System.out.println(a);
}
}
public static void main(String args[])
{ControlIf obj=new ControlIf();
obj.c1();
obj.c2();
obj.c3();
obj.c4();
obj.c5();
obj.c6();
obj.c7();
obj.c8();}
}
