/**
 * @author Shlomit Argov
 */
public class CracklePop {
	private static final int MAX_NUM = 100;
	private static final String CRACKLE = "Crackle";
	private static final String POP = "Pop";

	/**
	 * main prints out all numbers between 1 and MAX_NUM. If a number is
	 * divisible by 3, it prints Crackle instead of the number. If a number is
	 * divisible by 5, it prints Pop instead of the number. If a number is
	 * divisible by both 3 and 5, it prints CracklePop instead of the number.
	 * 
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= MAX_NUM; i++) 
		{
			//Check the most common case first, make use of short-circuiting to avoid extra checks
			if ((i % 3) != 0 && (i % 5) != 0 ) 
			{
				System.out.println(i);
			}
			else
				if((i % 3) == 0)
				{
					System.out.print(CRACKLE);
					if ((i % 5) == 0) 
					{
						System.out.println(POP);
					} else {
						System.out.println();
					}
				} else if ((i % 5) == 0) 
			{
				System.out.println(POP);
			} 
		}
	}
}
