
public class Arreglos {
	
	public static void showArray(int[] array) {
		for (int n = 0; n < array.length; n++) {
		    System.out.println(array[n]);   
		}
	}
	public static void shownmArray(String[] array) {
		for (int n = 0; n < array.length; n++) {
		    System.out.println(array[n]);   
		}
	}
	public static void showEstArray(Estudiante[] array) {
		for (int n = 0; n < array.length; n++) {
		    System.out.println(array[n]); 
		}
	}
	
	public static int searchArray(int[] array, int value) {
	    for (int n = 0; n < array.length; n++) {
	        if (array[n] == value) {
	            return n;
	        }
	    }
	    return 0;
	}
	
	
}
