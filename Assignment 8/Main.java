package RanasiaC;

import java.util.Scanner;

public class Main {
    public static String decimal2Binary(int decimal) {
        String binaryNum = Integer.toString(decimal%2);
        //Base Case:
        if (decimal < 1) {
            return "";
        }
        //relationship
        else
            return  decimal2Binary((decimal / 2))+binaryNum ;
            //we are calling the method until decimal is less than 1 and
           //every time we call we are converting a reminder into a string
            //and storing it into our stack until decimal is less than 1
    }
    public static String decimal2Hexadecimal(int decimal){
        final int THRESHOLD_OF_NUMBER=9;
        String binaryNum="";
        if(decimal%16>THRESHOLD_OF_NUMBER){
            if(decimal%16==10){
                binaryNum="A";
            }
            else if(decimal%16==11){
                binaryNum="B";
            }
            else if(decimal%16==12){
                binaryNum="C";
            }
            else if(decimal%16==13){
                binaryNum="D";
            }
            else if(decimal%16==14){
                binaryNum="E";
            }
            else if(decimal%16==15){
                binaryNum="F";
            }
        }
        else{
             binaryNum= Integer.toString(decimal%16);
        }
        //Base Case:
        if(decimal<1){
            binaryNum="";
            return binaryNum;
        }
        //relationship:
        else
            return decimal2Hexadecimal(decimal/16)+binaryNum;
    }
    public static String convertIpAddress(String [] ipAddress,int ipAddressArrayIndex){
        //Base Case:
        if(ipAddressArrayIndex==0){
            String currentNumber =ipAddress[0];
            int currentIpNumber=Integer.parseInt(currentNumber);
            return decimal2Binary(currentIpNumber);
        }
        //relationship:
        else {
            String currentNumber =ipAddress[ipAddressArrayIndex];
            int currentIpNumber=Integer.parseInt(currentNumber);
            return convertIpAddress(ipAddress,(ipAddressArrayIndex-1))+"."+decimal2Binary(currentIpNumber);
        }
    }
    public static String convertMacAddress(String [] macAddress,int macAddressArrayIndex){
        //Base Case:
        if(macAddressArrayIndex==0){
            //if index is 0 then it's the final number to convert in array
            String currentMacAddress=macAddress[0];
            int currentMacAddressToInt=Integer.parseInt(currentMacAddress);
            return decimal2Hexadecimal(currentMacAddressToInt);
        }
        //Relationship:
        else{
            String currentMacAddress=macAddress[macAddressArrayIndex];
            int currentMacAddressToInt=Integer.parseInt(currentMacAddress);
            //Storing the decimalHexNum in stack until the final numb then we'll recall the stored num
            return convertMacAddress(macAddress,(macAddressArrayIndex-1))+":"+decimal2Hexadecimal(currentMacAddressToInt);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userChoice;
        int decimalInteger;
        String ipAddress;
        String macAddress;
        do{
            System.out.println("");
            System.out.println("1 – Convert Decimal Number to Binary Number\n" +
                    "2 – Convert Decimal Number to Hexadecimal Number\n" +
                    "3 – Convert Decimal IP Address to Binary IP Address\n" +
                    "4 – Convert Decimal MAC Address to Hexadecimal MAC Address\n" +
                    "5 – Exit");
            System.out.println("");
            System.out.print("Enter Choice:");
            userChoice= sc.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("");
                    System.out.print("Enter Decimal Integer:");
                    decimalInteger=sc.nextInt();
                    System.out.println("Decimal Number: "+decimalInteger);
                    System.out.println("Binary Number: "+(decimal2Binary(decimalInteger)).trim());
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Enter Decimal Integer:");
                    decimalInteger=sc.nextInt();
                    System.out.println("Decimal Number: "+decimalInteger);
                    System.out.println("Binary Number: "+(decimal2Hexadecimal(decimalInteger).trim()));
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Enter Decimal IP Address (i.e. 192.168.35.10):");
                    ipAddress=sc.next();
                    System.out.println("Decimal IP Address: "+ipAddress);
                    String [] splitIpAddress=ipAddress.split("\\.",0);
                    int ipAddressArrayIndex=(splitIpAddress.length-1);
                    System.out.println("Binary IP Address:"+(convertIpAddress(splitIpAddress,ipAddressArrayIndex)).trim());
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("Enter Decimal MAC Address (i.e. 203:65:157:93:13:7):");
                    macAddress=sc.next();
                    System.out.println("Decimal MAC Address: "+macAddress);
                    String [] splitMacAddress=macAddress.split(":");
                    int macAddressArrayIndex=(splitMacAddress.length-1);
                    System.out.println("Hexadecimal MAC Address: "+(convertMacAddress(splitMacAddress,macAddressArrayIndex)).trim());
                    break;
            }
            if(userChoice>5||userChoice<1){
                System.out.println("");
                System.out.println("Error: Please Enter Valid Input");
                continue;
            }
        }while(userChoice!=5);
    }
}