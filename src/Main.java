import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Comment vous appelez-vous ? ");
		String name = sc.nextLine();
		System.out.println("Hello " +name +" ! Quel age avez-vous ? ");
		String age = sc.nextLine();
		System.out.println("Bravo " +name+ " vous avez " +age+ "ans, c'est merveilleux !!");
	}

}
