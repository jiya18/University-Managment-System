package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("University Management System");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/bgg.jpeg"));
        Image i3 = ic.getImage().getScaledInstance(1520, 850,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
        
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
    
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        

  
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
      
         
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        
        
        
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image17));
        s2.setMnemonic('H');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);
        

        
        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLUE);
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon13.jpg"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);

       
        

        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
        fee.add(s2);

        
        
       
         
        mb.add(master);
        mb.add(user);
       
        mb.add(report);
        mb.add(fee);
       
        mb.add(about);
        
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
            
        }else if(msg.equals("New Faculty")){
            new AddTeacher().f.setVisible(true);
            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }else if(msg.equals("Teacher Details")){
            new TeacherDetails().setVisible(true);
           
        }
        else if(msg.equals("Update Students")){
            new UpdateStudent().f.setVisible(true);
           
        }
        else if(msg.equals("Update Teachers")){
            new UpdateTeacher().f.setVisible(true);
           
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure().setVisible(true);
           
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm().setVisible(true);
           
        }
//        else if(msg.equals("Notepad")){
//            try{
//                Runtime.getRuntime().exec("notepad.exe");
//            }catch(Exception e){ }
//        }else if(msg.equals("Calculator")){
//            try{
//                Runtime.getRuntime().exec("calc.exe");
//            }catch(Exception e){ }
//        }else if(msg.equals("Web Browser")){
//            
//            try{
//                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//            }catch(Exception e){ }
//        }else if(msg.equals("Exit")){
//            System.exit(0);
        //}
        else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }
        //else if(msg.equals("Student Attendance")){
//            new StudentAttendance().setVisible(true);
//        }else if(msg.equals("Teacher Attendance")){
//            new TeacherAttendance().setVisible(true);
//        }
        
    }
        
    
    
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
