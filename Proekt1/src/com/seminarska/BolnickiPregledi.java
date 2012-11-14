package com.seminarska;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class BolnickiPregledi extends JFrame {
	
/**
 * 
 */
public BolnickiPregledi ()
{
	setTitle("Zakazi pregled");
	setSize(600,600);
	setLocationRelativeTo(null);
	
	final JPanel comCon=new JPanel();
	getContentPane().add(comCon);
	comCon.setLayout(null);
	
final JLabel lblNaslov=new JLabel("Forma za zakazuvanje pregledi vo Opsta bolnica- Bitola");
	lblNaslov.setBounds(150, 10, 500, 50);
	comCon.add(lblNaslov);
	
	final JLabel lblBaranje=new JLabel("POpolnete gi polinjata so baranite podatoci");
	lblBaranje.setBounds(160, 60, 500, 50);
	comCon.add(lblBaranje);

	final JLabel lblIme=new JLabel("Ime: ");
	lblIme.setBounds(10, 120, 100, 20);
	comCon.add(lblIme);

	final JTextField txtIme=new JTextField();
	txtIme.setBounds(90,120,150,20);
	comCon.add(txtIme);
	
	
	
	
	final JLabel lblPrezime=new JLabel("Prezime: ");
	lblPrezime.setBounds(10, 150, 100, 20);
	comCon.add(lblPrezime);

	final JTextField txtPrezime=new JTextField();
	txtPrezime.setBounds(90,150,150,20);
	comCon.add(txtPrezime);
	
	final JLabel lblmatbr=new JLabel("Maticen broj ");
	lblmatbr.setBounds(10, 180, 100, 20);
	comCon.add(lblmatbr);

	final JTextField txtmatbr=new JTextField();
	txtmatbr.setBounds(90,180,150,20);
	comCon.add(txtmatbr);
	
	final JLabel lblUpat=new JLabel("Upat za proverka na : ");
	lblUpat.setBounds(370, 120, 200, 20);
	comCon.add(lblUpat);
	
	final JCheckBox chUpat=new JCheckBox("Urina");
	chUpat.setBounds(390,150,150,20);
	comCon.add(chUpat);
	
	final JCheckBox chUpat2=new JCheckBox("Krv");
	chUpat2.setBounds(390,180,150,20);
	comCon.add(chUpat2);
	
	final JCheckBox chUpat3=new JCheckBox("EKG");
	chUpat3.setBounds(390,210,150,20);
	comCon.add(chUpat3);
	
	final JCheckBox chUpat4=new JCheckBox("Ostanato");
	chUpat4.setBounds(390,240,150,20);
	comCon.add(chUpat4);


	final JLabel lblpol=new JLabel("Odberi pol ");
	lblpol.setBounds(10, 210, 100, 20);
	comCon.add(lblpol);

final JRadioButton buton=new JRadioButton("Maski");
	final JRadioButton buton1=new JRadioButton("Zenski");
	
	buton.setSelected(true);
	
	buton.setActionCommand("Maski");
	buton1.setActionCommand("Zenski");
	
	buton.setBounds(20, 240, 100, 15);
	buton1.setBounds(120, 240, 250, 15);
	
	comCon.add(buton);
	comCon.add(buton1);

	ButtonGroup grupa=new ButtonGroup();
	grupa.add(buton);
	grupa.add(buton1);
	

	final JLabel lbldoktor=new JLabel("Odberete doktor kaj kogo sakate da zakazete pregled ");
	lbldoktor.setBounds(10, 270, 400, 20);
	comCon.add(lbldoktor);
	
	String [] titleList={"Dr.Zan Mitrev", "Dr.Aleksandar Nikolik","Dr.Vladimir Belostotski","Dr.Jovan Mirceski","Dr.Saso Mladenoski","Dr.Aleksandra Dimova", " Dr.Gjorgje Dimovski"};
	final JComboBox combo=new JComboBox(titleList);
	combo.setSelectedIndex(1);
	combo.setBounds(30, 300, 250, 20);
	comCon.add(combo);
	
	final JLabel lblZabeleska=new JLabel("Vnesi zabeleska za pacientot");
	lblZabeleska.setBounds(10, 330, 400, 20);
	comCon.add(lblZabeleska);
	

	final JTextArea txtDijagnoza=new JTextArea();
	txtDijagnoza.setBounds(10,360,250,100);
	txtDijagnoza.setLineWrap(true);
	//txtDijagnoza.s
	comCon.add(txtDijagnoza);
	
	JButton recordBtn = new JButton("Zakazi pregled");
    recordBtn.setBounds(210, 500, 150, 20);
    comCon.add(recordBtn);

	

	}
    
}


