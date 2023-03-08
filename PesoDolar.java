import javax.swing.JOptionPane;

public class PesoDolar {
	public static void main (String[] args) {
        int i;
        double pesos, dolares = 1;
        for (i=1; i<=3; i++) {
            JOptionPane.showMessageDialog(null, "PROCESO " + i);
            pesos=i;
            dolares=pesos*0.055;
            JOptionPane.showMessageDialog(null,
                "Valor de pesos: " + pesos + "\n" +
                "Valor de dolares: " + dolares);
        }
    }
}
