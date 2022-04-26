import java.util.Scanner;

public class Nestedcondition {

    public static void main (String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice \n 1:Greater between three number \t 2:Area of rectangle \t 3: cube if no is divided by 7 \t 4:Accept age and gender");
        ch= sc.nextInt();
        switch (ch)
        {
            case 1:
                int num1,num2,num3;
                System.out.println("Enter three number:");
                num1=sc.nextInt();
                num2=sc.nextInt();
                num3=sc.nextInt();
                if (num1>num2 && num1>num3)
                {
                    System.out.println("Largest number is:"+num1);

                }
                else if (num2>num3)
                {
                    System.out.println("Largest number is:"+num2);
                }
                else
                {
                    System.out.println("Largest number is:"+num3);
                }
                break;

            case 2:
                int l,w,area;
                System.out.println("Enter length and width:");
                l=sc.nextInt();
                w=sc.nextInt();
                area=l*w;
                System.out.println("Area of rectangle is:"+area);
                break;

            case 3:
                int num,cube;
                System.out.println("Enter a number:");
                num=sc.nextInt();
                if (num%7==0)
                {
                    System.out.println("The number is divisible by 7");
                    cube=num*num*num;
                    System.out.println("The cube is:"+cube);

                }
                else
                {
                    System.out.println("The number is not divisible by 7 ");
                }
                break;

            case 4:
                int age;
                char gen;
                System.out.println("Enter age and gen:");
                age= sc.nextInt();
                gen=sc.next().charAt(0);
                if (age>=60 && gen=='m')
                {
                    System.out.println("IR 7%");
                }
                else if (age>=60 && gen=='f')
                {
                    System.out.println("IR 7.5%");
                }
                else
                {
                    System.out.println("IR 5%");
                }
        }
    }
}
