package com.company.advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class java_13_FileHandling {
    public static void main(String[] args) {
////        // Code to create a new file
//        File myFile = new File("file.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
//
//
////        // Code to write to a file
//        try {
//            FileWriter fileWriter = new FileWriter("file.txt");
//            fileWriter.write("File Handling in Java\n" +
//                    "File handling is a crucial part of any programming language.\n" +
//                    "In Java, file handling is done with the help of the File class of the java.io package.\n" +
//                    "Common file handling operations :\n" +
//                    "Creating a new file.\n" +
//                    "Writing in a file.\n" +
//                    "Reading an existing file.\n" +
//                    "Deleting a file.\n" +
//                    "To perform any of the above operations on a file in Java, we need to create an object of the File class" +
//                    "Now, let's see how we can perform the above operation on a file in Java.\n" +
//                    "\n" +
//                    "Creating a new file :\n" +
//                    "createNewFile() method is used to create a new file." +
//                    "Writing to a file :\n" +
//                    "FileWriter class is used with its write() method to write some content in a file.\n" +
//                    "Do not forget to use the close() method when you're finished writing to a file. " +
//                    "Reading a file :\n" +
//                    "The Scanner class is used to read a file.\n" +
//                    "It is important to enclose the method in a try-catch block to handle the IOException" +
//                    "Deleting a file :\n" +
//                    "The delete() method is used to delete a file in Java.");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
    // Reading a file
        File myFile = new File("file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        // Deleting a file-->
//        File myFile = new File("cwh111file.txt");
//        if(myFile.delete()){
//            System.out.println("I have deleted: " + myFile.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting the file");
//        }
    }
}
