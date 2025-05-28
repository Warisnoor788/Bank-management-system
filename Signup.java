package bank.maanagement.system;

import com.toedter.calendar.JDateChooser;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;

    JTextField textName,textFname,textEmail,textMs,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;
     Random Abid = new Random();
     long first4 =(Abid.nextLong() % 9000L) +1000L;
     String first = "" + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(170,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. "+first);
        label1.setBounds(240,20,600,40);
        //label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Raleway",Font.BOLD,30));
        add(label1);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        //label3.setForeground(Color.WHITE);
        label3.setBounds(380,100,600,30);
        add(label3);

        JLabel label2 =new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
       // label2.setForeground(Color.WHITE);
        label2.setBounds(420,70,600,30);
        add(label2);



        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100,165,100,30);
        labelName.setForeground(Color.WHITE);
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelName);

        textName  = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,165,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father'sName :");
        labelfName.setBounds(100,210,200,30);
        labelfName.setForeground(Color.WHITE);
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,210,400,30);
        add(textFname);

        JLabel Dob = new JLabel("Date of Birth :");
        Dob.setFont(new Font("Raleway",Font.BOLD,20));
        Dob.setForeground(Color.WHITE);
        Dob.setBounds(100,290,250,30);
        add(Dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setForeground(Color.WHITE);
        labelG.setBounds(100,250,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(0,0,0,0));
        r1.setForeground(Color.WHITE);
        r1.setOpaque(false);
        r1.setFont(new Font("Raleway",Font.BOLD,17));
        r1.setBounds(300,255,100,20);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(46,140,143));
        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setOpaque(false);
        r2.setBounds(440,255,80,20);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setBackground(new Color(46,140,143));
        r3.setForeground(Color.WHITE);
        r3.setOpaque(false);
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(600,255,70,20);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setForeground(Color.WHITE);
        labelEmail.setBounds(100,335,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,335,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setForeground(Color.WHITE);
        labelMs.setBounds(100,380,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,380,90,25);
        m1.setForeground(Color.WHITE);
        m1.setOpaque(false);
        m1.setBackground(new Color(46,140,143));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(460,380,95,25);
        m2.setForeground(Color.WHITE);
        m2.setOpaque(false);
        m2.setBackground(new Color(46,140,143));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

       /* m3 = new JRadioButton("Other");
        m3.setBounds(635,380,70,25);
        m3.setBackground(new Color(255,255,255));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);*/

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);





        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setForeground(Color.WHITE);
        labelAdd.setBounds(100,420,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd .setFont(new Font("Ralway",Font.BOLD,14));
        textAdd .setBounds(300,420,400,30);
        add(textAdd );

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setForeground(Color.WHITE);
        labelCity.setBounds(100,465,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity  .setFont(new Font("Ralway",Font.BOLD,14));
        textCity  .setBounds(300,465,400,30);
        add( textCity  );

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setForeground(Color.WHITE);
        labelPin.setBounds(100,510,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Ralway",Font.BOLD,14));
        textPin.setBounds(300,510,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setForeground(Color.WHITE);
        labelState.setBounds(100,555,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,555,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);











        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image a2 = a1.getImage().getScaledInstance(850,800,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel amage = new JLabel(a3);
        amage.setBounds(550,600,850,480);
        add(amage);

       /* getContentPane().setBackground(new Color(46,140,143));*/
      // setLayout(null);
        setSize(850,800);
     // setLocation(250,20);
      setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }else if (r3.isSelected()){
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()){
            marital = "Married";
        }else if (m2.isSelected()){
            marital = "Unmarried";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Con1 con1 = new Con1();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();

    }
    
}
