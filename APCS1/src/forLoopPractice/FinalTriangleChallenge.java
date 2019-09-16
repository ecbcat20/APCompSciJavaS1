package forLoopPractice;

public class FinalTriangleChallenge {

	public static void finalChallenge() {
		for (int i=1; i<=10; i++)
		{
			// Print space i
			for (int j=1; j<i; j++) 
			{ 
				System.out.print(" "); 
			} 
			// Print star 
			for (int k=10; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

		public static void main(String[] args) {
			finalChallenge();
		}

	}

	