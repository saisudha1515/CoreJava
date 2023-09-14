package logicalProgramsByPawan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * required FileWritter class and BufferWriter class and use BufferWriter static method called write()method..
 *  import FileWritter and BufferWriter classes from "java.io." package and throw the exception..
 */
public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Documents\\ProgramPractice.txt");  // give the location of the file along with name of the file
		BufferedWriter bw = new BufferedWriter(fw);  // bw is pointing to this .txt file..
		bw.write("Selenium with java \n");
		bw.write("Selenium with python \n");
		bw.write("Selenium with c#");
		System.out.println("Data has been written into the text file successfully");
		bw.close();

	}
}
