import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {

//		for (int i = 0; i <= 127; i++) {
//			System.out.printf("%d | %c\n", i, i);
//		}

		Scanner scan = new Scanner(System.in);
//		String word = scan.nextLine();
//		for (int i = 0; i < word.length(); i++) {
//			System.out.println((int) word.charAt(i));
//		}
//		scan.close();

		String name = scan.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i) + " = " + (int) name.charAt(i));
		}

//		int num = sc.nextInt();
//		String Binary = Integer.toBinaryString(num);
//		System.out.println("binary = " + Binary);
//		String Octal = Integer.toOctalString(num);
//		System.out.println("octal = " + Octal);
//		String Hexa = Integer.toHexString(num);
//		System.out.println("hexstring =" + Hexa);

	}

}
