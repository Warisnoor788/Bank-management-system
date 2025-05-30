package bank.maanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4;
    JTextField textField2,textField3;
    JPasswordField passwordField3;

    JButton button1,button2,button3;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM ");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde",Font.CENTER_BASELINE,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.CENTER_BASELINE,28));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Ralway",Font.BOLD,14));
        textField2.setForeground(Color.BLACK);
        add(textField2);

        /*label4 = new JLabel("Prepare by Waris Noor ");
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("AvantGarde",Font.CENTER_BASELINE,20));
        label4.setBounds(0,220,800,370);
        add(label4);*/


        label3 = new JLabel("PIN:  ");
        label3.setFont(new Font("Ralway",Font.CENTER_BASELINE,28));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Ralway",Font.CENTER_BASELINE,28));
        passwordField3.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);










        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image a2 = a1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel amage = new JLabel(a3);
        amage.setBounds(0,0,850,480);
        add(amage);




     setLayout(null);
     setSize(850,480);

     setLocation(180,100);
     setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1){

            }else if (e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if (e.getSource() == button3){

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
