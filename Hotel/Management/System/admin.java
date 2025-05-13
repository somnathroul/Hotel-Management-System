package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee,add_Room,add_Driver,logout,back;

    admin(){

        add_Employee= new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);


        add_Room= new JButton("ADD ROOM");
        add_Room.setBounds(250,380,200,30);
        add_Room.setBackground(Color.WHITE);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);


        add_Driver= new JButton("ADD DRIVER");
        add_Driver.setBounds(250,530,200,30);
        add_Driver.setBackground(Color.WHITE);
        add_Driver.setForeground(Color.BLACK);
        add_Driver.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Driver.addActionListener(this);
        add(add_Driver);


        logout= new JButton("LOGOUT");
        logout.setBounds(95,700,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);


        back= new JButton("BACK");
        back.setBounds(210,700,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);


        ImageIcon l1= new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11=l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon= new ImageIcon(l11);
        JLabel label=new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);


        ImageIcon imageIcon1= new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image=imageIcon1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2= new ImageIcon(image);
        JLabel label1=new JLabel(imageIcon2);
        label1.setBounds(70,340,120,120);
        add(label1);


        ImageIcon imageIcon11= new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1=imageIcon11.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon21= new ImageIcon(image1);
        JLabel label11=new JLabel(imageIcon21);
        label11.setBounds(70,500,120,120);
        add(label11);


//        ImageIcon imageIcon111= new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
//        Image image111=imageIcon111.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
//        ImageIcon imageIcon211= new ImageIcon(image111);
//        JLabel label111=new JLabel(imageIcon211);
//        label111.setBounds(1000,250,400,400);
//        add(label111);



        getContentPane().setBackground((new Color(3,45,48)));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add_Employee){
            new AddEmployee();
        }
        else if(e.getSource()==add_Room){
            new AddRoom();
        }
        else if(e.getSource()==add_Driver){
            new addDriver();
            
        } else if (e.getSource()==logout) {
            System.exit(102);
            
        } else if (e.getSource()==back) {
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new admin();
    }
}
