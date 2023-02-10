
public class Ejercicios6Main {

	public static void main(String[] args) {
		
		int[] myArray = new int[15]; /*an array of 15 integers*/
		myArray[9] = 5; 
		String[] nameArray = new String[20]; 
		nameArray[0] = "Francisco"; 
		Estudiante[] objectsArray = new Estudiante[100];
		
		Arreglos met1 = new Arreglos();
		met1.showArray(myArray);
		
		Arreglos met2 = new Arreglos(); 
		met2.shownmArray(nameArray);
		
		Arreglos met3 = new Arreglos(); 
		met3.showEstArray(objectsArray);
		
		Arreglos met4 = new Arreglos(); 
		int found = met4.searchArray(myArray, 5); 
		if (found == 0) {
			System.out.println("No se encontro el valor"); 
		}
		else {
			System.out.println("El valor esta en la posicion " + found); 
		}

			
	}	
}
