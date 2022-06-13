package lab12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise1 {
    private String name;
    private int age;
    private int mark;
    public static void main(String[] args){
        Exercise1 war = new Exercise1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Add Student");
        System.out.println("2. Loading list Student");
        System.out.println("3.Exit");
        System.out.println("Enter your choice");
        int m = scanner.nextInt();
        switch (m){
            case 1:
                System.out.println("Enter name Student: ");
                String name = scanner.next();
                System.out.println("Enter age Student");
                int age = scanner.nextInt();
                System.out.println("Enter mark Student: ");
                int mark = scanner.nextInt();
                war.inputStudent(name,age,mark);

                break;
            case 2:
                System.out.println("List student");
                System.out.println(".........."+ "\n");
                war.loadListStudent();
                break;
            case 3:
                break;
        }
    }

    private void inputStudent(String name, int age, int mark) {
        try {
            FileWriter fileWriter = new FileWriter("Out", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Name: "+ name + "\n");
            bufferedWriter.write("Age:" + age + "\n");
            bufferedWriter.write("Mark: " + mark+ "\n");

            bufferedWriter.flush();
            System.out.println("Done");
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void loadListStudent(){
        try {
            FileReader fileReader = new FileReader("Out");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = "";
            while ((data = bufferedReader.readLine())!=null){
                System.out.println(data);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}