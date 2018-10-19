package ThucHanh;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Sach {
	String masach;
	String tensach;
	String tacgia;
	String namxb;
	int soluong;
	public Sach() {
	masach= new String("");	
	tensach= new String("");	
	tacgia= new String("");	
	namxb= new String("");	
	soluong=0;	
	}
	
	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public String getNamxb() {
		return namxb;
	}

	public void setNamxb(String namxb) {
		this.namxb = namxb;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public Sach(String masach, String tensach, String tacgia, String namxb, int soluong) {
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.namxb = namxb;
		this.soluong = soluong;
	}
}
class Quanlythuvien{
	Vector list= new Vector();
	public Quanlythuvien() {
		while(true) {
			System.out.println("QUAN LY THU VIEN");
			System.out.println("1.Nhap thong tin sach");
			System.out.println("2.Xem thong tin sach");
			System.out.println("\n-------------------\n");
			System.out.println("MOI BAN CHON CHUC NANG");
			int n;
			Scanner kb = new Scanner(System.in);
			n=kb.nextInt();
			switch (n) {
			case 1:Nhapthongtin();
				
				break;
			case 2:Inthongtin();
			
				break;
			
			}
		}
	}
	public void Nhapthongtin() {
		int n;
		System.out.println("Nhap so luong: ");
		Scanner kb = new Scanner(System.in);
		n=Integer.parseInt(kb.nextLine());
		for(int i=1;i<=n;i++) {
			System.out.println("Nhap thong tin loai sach thu: "+i);
			System.out.println("Nhap ma sach: ");
			String masach= kb.nextLine();
			System.out.println("Nhap ten sach: ");
			String tensach= kb.nextLine();
			System.out.println("Nhap ten tac gia: ");
			String tacgia=kb.nextLine();
			System.out.println("Nam xuat ban");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namxb=kb.nextLine();	
			System.out.println("Nhap so luong: ");
			int soluong= Integer.parseInt(kb.nextLine());
			Sach s= new Sach(masach, tensach, tacgia, namxb, soluong);
			list.add(s);
		}
		System.out.println("\n--------------------\n");
	}
	public void Inthongtin() {
		System.out.println("THONG TIN CUA SACH MA BAN DA CHON");
		Enumeration vNum= list.elements();
		int i=1;
		while(vNum.hasMoreElements()) {
			Sach sa=(Sach)vNum.nextElement();
			System.out.println(" "+i);
			System.out.println("Ma Sach: "+sa.masach);
			System.out.println("Ten Sach: "+sa.tensach);
			System.out.println("Tac Gia: "+sa.tacgia);
			System.out.println("Nam Xuat Ban: "+sa.namxb);
			System.out.println("So Luong: "+sa.soluong);
		}
		System.out.println("\n----------------------\n");
	}
}
