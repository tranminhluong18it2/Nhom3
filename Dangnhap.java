package Giaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Dangnhap extends JFrame implements ActionListener {
	JLabel lblten;
	JTextField tften;
	JLabel lblmk;
	JPasswordField pfmk;
	JButton btndn;
	JButton btndk;
public Dangnhap() {
	lblten = new JLabel();
	lblten.setText("Username");
	tften = new JTextField(33);
	lblmk = new JLabel();
	lblmk.setText("Password");
	pfmk = new JPasswordField(33);
	btndn = new JButton("Login");
	btndk = new JButton("Register");
	btndn.addActionListener(this);
	btndk.addActionListener(this);
	Container cont = this.getContentPane();
	cont.setLayout(new FlowLayout());
	setSize(500, 500);
	cont.add(lblten);
	cont.add(tften);
	cont.add(lblmk);
	cont.add(pfmk);
	cont.add(btndn);
	cont.add(btndk);
	setVisible(true);
}	
	public static void main(String[]args) {
		new Dangnhap();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "Đăng nhập thành công");
	}
}
