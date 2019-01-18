package conjuto;

import javax.swing.JOptionPane;

public class dados {
	
	public void valor() {
		
		int n[] = {8,5,6,4,7};
		
		float v[] = new float[5];
		v[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para ser armazenado: "));
		v[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para ser armazenado: "));
		v[2] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para ser armazenado: "));
		v[3] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para ser armazenado: "));
		v[4] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para ser armazenado: "));
		
		for(int c=0; c<=4; c++) {
			
			JOptionPane.showMessageDialog(null,"Na posição N "+c+" temos o valor "+v[c]+
					"\nE na posição V "+c+ " temos "+n[c]);
			System.out.println("Na posição N "+c+" temos o valor "+v[c]);
			System.out.println("E na posição V "+c+ " temos "+n[c]);
			
		}
		
	}

}
