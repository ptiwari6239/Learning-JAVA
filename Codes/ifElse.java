class ifElse{
    public static void main(String[] args){


        int a = 4; // java statically-typed language
                   // which means variables types   are known at compile time 
        
        if (a==5){
            System.out.print("the value of a is "+a); 
        }
        else if (a<0){                                               // simple syntax of if else
            System.out.println("the value of a is negative and it is " + a);
        }
        else{
            System.out.println("the value of a is not 5 and its is not negative it is "+a);
        }
        
    }
}