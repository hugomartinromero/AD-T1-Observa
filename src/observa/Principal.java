package observa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("fichero.txt"))) {
			for (String linea = br.readLine(); linea != null; linea = br.readLine()) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
