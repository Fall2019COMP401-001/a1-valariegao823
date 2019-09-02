package a1;

import java.util.Scanner;

public class A1Adept {

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
		
		int npeople = scan.nextInt();
		String First = "";
		String Last = "";
		int npersonalitem = 0;
		int quant = 0;
		String pitemname = "";
		String[] personlist = new String[npeople];
		double[] totallist = new double[npeople];
				
		for (int j = 0; j < npeople; j ++) {
			double sum = 0;
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
			    
			    
			    double pitemprice = itemprice[index];
			    sum = sum + quant * pitemprice;
			    
			}
			personlist[j] = First + " " + Last + " (" + String.format("%.2f", sum) + ")";
			totallist[j] = sum;
			
		}
		int largest = getIndexOfLargest(totallist);
		int smallest = getIndexOfSmallest(totallist);
		System.out.println("Biggest: " + personlist[largest]);
		System.out.println("Smallest: " + personlist[smallest]);
		System.out.println("Average: " + String.format("%.2f", average(totallist)));
		
	}
	
	
	
	public static int getIndexOfLargest( double[] array )
	{
	  if ( array == null || array.length == 0 ) return -1; // null or empty

	  int largest = 0;
	  for ( int i = 1; i < array.length; i++ )
	  {
	      if ( array[i] > array[largest] ) largest = i;
	  }
	  return largest; // position of the first largest found
	}
	
	public static int getIndexOfSmallest( double[] array )
	{
	  if ( array == null || array.length == 0 ) return -1; // null or empty

	  int largest = 0;
	  for ( int i = 1; i < array.length; i++ )
	  {
	      if ( array[i] < array[largest] ) largest = i;
	  }
	  return largest; // position of the first largest found
	}
	
	public static double average( double[] array )
	{
	  if ( array == null || array.length == 0 ) return -1; // null or empty

	  double sum = 0;
	  for ( int i = 0; i < array.length; i++ )
	  {
	      sum = sum + array[i];
	  }
	  return sum/array.length; // position of the first largest found
	}
}
