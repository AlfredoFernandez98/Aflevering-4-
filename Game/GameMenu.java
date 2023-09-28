import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	
	private ArrayList<String> actions;

public GameMenu(ArrayList<String> actions){

		this.actions=actions;
	}

public void displayMenu(){

	for(String action:actions){

		System.out.println(action);
	}
}

public String getAction(){

	Scanner scan=new Scanner(System.in);

	System.out.println("type a number to choose an action");

	displayMenu();

	String choice= scan.nextLine();

	int input = Integer.parseInt(choice);

	scan.close();
	return choice;

}



}