package Giaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TinhSqrt extends JFrame implements ActionListener {
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblkq;
	JTextField tfkq;
	JButton btnkq;
	public TinhSqrt() {
		lblSoN = new JLabel();
		lblSoN.setText("Nhập N =");
		tfSoN = new JTextField(10);
		lblkq = new JLabel();
		lblkq.setText("Kết quả");
		tfkq = new JTextField(10);
		btnkq = new JButton();
		btnkq.setText("Tính S");
		btnkq.addActionListener(this);
		Container cont = this.getContentPane();
		setSize(400, 200);
		cont.setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblkq);
		cont.add(tfkq);
		cont.add(btnkq);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String SoN= tfSoN.getText();
		int n = Integer.parseInt(SoN);
		double tong=0;
		for ( int i=1; i<=n; i++) {
			tong=tong+(double)Math.sqrt(i);
			
		}
		tfkq.setText(String.valueOf(tong));
	}
	public static void main (String[]args) {
		new TinhSqrt();
	}
}
