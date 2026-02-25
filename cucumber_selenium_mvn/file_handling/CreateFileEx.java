package file_handling;

import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
public class CreateFileEx
{
public static void main(String[] args)
{
try {
	File file=new File("Tech.txt");
	
	if(file.createNewFile())
{
	System.out.println("File created Successfully");
	
}
else
{
	System.out.println("File alredy exists");
	FileWriter fw = new FileWriter("Tech.txt",true);
	fw.write("\n new line");
	fw.append("Append method -> successfully Appended");
	fw.close();
	
}
//	try {
//	BufferedWriter bw = new BufferedWriter(new FileWriter("Tech.txt",true));
//	bw.write("Hello Java");
//	bw.newLine();
//	bw.write("BufferWriter");
//	bw.newLine();
//	bw.close();
}
catch(IOException e)
{
	e.printStackTrace();
}
}
} 

