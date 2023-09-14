package logicalProgramsByPawan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * required FileReader class and BufferReader class and also required BufferReader class static method readLine() method
 * import FileReader class and BufferReader class form " java.io " package
 * 
 */
public class ReadDataFromTextFile {
   public static void main(String[] args) throws Exception {
	FileReader fr = new FileReader("C:\\Users\\LENOVO\\Documents\\ProgramPractice.txt"); // give the path/location of the file from where do you want to read..
    BufferedReader br = new BufferedReader(fr);                                          // fr is pointing to the ProgramPractice.txt file..pass FileReader as parameter to this BufferReader..
    String str;
    while((str = br.readLine())!=null) {                                                 // we do not know how many lines are there so use while loop do not use for loop when do not know the length/count/number of lines..
    	System.out.println(str);
      }
    System.out.println("Data has been read from text file successfully");
    br.close();
   }
}
