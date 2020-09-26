import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int cont = 0;
		int t = 1;
		for (int i = 0; i < n; i++) {
			if (cont>=t)
			{
				t=t+2;
				cont=0;
			}
			System.out.println(t);	
			cont++;
			
		}
	}
}
