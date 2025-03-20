package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException{
	FileWriter fw = new FileWriter("C:/Users/DAC-User31/Desktop/files/test.txt");
	String str = "Harsh is from bhopal\n He want to be trader\n";
	fw.write(str);

	System.out.println("File is Created");
	fw.close();
}
}
