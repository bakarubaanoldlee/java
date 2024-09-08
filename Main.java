
/*  public class Main {
    public static void main(String[] args) {
        System.out.println("I like styles, I like dance, I like studying, I like shining,     I like ...");
    }
}                





// 2nd
public class Main {
    public static void main(String[] args) {
        System.out.println("I like styles");
        System.out.println("I like styles");
        System.out.println("I like styles");
        System.out.println("I like styles");
        System.out.println("I like styles");



        System.out.println("I like styles");
        System.out.println("I like styles");
    }
}                            





// 3rd
 public class Main {
    
    public static void main(String[] args) {
        String name = "Lim";
        int number = 23;

        System.out.println("Like " + name + ", Your age is" +number);
        System.out.println("Like " + name);
        System.out.println("Like " + name);
        System.out.println("I like " + name);
        
    }
}                    
         






// 4th
public class Main {
    
    public static void main(String[] args) {
        String name = "Lim";
        int number = 23;

        System.out.println("Like " + name + ", Your age is " + number); 
    }
}                  






//5th
/* public class Main {
     public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int  min = Integer.MIN_VALUE;
        System.out.println("The maximum value for an int = " + max);
        System.out.println("The minimum value for an int = " + min);

        byte maxBytevalue = Byte.MAX_VALUE; 
        byte minBytevalue = Byte.MIN_VALUE; 

        System.out.println("The maximum value for a byte = " + maxBytevalue);
        System.out.println("The minimum value for a byte = " + minBytevalue);

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("The maximum value for a long = " + maxLongValue);
        System.out.println("The minimmum value for a long = " + minLongValue);
     }
    }            






// 6th
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter your age: ");
int age = scanner.nextInt();
System.out.println("Your age is: "+age);

    }
}                 





public class Main {
    public static void main(String[] args) {
        short max = Short.MAX_VALUE;
        short min = Short.MIN_VALUE;

        System.out.println("Max short values: " +max);
        System.out.println("Min short values: " +min);
        

    }
}             





public class Main {
    public static void main(String[] args) {
       // float number = 3.14f;
        // double number2 = 2.0;
float maxfloatvalue = Float.MAX_VALUE;

float minfloatvalue = Float.MIN_VALUE;

System.out.println("Max float number = " +maxfloatvalue);
System.out.println("Min float number = " +minfloatvalue);

double maxdoublevalue = Double.MAX_VALUE;
double mindoublevalue = Double.MIN_VALUE;


System.out.println("Max double number = " +maxdoublevalue);
System.out.println("Min double number = " +mindoublevalue);

 }}                   










 public class Main {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println(letter);

    }}        




    public class Main {
        public static void main(String[] args) {
            boolean isActive = true;
            System.out.println(isActive);

        }}           






        public class Main {
            public static void main(String[] args) {
    float num1 =5f;
    int num2 = 3;

    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);

    int mynumber = 0;
    mynumber += 4;
    System.out.println(mynumber);

    ++mynumber;
    System.out.println(mynumber);
    System.out.println(++mynumber);

            }}            





   
 public class Main {
    public static void main(String[] args) {   
        int age = -10;

        if (age >= 18) {
        System.out.println("You can vote");   
        System.out.println("Please put an X in the ballot"); }

        else if(age !=20){
            System.out.println("Luck");
        }

        else if(age < 0) {
            System.out.println("Invalid input");
        }
         
        else {
            System.out.println("You can't vote\n Please come in " +(18 - age)+ " years' time");

        }
    }}              







    public class Main {
        public static void main(String[] args) { 
        boolean isActive = true;

        
        if (!isActive) {
            System.out.println("The user is active");
        }
        else{
            System.out.println("The user is inactive");
        }

         }}              







         public class Main {
            public static void main(String[] args) { 
            boolean isActive = false;
            int score = 100;
            if (score >= 100 && isActive){
                System.out.println("You open the next level");
            }
            else{
                System.out.println("You are at the same level");
            }
        
        }}

        // logical or, use ||            






// accepting input
        public class Main {
           public static Scanner scanner = new Scanner(System.in);
            public static void main(String[] args) { 
             System.out.println("Enter time of the day: ");
            int time = scanner.nextInt();
            switch(time){
                case 10: 
                    System.out.println("The time is " + time + " , \nthe time is for coffe");
                    break;
                case 12:
                    System.out.println("The time is " + time + "\n the time is for lunch");
                    break;
                default:
                    System.out.println("Time to shine");
                    break;
            }
        }}              */






// Loops
public class Main {
    public static void main(String[] args) { 
        for (int i = 0; i <= 10; i++) {
        System.out.println("i = " + i);
        }

    }}