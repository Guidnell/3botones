import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjGUI frame = new EjGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRene = new JButton("Rene");
		btnRene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRene.setBounds(10, 116, 126, 134);
		contentPane.add(btnRene);
		
		JButton btnMauricio = new JButton("Mauricio");
		btnMauricio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null," Soy Mauricio");
				// prueba de segundo cambio  
				//prueba de tercer cambio
				
			}
		});
		btnMauricio.setBounds(156, 116, 126, 134);
		contentPane.add(btnMauricio);
		
		JButton btnGuidnell = new JButton("Guidnell");
		btnGuidnell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola, mi nombre es Guidnell");
			}
		});
		btnGuidnell.setBounds(298, 116, 126, 134);
		contentPane.add(btnGuidnell);
	}
}
