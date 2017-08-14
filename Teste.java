public class Teste{
	public static void main(String[]args){
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 6; column++) {
				if (row == 0) {
					System.out.print("*");
				}
				else if(row == 6 -1) {
					System.out.print("*");
				}
				else if(column == 6 - 1 - row) {
					System.out.print("*");
				}
				else {
					//System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}