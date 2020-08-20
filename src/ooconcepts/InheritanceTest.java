package ooconcepts;

import java.io.FileInputStream;
import java.io.IOException;

public class InheritanceTest {
	public static void main(String[] args) {
		FileOperation fileOperation = new FileOperationImpl();
		try {
//			String fileText = fileOperation.read("C:\\Users\\ASUS\\Desktop\\English.txt");
//			String fileText = (String)fileOperation.read("C:\\Users\\ASUS\\Desktop\\English.txt");
			Object fileText = fileOperation.read("C:\\Users\\ASUS\\Desktop\\English.txt");
			System.out.println(fileText);
//			System.out.println(fileOperation.readWithUpperCase("C:\\Users\\ASUS\\Desktop\\English.txt"));
//		} catch (Exception e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

interface FileOperation{
//	String read(String filename) throws Exception;
	String read(String filename) throws IOException;
//	Object read(String filename) throws IOException;
}

class FileOperationImpl implements FileOperation{

	@Override
	public String read(String filename) throws IOException {
		
		FileInputStream inputStream = new FileInputStream(filename);
		int i=-1;
		StringBuilder s = new StringBuilder();
		do {
			i = inputStream.read();
			s.append((char)i);
		}while(i != -1);
		inputStream.close();
		return s.toString();
	}
	
	public String readWithUpperCase(String filename) throws IOException {
		FileInputStream inputStream = new FileInputStream(filename);
		int i=-1;
		StringBuilder s = new StringBuilder();
		do {
			i = inputStream.read();
			s.append((char)i);
		}while(i != -1);
		inputStream.close();
		return s.toString().toUpperCase();
	}
	
	
	
}
