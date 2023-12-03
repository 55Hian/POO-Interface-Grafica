package interfaceGrafica;

import javax.swing.JFrame;

public class Screen extends JFrame{
	public Screen() {
//		JFrame jFrame = new JFrame("Ola Mundo Grafico");
		super("Ola mundo grafico")
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
