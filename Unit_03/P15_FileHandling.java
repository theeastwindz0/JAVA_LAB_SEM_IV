package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P15_FileHandling {

	public static void main(String[] args) throws IOException {
		Temp t=new Temp();
		t.takeInputFromAFileNotFromConsole();
		t.saveOutputIntoAFile();
	}

}

class Temp{
	static int t=0;
	void takeInputFromAFileNotFromConsole() throws IOException{
		String path="/home/zerox/LAB/JAVA_LAB_SEM_IV/Unit_03/input.txt";
		File f=new File(path);
		BufferedReader br=new BufferedReader(new FileReader(f));
		String s;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		if(br.readLine()==null)System.out.println("End");
		
	}
	void saveOutputIntoAFile() throws IOException{
		FileWriter fw=null;
		try{
			fw=new FileWriter("/home/zerox/LAB/JAVA_LAB_SEM_IV/Unit_03/output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
		BufferedWriter writer=new BufferedWriter(fw);
		String text="What you doing?";
		writer.write(text);
		writer.close();
	}
	void createALogFile() throws IOException{
		t++;
		FileWriter ob=null;
		try {
			ob=new FileWriter("/home/zerox/LAB/JAVA_LAB_SEM_IV/Unit_03/output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
		BufferedWriter fw=new BufferedWriter(ob);
		try {
			fw.write("Value of a: "+t+",");
		}catch(IOException e) {
			e.printStackTrace();
		}
		fw.close();
	}
}