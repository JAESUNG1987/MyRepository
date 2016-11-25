package examNHN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam0 {

	public static void main(String[] args) {
        String[] words = null;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            words = line.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
 
		int length = words.length;
		System.out.println("length"+length);


    }
}