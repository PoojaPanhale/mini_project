package filehandaling;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bufferreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file = new FileInputStream("one.txt");
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {
				String line;
				while((line = reader.readLine()) != null){
				System.out.println(line);
				}
			} }
			catch (IOException e) {
			e.printStackTrace();
			} }
	}


