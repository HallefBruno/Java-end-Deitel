import java.util.Arrays;
import java.util.Scanner;

public class Teste2 {
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int maxNum = 8;
		int[] arrayIn = new int[maxNum];
		boolean duplicate;
		int digCounter = 1;
		
		while (digCounter<=maxNum) {

			duplicate = false;

			System.out.println("Enter digit " + digCounter + ":");
			int temp = s.nextInt();
			
			for (int i=0; i<=digCounter-2; i++){ 
			
				if (temp==arrayIn[i]){ 
					duplicate = true;
					break;
				}
			}

			if (duplicate){
				System.out.println("Sorry that number has already been added");
			}
			else{
				arrayIn[digCounter-1] = temp;
				digCounter++;
			}
		}
		System.out.println(Arrays.toString(arrayIn));
	}
}