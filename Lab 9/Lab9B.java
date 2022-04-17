package RanasiaC;

import java.util.Scanner;

public class Lab9B {
    public static String repeatNTimes(String m,int n){
        //Base case:
        if(n==0){
            return "";
        }
        //Relationship:
        return m+repeatNTimes(m,n-1);
    }

    public static boolean isReverse(String s1,String s2){
        int x1=s1.length();
        int x2=s2.length();
        //base case:
        if(s1.equals("")&&s2.equals("")){
            return true;
        }
        else if(x1!=x2){
            return false;
            //different length means they aren't the same
        }
        //relationship:
        char y1=s1.charAt(0);
        char y2=s2.charAt(x2-1);
        if(y1==y2){
            //keeps on removing the first char until we return to a null string
            return isReverse(s1.substring(1),s2.substring(0,x2-1));
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String m= "I must study recursion until it makes sense\n";
        String firstString;
        String secondString;
        int n=100;
        String result= repeatNTimes(m,n);
        System.out.println(result);
        System.out.println("Enter the first string");
        firstString=sc.nextLine();
        System.out.println("Enter the second string");
        secondString=sc.nextLine();
        if(isReverse(firstString,secondString)){
            System.out.println(firstString+" is the reverse of "+secondString);
        }
        else if(!isReverse(firstString, secondString)) {
            System.out.println(firstString+" is not the reverse of "+secondString);

        }
    }
}
