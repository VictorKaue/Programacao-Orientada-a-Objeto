package interface_grafica;
import javax.swing.*;

public class MinhaJanela extends JFrame{
	public MinhaJanela(){
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		criarButao();
	}
	
	public void criarButao() {
		JButton jButton = new JButton("Botão 1");
		jButton.setBounds(10, 50, 200, 30);
		add(jButton);
		jButton.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Seja bem-vindo!");
		});
	}
}
