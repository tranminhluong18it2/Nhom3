package Giaodien;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TinhS extends JFrame implements ActionListener {
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblkq;
	JTextField tfkq;
	JButton btns;
public TinhS() {
	lblSoN = new JLabel();
	lblSoN.setText("Nhập N = ");
	tfSoN = new JTextField(10);
	lblkq = new JLabel();
	lblkq.setText("Kết quả");
	tfkq = new JTextField(10);
	btns = new JButton("Tính S");
	btns.addActionListener(this);
	Container cont = this.getContentPane();
	cont.setLayout(new FlowLayout());
	setSize(400, 200);
	cont.add(lblSoN);
	cont.add(tfSoN);
	cont.add(lblkq);	
	cont.add(tfkq);
	cont.add(btns);
	setVisible(true);
}
public void actionPerformed(ActionEvent e) 	{
	String SoN = tfSoN.getText();
	int n = Integer.parseInt(SoN);
	float tong=0;
	for(int i=1; i<=n; i++) {
		tong =tong + (float)1/i;
	}
	tfkq.setText(String.valueOf(tong));
	JOptionPane.showConfirmDialog(null, "Đáp án chính xác");
}
	
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	TinhS obj = new TinhS();

}

}