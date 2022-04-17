package RanasiaC;
import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static String studentLetterGrade(double classGrade) {
        String letterGrade;
        if (classGrade > 89.5 && classGrade <= 100) {
            letterGrade = "A";
        } else if (classGrade > 79.5 && classGrade < 89.5) {
            letterGrade = "B";
        } else if (classGrade > 69.5 && classGrade < 79.5) {
            letterGrade = "C";
        } else if (classGrade > 59.9 && classGrade < 69.5) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
    public static double finalGradeAverage(double averageTestGrade, double averageQuizGrade) {
        double weight = 0.25;
        double testGrade = (averageTestGrade * (weight * 3));
        double quizGrade = (averageQuizGrade * weight);
        double averageGrade = (testGrade + quizGrade);
        return averageGrade;
    }
    public static double calculateAverageTestGrade(ArrayList<Double> finalTestArray) {
        int finalTestArrayLength = finalTestArray.size();
        double testSum = 0.00;
        double averageTest;
        for (int i = 0; i < finalTestArrayLength; i++) {
            testSum +=finalTestArray.get(i);
        }
        averageTest = (testSum / finalTestArrayLength);
        return averageTest;
    }
    public static ArrayList<Double> replaceTestGrade(ArrayList<Double> convertedTestList) {
        int testArrayLength = convertedTestList.size();
        double lowestTestScore = 0.00;
        double finalExamScore = convertedTestList.get(2);
        int lowestTestScorePlacement = 0;
        if (convertedTestList.get(0) > convertedTestList.get(1)) {
            lowestTestScore = convertedTestList.get(1);
            lowestTestScorePlacement =1;
        }
        else if(convertedTestList.get(0)==convertedTestList.get(1)){
            lowestTestScore=convertedTestList.get(0);
            lowestTestScorePlacement=0;
        }
        else{
            lowestTestScore=convertedTestList.get(0);
            lowestTestScorePlacement=0;
        }
        if ((lowestTestScore < finalExamScore) && (lowestTestScore != -1.00)) {
            lowestTestScore = finalExamScore;
            convertedTestList.remove(lowestTestScorePlacement);
            convertedTestList.add(lowestTestScorePlacement, finalExamScore);
        } else if (lowestTestScore == -1.00) {
            convertedTestList.remove(lowestTestScorePlacement);
            convertedTestList.add(lowestTestScorePlacement, 0.00);
        }
        return convertedTestList;
    }
    public static ArrayList<Double> convertingStringForTest(String students)
            throws NumberFormatException, IndexOutOfBoundsException, IOException {
        String[] studentTest = students.split(",");
        int studentLength = studentTest.length;
        double convertedStudentTestGrades;
        ArrayList<Double> testGrades = new ArrayList<>();
        for (int i = 12; i < studentLength; i++) {
            convertedStudentTestGrades = Double.parseDouble(studentTest[i]);
            testGrades.add(convertedStudentTestGrades);
        }
        return testGrades;
    }
    public static double calculateAverageQuizGrade(ArrayList<Double> finalQuizArray)throws NumberFormatException, IndexOutOfBoundsException{
        int finalQuizArrayLength = finalQuizArray.size();
        double testSum = 0.00;
        double averageQuiz;
        for (int i = 0; i <= finalQuizArrayLength - 1; i++) {
            testSum+=finalQuizArray.get(i);
        }
        averageQuiz = (testSum / finalQuizArrayLength);
        return averageQuiz;
    }
    public static ArrayList<Double> dropTheLowestQuiz(ArrayList<Double> convertQuizList)
            throws NumberFormatException, IndexOutOfBoundsException {
        Double minInArrayList = -1.0;
        int minInArrayListPlacement=-1;
        int sizeOfArrayList = convertQuizList.size();
        for (int i = 0; i < sizeOfArrayList - 1; i++) {
            if (convertQuizList.get(i) > convertQuizList.get(i + 1)) {
                minInArrayList = convertQuizList.get(i + 1);
                minInArrayListPlacement=(i+1);
            }
        }
        if(minInArrayList==-1.0){
            convertQuizList.remove(1);
        }
        else if(minInArrayList!=-1.0){
            convertQuizList.remove(minInArrayListPlacement);
        }
        return convertQuizList;
    }
    public static ArrayList<Double> convertingStringForQuiz(String students)
            throws NumberFormatException, IndexOutOfBoundsException {
        String[] studentQuizGrades = students.split(",");
        int studentLength = studentQuizGrades.length;
        double convertedStudentQuizGrades;
        String regexDouble="^-?\\d*\\.\\d+$";
        ArrayList<Double> quizGrades = new ArrayList<>();
        if(studentLength!=15){
            throw new IndexOutOfBoundsException();
        }
        for (int i = 2; i < studentLength - 3; i++) {
            if(studentQuizGrades[i].matches(regexDouble)){
                convertedStudentQuizGrades = Double.parseDouble(studentQuizGrades[i]);
                quizGrades.add(convertedStudentQuizGrades);
            }
            else
                throw new NumberFormatException();
        }
        return quizGrades;
    }
    public static void studentFinalGradesCalculated(String userFileName) throws IOException,NumberFormatException,IndexOutOfBoundsException,FileNotFoundException {
        String student;
        ArrayList<Double>convertedQuizArray;
        ArrayList<Double>finalQuizArray;
        ArrayList<Double>convertedTestArray;
        ArrayList<Double>finalTestArray;
        double averageTestGrades;
        double averageQuizGrades;
        double classGrade;
        String letterGrade;
        try{
            File errorFile=new File("ErrorGradesFile.txt");
            PrintWriter errorPrintWriter=new PrintWriter(errorFile);
            File rawGrades= new File(userFileName);
            Scanner readFile=new Scanner(rawGrades);
            File finalGradeFile=new File("FinalGradesFile.txt");
            PrintWriter finalGradePrintWriter=new PrintWriter(finalGradeFile);
            while(readFile.hasNextLine()) {
                student = readFile.nextLine();
                String[] students = student.split(",");
                if (students[1].equals(" ")) {
                    errorPrintWriter.println(student);
                    errorPrintWriter.flush();
                } else {
                    //Quiz Grades
                    convertedQuizArray = convertingStringForQuiz(student);
                    finalQuizArray = dropTheLowestQuiz(convertedQuizArray);
                    averageQuizGrades = calculateAverageQuizGrade(finalQuizArray);
                    //Test Grades
                    convertedTestArray = convertingStringForTest(student);
                    finalTestArray = replaceTestGrade(convertedTestArray);
                    averageTestGrades = calculateAverageTestGrade(finalTestArray);
                    //Class Grade
                    classGrade = finalGradeAverage(averageTestGrades, averageQuizGrades);
                    letterGrade = studentLetterGrade(classGrade);
                    //Writing it to file:
                    String studentName = students[0];
                    String studentID = students[1];
                    finalGradePrintWriter.print(studentName + " ");
                    finalGradePrintWriter.print(studentID + " ");
                    finalGradePrintWriter.print(classGrade + " ");
                    finalGradePrintWriter.print(letterGrade + " ");
                    finalGradePrintWriter.println();
                    finalGradePrintWriter.flush();
                }
            }
            readFile.close();
            errorPrintWriter.close();
            finalGradePrintWriter.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error:"+e.getClass().toString().substring(6)+": Could not find file...");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Error:"+e.getClass().toString().substring(6)+": Index was outside the bounds of the array…");
        }
        catch (NumberFormatException e){
            System.out.println("Error:"+e.getClass().toString().substring(6)+": Input string was not in correct format…");
        }
        catch(IOException e){
            System.out.println("Error:"+e.getClass().toString().substring(6)+": Error reading from or writing to files");
        }
    }
    public static void main(String[] args)
            throws IOException, NumberFormatException, IndexOutOfBoundsException, FileNotFoundException {
        String userFileName;
        System.out.print("Enter name of input file:");
        userFileName = sc.nextLine();
        studentFinalGradesCalculated(userFileName);
    }
}
