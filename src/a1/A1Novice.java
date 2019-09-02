package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int npeople = scanner.nextInt();
		String First = "";
		String Last = "";
		int nitems = 0;
		int quant = 0;
		String itemname = "";
		double price = 0;
		double sum = 0;
		
		for (int i = 0; i < npeople; i++) {
			First = scanner.next();
			Last = scanner.next();
			nitems = scanner.nextInt();
			sum = 0;
			for (int j = 0; j < nitems; j++) {
				quant = scanner.nextInt();
				itemname = scanner.next();
				price = scanner.nextDouble();
				sum = sum + quant * price;
				
			}
			System.out.println(First.charAt(0) + ". " + Last + ": " + String.format("%.2f", sum));

		}
		
//		scanner.nextInt();
//		while(scanner.hasNextLine()) {
//			String s = scanner.nextLine();
//			String[] s_array = s.split(" ");
//			for (int i = 0; i < s_array.length; i++) {
//				System.out.println(s_array[i]);
//			}
//			System.out.println("\n");
//		}
//		for(int i = 0;i<10;i ++)
//			System.out.println(scanner.next());
//		
		
//		int i = scanner.nextInt();

//			}

	}


}
