/*Kleiner BMI Rechner mit Fenster
* Version 0.2.1a
* @author Sebastian "Seb3D" Lein
*/

package pack1;

public class BMIRechner{
	public static void main (String [] args){
		
		System.out.println("=====================================================");
		System.out.println("Vielen Dank, dass du meinen BMI Rechner verwendest :D");
		System.out.println("=====================================================");
		
		//Komponenten:		
		Calculation user = new Calculation();		
		
		//Eingabe Fenster:
		user.eingabe();
		
		//Ausrechnen
		user.ausrechnen();
		
		//Ergebnis Fenster:
		user.ergebnis();
		
		
	}
}