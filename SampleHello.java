import java.util.*;
public class SampleHello {
    static int a = 50;
    static int b = 60;
    static int age;
    static int s;
    static int first_no;
    static int second_no;
    String name = "Puja Yadav";
    String address = "Campus Chowk";
    String Phone_no = "9844022925";

    public static void main(String[] args) {
        //addition();
        Loop.PrimeNumber();
       // Loop.MarkStatus();
       // Loop.TableMultiples();
       // Loop.SumOfNaturalNumber();
       // Loop.NumberFrom1To10();
        //Loop.LoopHelloWorld();
       // CheckMonthNameWithNumber();
       // CheckHelloLanguage();
        //CheckTwoNumbers();
        // CheckOddEven();
        //CompareAge();
        // InputTwoNumber();
        // addition();
        // Subtaraction();
        //  Multiplication();
        //Division();
    }

    public static void addition() {
        s = a + b;
        System.out.println(s);
    }

    public static void Subtaraction() {
        s = a - b;
        System.out.println(s);
    }

    public static void Multiplication() {
        s = a * b;
        System.out.println("Multiplication" + s);
    }

    public static void Division() {
        s = a / b;
        System.out.println(s);
    }

    public static void InputTwoNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your first number");
        int first_no = sc.nextInt();
        System.out.println("Enter Your Second number");
        int Second_no = sc.nextInt();

        int sum = first_no + Second_no;
        System.out.println(" Sum of two number is " + sum);

        System.out.println("Enter your first number");
        System.out.println("Enter Your Second Number");

    }

    public static void CompareAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your age");
        age = sc.nextInt();

        if (age <= 18) {
            System.out.println("Still you are a child");

        } else if (age > 18 && age < 60) {
            System.out.println("you are adult");

        } else {
            System.out.println("you are old");
        }
    }

    public static void CheckOddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static void CheckTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number");
        int first_num = sc.nextInt();
        System.out.println("Enter your Second Number");
        int second_num = sc.nextInt();

        if (first_num < second_num) {
            System.out.println("Second Number is greater");

        } else if (second_num < first_num) {
            System.out.println("First Number is greater");

        } else {
            System.out.println("Number is equal");
        }
    }

    public static void CheckHelloLanguage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and get Hello in different language");
        int num = sc.nextInt();
        /* if(num==1){
             System.out.println("Hello");
         } else if (num==2) {
             System.out.println("Namaste");

         } else if (num==3) {
             System.out.println("Bonjour");

         } else{
             System.out.println("Please Select the Number from 1 to 3 to get hello");
         }*/

        switch (num) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Please Select number from 1 to 3");
                break;
        }

    }
    public static void CheckMonthNameWithNumber () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to see the month name");
        int month_no = sc.nextInt();

             switch(month_no){
                 case 1:
                     System.out.println("January");
                     break;

                 case 2:
                     System.out.println("Feburary");
                     break;

                 case 3:
                     System.out.println("March");
                     break;

                 case 4:
                     System.out.println("April");
                     break;

                 case 5:
                     System.out.println("May");
                     break;

                 case 6:
                     System.out.println("June");
                     break;

                 case 7:
                     System.out.println("July");
                     break;

                 case 8:
                     System.out.println("August");
                     break;

                 case 9:
                     System.out.println("September");
                     break;
                 case 10:
                     System.out.println("October");
                     break;
                 case 11:
                     System.out.println("November");
                     break;
                 case 12:
                     System.out.println("December");
                     break;
                 default:
                     System.out.println("there is only 12 months ");
                     break;

             }
         }
    }


