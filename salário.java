import javax.swing.JOptionPane;
public class Salario {
    public static void main(String[] args) {
        String Salario = JOptionPane.showInputDialog("Digite seu salario atual");
        float salario = Float.parseFloat(Salario);
        float reajuste = salario+(salario*15/100);
        JOptionPane.showMessageDialog(null, String.format("salario antigo: %.2f\nsalario com reajuste: %.2f", salario, reajuste));
    }
    
}