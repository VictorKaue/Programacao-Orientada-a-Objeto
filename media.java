package pacote;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		float n5 = sc.nextFloat();
		
		float media = (n1+n2+n3+n4+n5)/5;
		System.out.println("A média é de: " + media);
		sc.close();
	}

}
