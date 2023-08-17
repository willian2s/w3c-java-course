package org.willian2s.FileHandle;

import java.io.*;
import java.util.Scanner;

// File Handling
// - The File class from the java.io package, allows us to work with files.
//
// The File class has many useful methods for creating and getting information about files. For example:
// Method	              Type	        Description
// canRead()	          Boolean	      Tests whether the file is readable or not
// canWrite()	          Boolean	      Tests whether the file is writable or not
// createNewFile()	    Boolean	      Creates an empty file
// delete()	            Boolean	      Deletes a file
// exists()	            Boolean	      Tests whether the file exists
// getName()	          String	      Returns the name of the file
// getAbsolutePath()	  String	      Returns the absolute pathname of the file
// length()	            Long	        Returns the size of the file in bytes
// list()	              String[]	    Returns an array of the files in the directory
// mkdir()	            Boolean	      Creates a directory
public class Main {
  private final static String FILE_NAME = "src\\main\\java\\org\\willian2s\\FileHandle\\File.txt";

  public static void main(String[] args) {
    createFile();
    writeFile();
    readFile();
    getFileInfo();
    deleteFile();
  }

  // Create a File
  // - To create a file in Java, you can use the createNewFile() method. This method returns a boolean value:
  //   true if the file was successfully created, and false if the file already exists.
  //   Note that the method is enclosed in a try...catch block. This is necessary because it throws an IOException if
  //   an error occurs (if the file cannot be created for some reason):
  public static void createFile() {
    try {
      File myFile = new File(FILE_NAME);
      if (myFile.createNewFile()) {
        System.out.println("File created: " + myFile.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }

  // Write To a File
  // - In the following example, we use the FileWriter class together with its write() method to write some text to the
  //   file we created in the example above. Note that when you are done writing to the file, you should close it with
  //   the close() method:
  public static void writeFile() {
    try{
      FileWriter myFile = new FileWriter(FILE_NAME);
      myFile.write("Hello World!\n\nFiles in Java might be tricky, but it is fun enough");
      myFile.close();
      System.out.println("Successfully wrote to the file.");
    } catch(IOException e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }

  // Read a File
  // - In the previous chapter, you learned how to create and write to a file.
  //
  // - In the following example, we use the Scanner class to read the contents of the text file we created in the previous
  //   chapter:
  public static void readFile() {
    try {
      File myFile = new File(FILE_NAME);
      Scanner myReader = new Scanner(myFile);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }

  // Get File Information
  // - To get more information about a file, use any of the File methods:
  //
  // Note: There are many available classes in the Java API that can be used to read and write files in Java: FileReader,
  //       BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
  //       Which one to use depends on the Java version you're working with and whether you need to read bytes or characters,
  //       and the size of the file/lines etc.
  public static void getFileInfo(){
    File myFile = new File(FILE_NAME);
    if (myFile.exists()) {
      System.out.println("File name: " + myFile.getName());
      System.out.println("Absolute path: " + myFile.getAbsolutePath());
      System.out.println("Writeable: " + myFile.canWrite());
      System.out.println("Readable " + myFile.canRead());
      System.out.println("File size in bytes " + myFile.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }

  public static void deleteFile(){
    File myFile = new File(FILE_NAME);
    if (myFile.delete()) {
      System.out.println("Successfully deleted the file.");
    } else {
      System.out.println("Failed to delete the file.");
    }
  }
}
