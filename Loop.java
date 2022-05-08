import java.util.Scanner;

public class Loop {
    public static  void  LoopHelloWorld(){
         int i =0;
         for (i=1;i<=100;i++){
             System.out.println("Hello World");
         }
    }

    public static void NumberFrom1To10(){
        int i=0;
        for(i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void SumOfNaturalNumber()
    {
        int  sum=0;
        int i=0;
        for(i=0;i<=10;i++){
           sum=sum+i;
            }
            System.out.println(sum);

        }
        public static void TableMultiples(){
        int i=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Print table number which you want to print");
            int num = sc.nextInt();
            int multiple;
            for(i=1;i<=10;i++){
                multiple =i*num;
                System.out.println(multiple);
            }

        }
        public static void MarkStatus(){
        boolean num;
        Scanner sc =new Scanner(System.in);
            System.out.println("Tell me Number");
            int r = sc.nextInt();
            if (r==1) {
                // boolean num = sc.hasNextBoolean();

                do {

                    int marks = sc.nextInt();
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (89 >= marks && marks >= 60) {
                        System.out.println("Good");
                    } else {
                        System.out.println("good");
                    }
                }
                while (r == 1);

            }
        else {
                System.out.println("Stop");
            }

        }
        public static  void PrimeNumber(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number which you want to check whether it is prime or not");
            int num = sc.nextInt();
            int i;
            int prime_Check;

                if(num%1==0 || num %2==0){
                    System.out.println("This is a not prime Number");
                } else if (num==1) {
                    System.out.println("IT is not a prime number");


                }
                else{
                    System.out.println("this is a primmmmeee number");
                }

        }
    }

