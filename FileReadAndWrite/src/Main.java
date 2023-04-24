import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("test.txt");
			writer.write("This is a test.\n");
			writer.append("Is this working?");
			writer.close();
			
			FileReader reader = new FileReader("test.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
