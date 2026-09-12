import java.util.Scanner;


public class Patterns{
    public static void main(String[] args){
        boolean run = true;

        try(Scanner read = new Scanner(System.in)){
            do {
            System.out.println(""" 
                 What would you like to print?  
                 0. END PROGRAM  
                 1. Square  
                 2. Hollow Square 
                 3. Triangle  
                 4. Inverse Triangle
                 5. Solid Pyramid
                 6. Rectangle
                 7. Hollow Rectangle """);
            System.out.println("======================================================");
            int input = read.nextInt();
            if (input == 0){
                run = false;
            }
            else if (input>7 || input<0) {
                System.out.println("======================================================\n Only input from the options given fool.\n ======================================================");         

            }
            else {
                System.out.println("======================================================\n Put in a number \n");
                int n = read.nextInt();
                switch (input) {
                    case 1:
                        Square(n);
                        break;
                    case 2:
                        HollowSquare(n);
                        break;
                    case 3:
                        Triangle(n);
                        break;
                    case 4:
                        InvTriangle(n);
                        break;
                    
                    case 5:
                        Pyramid(n);
                        break;
                    case 6:
                        System.out.println("======================================================\n Put in another number \n");
                        int m = read.nextInt();
                        Rectangle(n,m);
                        break;
                    case 7: 
                        System.out.println("======================================================\n Put in another number \n");
                        m = read.nextInt();
                        HRectangle(n,m);
                        break;
                        
                }
            }} while (run); 

        }
       
    }

    public static void Square(int n){
        for (int row= 0; row<n; row++){
            System.err.println("* ".repeat(n));
        }
        System.out.println("\n======================================================");

    }

    public static void HollowSquare(int n){
        for (int row = 1; row<=n; row++){
            if (row == 1 || row==n){
                System.out.println("* ".repeat(n));
            }
            else{
                System.out.println("* "+"  ".repeat(n-2)+"* ");
            }
        }
        System.out.println("\n======================================================");

    }

    public static void Triangle(int n){
        for (int i=1; i<=n; i++){
            System.err.println("");
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
        }
        System.out.println("\n======================================================");

    }

    public static void InvTriangle(int n){
        for (int i=0; i<n; i++){
            System.out.println();
            for (int j = 0; j<(n-i); j++ ){
                System.out.print("* ");
            }
        }
        System.out.println("\n==========================================");
    }
    
    public static void Pyramid(int n){
        for (int i=1; i<=n; i++){
            System.out.println();
            for (int j = 1; j<=n; j++){
                if (j<=n-i){System.out.print(" ");}
                else {System.out.print("* ");}
            }

        }
        System.out.println("\n==========================================");
    }
    public static void Rectangle(int h, int w){
        System.out.println();
        for (int i=1; i<=h; i++){
            System.out.println("* ".repeat(w));
        }
        System.out.println();
    }
    public static void HRectangle(int h, int w){
        for (int i=1; i<=h; i++){
            if (i==1||i==h){System.out.println("* ".repeat(w));}
            else{System.out.println("* "+"  ".repeat(w-2)+"*");}
                    
           } 
        }
    }

    



