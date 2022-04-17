package RanasiaC;

import java.util.Scanner;

public class Lab9A {
    public static int recursive_multiply(int x, int y) { //our y is our second number and our x is our first
        //Base Case:                                     // I like using letters to represent
        if(y==0){                                        //unknowns.
            return 0;
        }
        //Relationship:
        else{
            return x+recursive_multiply(x,y-1);
        }
    }
    public static int recursive_div(int x,int y){
        //Base cases and conditions:
        if(y==0){
            return -1;
        }
        else if(x==y){
            return 1;
        }
        else if(x<y){
            return 0;
        }
        //Relationship:
        else {
            return 1+ recursive_div(x - y, y);
        }
    }
    public static int recursive_mod(int x,int y){
        if(y==0){
            return -1;
        }
        else if(x<y){
            return x;
        }
        else {
            return y - recursive_mod(x-y,y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        do {
            int x=0; //Number 1
            int y=0; //Number 2
            int result;
            System.out.println("Choose from the following:");
            System.out.println("0. Quit\n" +
                    "1. Multiply 2 numbers\n" +
                    "2. Div 2 numbers\n" +
                    "3. Mod 2 numbers");
            userChoice = sc.nextInt();
            if(userChoice!=0) {
                System.out.println("Enter first number");
                x = sc.nextInt();
                System.out.println("Enter second number");
                y = sc.nextInt();
            }
            switch (userChoice) {
                case 1:
                    System.out.println("Answer: "+recursive_multiply(x, y));
                    break;
                case 2:
                    System.out.println("Answer: "+recursive_div(x, y));
                    break;
                case 3:
                    System.out.println("Answer: "+recursive_mod(x, y));
                    break;
            }
        } while (userChoice != 0);
    }
}
