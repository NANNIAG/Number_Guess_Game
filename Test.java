import java.util.Random;
import java.util.Scanner;

class Game{
	int comp;
	public Game() {
		Random r=new Random();
		comp=r.nextInt(101);
		System.out.println("Guess the number from 1 to 100");
	}
	public int ComputerNo() {
		return comp;
	}
}

public class Test {
	static int UserInput() {
		int user;
		System.out.println("Enter:  ");
		Scanner sc=new Scanner(System.in);
		user=sc.nextInt();
		return user;
		}
	
	static void isCompare(int i,int j) {
		if(i==j)
			System.out.println("Correct No. Guess");
		else if(i>j)
			System.out.println("Your No is Big then Computer No.");
		else
			System.out.println("Your No is Small then Computer No.");
	}

	public static void main(String[] args) {
		int user=0,comp=0,count=0;
		Game g=new Game();
		do {
			user=UserInput();
			comp=g.ComputerNo();
			isCompare(user,comp);
			count++;
		}while(user!=comp);
    System.out.println("You guess the number in " + count +" iterations");
	}

}
