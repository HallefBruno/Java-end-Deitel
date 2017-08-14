public class Exercicio06 {
	public static void main(String[]args){
		String asterisco = "";
		String[]array = new String[10];
		int i = 0;
		
		while(i<array.length){
			asterisco = asterisco + "*";
			array[i] = asterisco;
			System.out.printf("%s\n",array[i]);
			i++;
		}
		
		System.out.println("\n");
		
		while(i>0){
			System.out.println(array[i-1]);
			i--;
		}
	}
}