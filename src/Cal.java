import java.util.Scanner;

public class Cal {
    static int sum(int a,int b ){
        return a+b;
    }
    static int diff(int a , int b ){
        return a-b;
    }
    static int multi(int a , int b ){
        return a*b;
    }
    static int div(int a , int b){
        return a/b;
    }
    public static void main(String[] args){
        System.out.println("Hello user, please tell us your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("WELCOME "+ name + " GOOD TO SEE YOU HERE ");
        System.out.println("What you wannan do ?");
        System.out.println("Here are your options ");
        System.out.println("1 -- sum");
        System.out.println("2 -- diff");
        System.out.println("3 -- multi");
        System.out.println("4 -- div");
        int  input = scan.nextInt();
        System.out.println("Enter your digits ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (input==1){
            System.out.println(sum(num1,num2));

        }
        else if (input == 2){
            System.out.println(diff(num1,num2));

        }
        else if (input ==3){
            System.out.println(multi(num1,num2));

        }
        else{
            System.out.println(div(num1,num2));
        }
        System.out.println("Hope you got the results you wanted !! ");

    }
}