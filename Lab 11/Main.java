package RanasiaC;
import java.io.*;
import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void comparingFiles(String userFile1,String userFile2) throws FileNotFoundException,IOException,Exception {
        try{
            File file1=new File(userFile1);
            Scanner readFile1= new Scanner(file1);
            File file2=new File(userFile2);
            Scanner readFile2= new Scanner(file2);
            int line=1;
            while(readFile1.hasNextLine() || readFile2.hasNextLine()){
               if(!readFile1.hasNextLine()){
                   System.out.println();
                   System.out.println("Files have different numbers of lines at line "+line);
                   break;
               }
               else if(!readFile2.hasNextLine()){
                   System.out.println();
                   System.out.println("Files have different numbers of lines at line "+line);
                   break;
               }
               else if(readFile1.hasNextLine() && readFile2.hasNextLine()) {
                   String currentLineForFile1 = readFile1.nextLine();
                   String currentLineForFile2 = readFile2.nextLine();
                   if (!(currentLineForFile1.equals(currentLineForFile2))) {
                       System.out.println("Line " + line);
                       System.out.println("<" + currentLineForFile1);
                       System.out.println(">" + currentLineForFile2);
                   }
               }
               line++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Error:"+e.getClass().toString().substring(6)+": Could not locate File...");
        }
        catch (Exception e){
            System.out.println("Error:"+e.getClass().toString().substring(6)+": "+e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
	    System.out.print("Enter File 1:");
        String fileOne=sc.nextLine();
        System.out.print("Enter File 2:");
        String fileTwo=sc.nextLine();
        comparingFiles(fileOne,fileTwo);
    }
}
