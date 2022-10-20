import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		
//		System.out.println((int)Math.pow(num, 2));
//		
//		System.out.println((Math.random() * 1000) + 1);
		
//		double rand = (Math.random() * 100) + 1;
//		System.out.println(rand);
//		
//		System.out.println((int)rand + 1);
		
//		char a = 'a';
//		
//		String b = scan.nextLine();
//		System.out.println(b.charAt(b.length()-1));
		
		String s = scan.nextLine();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				System.out.print('o');
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}

}
