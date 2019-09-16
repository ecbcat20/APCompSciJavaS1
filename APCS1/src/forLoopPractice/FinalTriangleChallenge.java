package forLoopPractice;

public class FinalTriangleChallenge {

	public static void finalChallenge() {
		for(int k = 10; k>=1; k--) { //master for loop

			for(int m = 10; m<k; m--) { //loop for determining how many stars to print
				System.out.print("*");
			}

			System.out.println("*"); //reset console to new fresh line
			
			for (int i=1; i<=k; i++)
	            {
	                System.out.print(" ");
	            } 
		}
	}


	public static void main(String[] args) {
		finalChallenge();
	}

}

/*
 
 ***********
  **********
    ********
      ******
        ****
          **
           */
