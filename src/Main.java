import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// BD.createTable("tabela");
		BD.createTable("tabela1",scn);
		// String[] str = BD.readFile("E:/tabela1.txt");
		
		String[] a = BD.selectColumns(scn);
		scn.close();
	}

}
