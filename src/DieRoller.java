/**
 * DieRoller
 * 
 * Rolls an n-sided die with n determined by the user.
 * 
 * @author Faelan S.
 * @date_created 9/21/16
 */

import java.util.Scanner;

public class DieRoller 
{
	public static void main(String[] args) 
	{
		DieRoller d = new DieRoller();
	}
	
	public DieRoller()
	{
		Scanner in = new Scanner(System.in);
		int sides;
		boolean done = false;
		
		while(!done)
		{
			System.out.println("Input # of sides (0 to quit)");
			sides = in.nextInt();
			if(sides == 0)
				done = true;
			else
				rollDie(sides);
		}
		
		in.close();
	}

	private void rollDie(int sides) 
	{
		int roll = (int) (Math.random() * sides + 1);
		System.out.println("You rolled: " + roll + "\n");
	}
}