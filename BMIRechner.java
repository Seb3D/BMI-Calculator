/*Kleiner Kalorienzähler mit Fenster
* Version 1.0
* @author Sebastian Lein
*/

import javax.swing.*;

public class BMIRechner{
	public static void main (String [] args){
		
		System.out.println("=====================================================");
		System.out.println("Vielen Dank, dass du meinen BMI Rechner verwendest :D");
		System.out.println("=====================================================");
		
		//Komponenten:
		double groesse;
		double gewicht;
		double bmi;
		
		//Eingabe Fenster:
		String eingew = JOptionPane.showInputDialog("Geben Sie ihre Groesse ein (in cm): ");
		groesse = Double.parseDouble(eingew);
		
		String eingro = JOptionPane.showInputDialog("Geben Sie ihr Gewicht ein (in Kilo): ");
		gewicht = Double.parseDouble(eingro);
		
		bmi = gewicht / ((groesse/100) * (groesse/100));
		
		if(bmi >=26){
				JOptionPane.showMessageDialog(null, "Dein BMI betraegt " + bmi + " / Du hast leider Uebergewicht.");
		}
		else{
			if(bmi<=20){
				JOptionPane.showMessageDialog(null, "Dein BMI betraegt " + bmi + " / Du hast leider Untergewicht.");				
			}
			else{
				JOptionPane.showMessageDialog(null, "Dein BMI betraegt " + bmi + " / Du hast Normalgewicht");				
			}
		}
		
		
	}
}