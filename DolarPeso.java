import javax.swing.JOptionPane;

public class DolarPeso {
	public static void main (String[] args) {
        int i;
        double dolares, pesos;
        for (i=1; i<=10; i++) {
            JOptionPane.showMessageDialog(null, "PROCESO " + i);
            dolares=i;
            pesos=dolares*19.91;
            JOptionPane.showMessageDialog(null,
                "Valor de dolares: " + dolares + "\n" +
                "Valor de pesos: " + pesos);
        }
    }

}

