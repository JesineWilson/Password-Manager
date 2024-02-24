import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class PasswordmanagerUI implements ActionListener
{
	private JFrame jf=new JFrame();
	private JLabel l1=new JLabel("Username");
	private JLabel l2=new JLabel("Password");
	private JLabel l3=new JLabel("App/Website");
	private JTextField tf1=new JTextField(20);
	private JTextField tf2=new JTextField(20);
	private JTextField tf3=new JTextField(20);
	private JButton b1=new JButton("Save");
	private JButton b2=new JButton("Load");
	private JButton b3=new JButton("Delete");
	private JTextArea a1=new JTextArea();
    
	PasswordmanagerUI()
	{
		b1.setBounds(55,145,65,20);
		b2.setBounds(125,145,65,20);
		b3.setBounds(195,145,70,20);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		l1.setBounds(55,45,100,50);
		l2.setBounds(55,70,100,50);
		l3.setBounds(55,95,100,50);
		tf1.setBounds(145,60,120,20);
		tf2.setBounds(145,85,120,20);
		tf3.setBounds(145,110,120,20);
		a1.setBounds(55,195,210,105);
		a1.setBorder(new LineBorder(new Color(0x2086AE),1));
        a1.setEditable(true);
        
        jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(tf1);
		jf.add(tf2);
		jf.add(tf3);
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(a1);
        
        jf.setLayout(null);
        jf.setTitle("Jesine");
		jf.setResizable(false);
		jf.setSize(340,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}
	public static void main(String[] args)
	{
		PasswordmanagerUI p1=new PasswordmanagerUI();
	}
	public void actionPerformed(ActionEvent e)
	{
	 if(e.getSource()==b1)
	 {
	  
	 }
	 else if(e.getSource()==b2)
	 {
		 
	 }
	 else if(e.getSource()==b3)
	 {
		 
	 }
	}

    
}