import java.util.Scanner;
public class InputKeyboard
{
    public static void main(String[] args)
    {
       String firstname,lastname;
        int age;
        Scanner SC= new Scanner(System.in);
          firstname=SC.next();
          lastname=SC.next();
           age=SC.nextInt();
System.out.println("Firstname:"+firstname);
System.out.println("lastname:"+lastname);
System.out.println("Age:"+age);
        
}
}

  