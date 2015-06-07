import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class BD {

	final static Charset ENCODING = StandardCharsets.UTF_8;

	public static String[] selectColumns(Scanner scn) {

		System.out.println("Ile kolumn?");
		int n = scn.nextInt();
		String[] col = new String[n];
		// for (int i = 0; i < n; i++) {
		int i = 0;
		while (i < n) {
			System.out.println("Podaj nazwe");
			col[i] = scn.next();
			i++;
		}
		return col;
	}

	public void updateRow() {

	}

	public void insertRow() {

	}

	public void deleteRow() {

	}

	public static void createTable(String nazwa, Scanner scn)
			throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("e:/" + nazwa + ".txt", "UTF-8");
		System.out.println("Podaj nazwy kolumn, rozdziel spacjami");
		String str = scn.nextLine();
		writer.println(str);
		writer.close();
	}

	public ArrayList<String> loadRowFromFile(File plik) {
		ArrayList<String> list = new ArrayList<String>();

		return list;

	}

	public static String[] readFile(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			lines.add(line);
		}
		bufferedReader.close();
		return lines.toArray(new String[lines.size()]);
	}

	public void saveRowToFile() {

	}

	public void show() {

	}

}
