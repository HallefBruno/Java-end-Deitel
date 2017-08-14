public class Exercicio01{
	public static void main(String[]args) {
		int a = 3,b = 1,c = 5;
		//Primeiro forma de fazer
		if(a<b) {
			if(b<c) 
				System.out.println(a+" , "+b+" , "+c);
		}
		if(b<a) {
			if(a<c) 
				System.out.println(b+" , "+a+" , "+c);
		}
		if(c<b) {
			if(b<a) 
				System.out.println(c+" , "+b+" , "+a);
		}
		
		if(a<b) {
			if(b<c)
				System.out.println(a+" , "+b+" , "+c);
			else if(a<c)
				System.out.println(a+" , "+c+" , "+b);
			else {
				System.out.println(c+" , "+a+" , "+b);
			}
		}
		else if(b<c) {
			if(a<c)
				System.out.println(b+" , "+a+" , "+c);
			else {
				System.out.println(b+" , "+c+" , "+a);
			}	
		}
		else {
			System.out.println(c+" , "+b+" , "+a);
		}
	}
}