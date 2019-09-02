package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int nitems = scan.nextInt();
		String[] itemname = new String [nitems];
		double[] itemprice = new double [nitems];
		for (int i = 0; i < nitems; i++) {
			itemname[i] = scan.next();
			itemprice[i] = scan.nextDouble();
		}
		
		int[] howmany = new int[nitems];
		int[] howmanycustomers = new int[nitems];
		
		int npeople = scan.nextInt();
		
		String First = "";
		String Last = "";
		int npersonalitem = 0;
		int quant = 0;
		String pitemname = "";
		
		for (int j = 0; j < npeople; j ++) {
			First = scan.next();
			Last = scan.next();
			npersonalitem = scan.nextInt();
			
			for (int k = 0; k < npersonalitem; k++) {
				quant = scan.nextInt();
				pitemname = scan.next();
				int index = -1;

			    for (int a = 0; (a < itemname.length) && (index == -1); a++) {
			        if (pitemname.equals(itemname[a])) {
			            index = a;
			        }
			    }
			    
			    howmany[index] = howmany[index] + quant;
			    howmanycustomers[index] = howmanycustomers[index] + 1;
			}
		}
		for (int n = 0; n < nitems; n++) {
			if (Math.abs(howmany[n] - 0) < 0.00005) {
				System.out.println("No customers bought " + itemname[n]);
			} else {
				System.out.println(howmanycustomers[n] + " customers bought " + howmany[n] + " " + itemname[n]);
			}
		}
	}
}
