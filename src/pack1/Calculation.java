package pack1;

import javax.swing.JOptionPane;

public class Calculation {

	private double groesse, gewicht, bmi;
	
	public Calculation() {		
		
	}
	
	public void eingabe() {
		
		String eingew = JOptionPane.showInputDialog("Geben Sie ihre Groesse ein (in cm): ");
		groesse = Double.parseDouble(eingew);
		
		String eingro = JOptionPane.showInputDialog("Geben Sie ihr Gewicht ein (in Kilo): ");
		gewicht = Double.parseDouble(eingro);		
		
	}
	
	public void ausrechnen() {
		
		bmi = gewicht / ((groesse/100) * (groesse/100));		
		
	}
	
	public void ergebnis() {
		
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
