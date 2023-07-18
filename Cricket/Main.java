import java.util.Random;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Players[] p =new Players[12];
		for(int i=0;i<p.length;i++){

		System.out.print("Enter player name: ");
            String name = scanner.nextLine();

            System.out.print("Enter player age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter number of centuries: ");
            int century = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter number of runs: ");
            int runs = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter number of wickets: ");
            int wickets = scanner.nextInt();
            scanner.nextLine();

            p[i] = new Players(name, age, century, runs, wickets);
        }

		int captainIndex = random.nextInt(11);
                Players captain = p[captainIndex];

        System.out.println("Captain: " + captain.name);
        System.out.println("Age: " + captain.age);
        System.out.println("Centuries: " + captain.century);
        System.out.println("Runs: " + captain.runs);
        System.out.println("Wickets: " + captain.wickets);
			


		
}
}