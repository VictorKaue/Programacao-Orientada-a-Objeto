package pacote;
import java.lang.Math;
import javax.swing.JOptionPane;

public class area_do_circulo {

	public static void main(String[] args) {
		String Raio = JOptionPane.showInputDialog("Digite o valor do Raio");
		float raio = Float.parseFloat(Raio);
		double area = Math.PI * (raio*raio);
		JOptionPane.showMessageDialog(null, String.format("O valor da area e de: %.4f", area));
	}
}
