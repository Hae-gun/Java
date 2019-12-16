package day04;
import java.util.*;
public class Prob3 {

	public static void main(String[] args) {
		
		String msg = "";
		
		Scanner scanner = new Scanner(System.in);
		
		msg = scanner.nextLine();
		
		switch (msg.toLowerCase()) {
		
			case "yes":
				System.out.println("true");
				break;
	
			default:
				System.out.println(false);
				break;
				
		}

	}

}
