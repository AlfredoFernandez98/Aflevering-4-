
import java.util.Scanner;

class Main{
	
public static void main(String[] args ){

	Scanner scanner = new Scanner(System.in);


	System.out.println("Please type your name.");

	String name= scanner.nextLine();

	System.out.println("\nHello "+ name+ "!");

	System.out.println("\nHow old are you?");

	String input= scanner.nextLine();

	int age = Integer.parseInt(input);

	int retariment = 65-age;

	if (retariment > 65){

		System.out.println("You don't need to work anymore!");

	

	} else {
		
		System.out.println("You have "+retariment+" years until retirement.");
	}



}

}