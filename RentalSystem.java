import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JComboBox.*;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.io.*;
class HouseRent extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JLabel l2,l3,l4,l5;
	private JButton Login,Exit;
	HouseRent()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("House Rental System");
		constructUI();
		designUI();
		handleEvent();
	}
	public void constructUI()
	{
		p1 = new JPanel();
		Login=new JButton("LOGIN");
		Exit=new JButton("Exit");
		l2 = new JLabel("E.Gowtham Babu -  20BCS098 ");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",Font.PLAIN, 30));
		l3 = new JLabel("S.Bhuvan Raaj  -  20BCS092");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Arial",Font.PLAIN, 30));
		l4 = new JLabel("K.Kapil Durai  -  20BCS104");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Arial",Font.PLAIN, 30));
		l5=new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
	}
	public void designUI()
	{
		p1.add(l5);
		p1.add(l3);
		frame.getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(800,400,400,40);
		p1.add(l2);
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(800,450,500,40);
		p1.add(l4);
		frame.getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(800,500,400,40);
		p1.add(Login);
		frame.getContentPane().add(Login,BorderLayout.CENTER);
		Login.setBounds(1100,600,80,40);
		p1.add(Exit);
		frame.getContentPane().add(Exit,BorderLayout.CENTER);
		Exit.setBounds(800,600,80,40);
		frame.add (p1);
	}
	public void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home t = new Home();	
				frame.dispose();
			}
		});
		Exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
				System.exit(0);
			}
		});
	}
}
class Home extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JLabel l1;
	private JButton admin, tenant, sign,Exit;
	Home()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("House Rental System");
		constructUI();
		designUI();
		handleEvent();
	}
	public void constructUI()
	{
		p1 = new JPanel();
		admin = new JButton("Admin");
		tenant = new JButton("Tenant");
		sign = new JButton("SignUp");
		Exit= new JButton("EXIT"); 
		l1= new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
	}
	public void designUI()
	{
		setLayout(new BorderLayout());
		p1.add(l1);
		p1.add(admin);
		frame.getContentPane().add(admin,BorderLayout.CENTER);
		admin.setBounds(1000,400,200,50);
		p1.add(tenant);
		frame.getContentPane().add(tenant,BorderLayout.CENTER);
		tenant.setBounds(1000,500,200,50);
		p1.add(sign);
		frame.getContentPane().add(sign,BorderLayout.CENTER);
		sign.setBounds(1000,600,200,50);
		p1.add(Exit);
		frame.getContentPane().add(Exit,BorderLayout.CENTER);
		Exit.setBounds(700,600,200,50);
		frame.add(p1);
	}
	public void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tenant.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				TenantLogin t = new TenantLogin();	
				frame.dispose();
			}
		});
		admin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				AdminLogin t = new AdminLogin();	
				frame.dispose();
			}
		});
		sign.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				SignUp su = new SignUp();
				frame.dispose();
			}
		});
		Exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
				System.exit(0);
			}
		});
	}
}
class AdminLogin extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JTextField userName;
	private JPasswordField passWord;
	private JButton login,home;
	private JLabel l1,l2,l3;
	private String uname, pwd;
	private int flag = 0;
	private JCheckBox c1;
	AdminLogin()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Admin Login");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{
		p1=new JPanel();
		l1 = new JLabel("Username:");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Arial",Font.BOLD, 20));
		l2 = new JLabel("Password:");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",Font.BOLD, 20));
		userName = new JTextField(15);
		passWord = new JPasswordField(15);
		passWord.setEchoChar('*');
		login = new JButton("Login");
		home = new JButton("Home");
		l3=new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
		c1=new JCheckBox("Show Password");
	}
	private void designUI()
	{ 	
		p1.add(l3);
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(900,400,200,30);	
		p1.add(userName);		
		frame.getContentPane().add(userName,BorderLayout.CENTER);
		userName.setBounds(1050,400,150,30);
		p1.add(l2);			
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(900,450,100,30);
		p1.add(passWord);		
		frame.getContentPane().add(passWord,BorderLayout.CENTER);
		passWord.setBounds(1050,450,150,30);	
		p1.add(login);
		frame.getContentPane().add(login,BorderLayout.CENTER);
		login.setBounds(1120,550,80,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(900,550,80,30);
		p1.add(c1);
		frame.getContentPane().add(c1,BorderLayout.CENTER);
		c1.setBounds(1050,500,150,30);
		frame.add(p1);
	}
	
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					String u=userName.getText();
					char[] p = passWord.getPassword();
					String ps = String.valueOf(p);
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection established");
					PreparedStatement pst=con.prepareStatement("select username,password from admin");
					ResultSet rs=pst.executeQuery();		
				 	while(rs.next())
					{
						uname=rs.getString("username");
						pwd=rs.getString("password");
						if(uname.equals(u) && pwd.equals(ps))
						{
							flag=1;
							break;
						}
						else
						flag=0;
					}
					if(flag==1)
					{
						JOptionPane.showMessageDialog(null,"Login Successful");
						AdminInterface a1 = new AdminInterface();
						frame.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid username or password");
					}
				pst.close();
				con.close();					
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
		c1.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ie)
		{
			if(c1.isSelected())
			{
				passWord.setEchoChar((char)0);
			}
			else
			{
				passWord.setEchoChar('*');
			}
		}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
	}
}		
class AdminInterface extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JButton insert, view, viewFeedback,home;
	private JLabel l1;
	AdminInterface()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Admin Interface");
		constructUI();
		designUI();
		handleEvent();
	}
	private void constructUI()
	{
		p1=new JPanel();
		insert = new JButton("Update House Details");	
		view = new JButton("View Tenant Details");
		viewFeedback = new JButton("View Feedback");
		home = new JButton("Home");
		l1= new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
	}
	private void designUI()
	{ 	setLayout(new BorderLayout());
		p1.add(l1);
		p1.add(insert);
		frame.getContentPane().add(insert,BorderLayout.CENTER);
		insert.setBounds(1000,400,200,50);	
		p1.add(viewFeedback);
		frame.getContentPane().add(viewFeedback,BorderLayout.CENTER);
		viewFeedback.setBounds(1000,480,200,50);
		p1.add(view);
		frame.getContentPane().add(view,BorderLayout.CENTER);
		view.setBounds(1000,560,200,50);	
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(1000,640,200,50);	
		frame.add(p1);
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		insert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				UpdateDetails ud = new UpdateDetails();
				frame.dispose();
				
			}
		});
		view.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				TenantDetails td = new TenantDetails();
			}
		});
		viewFeedback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Feedback f = new Feedback();
			}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
	}
}




class TenantDetails extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JTable jt;
	private String name11,area11,rooms11,house11,people11,paid11;
	private JButton home,admin;
	TenantDetails()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("View Tenant Details");
		constructUI();
		designUI();	
		makeConnection();
		handleEvent();
	}
	private void constructUI()
	{
		p1 = new JPanel();
		home = new JButton("Home");
		admin = new JButton("Admin Page");
		jt = new JTable();
		jt.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
			"Name", "Area","Rooms","House","No. of People","Rent paid?"}
        ));
	}	
	private void designUI()
	{
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(800,800,80,30);
		p1.add(admin);
		frame.getContentPane().add(admin,BorderLayout.CENTER);
		admin.setBounds(950,800,80,30);
		p1.add(jt);
		frame.getContentPane().add(jt,BorderLayout.CENTER);
		jt.setBounds(30,40,1500,500);
		frame.add(p1);     
	}
	private void makeConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
			PreparedStatement pst1=con.prepareStatement("select * from tenantdetails");
			ResultSet rs=pst1.executeQuery();
			while(rs.next())
			{
				name11=rs.getString("name");
				area11=rs.getString("area");
				rooms11=rs.getString("rooms"); 
				house11=rs.getString("house");
				people11=rs.getString("people");
				paid11=rs.getString("paid");
                DefaultTableModel model =(DefaultTableModel) jt.getModel();          
				Object[] row = {(name11),(area11),(rooms11),(house11),(people11),(paid11)};
				model.addRow(new Object[]{(name11),(area11),(rooms11),(house11),(people11),(paid11)});
            }
		}
			catch(ClassNotFoundException | SQLException | HeadlessException e)
			{
				System.out.println("exception");
			}
	}
	private void handleEvent()
	{
			home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});		
			admin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				AdminInterface ai = new AdminInterface();
				frame.dispose();
			}
		});		
	}
	

	
}
class Feedback extends JFrame
{
	private JFrame frame;
	private JPanel p1,p2;
	private JTable jt;
	private String issue;
	private String name;
	private String email;
	private JButton home,admin;
	Feedback()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("View Feedback");
		constructUI();
		designUI();	
		makeConnection();
		handleEvent();
	}
	private void constructUI()
	{
		p1 = new JPanel();
		p2 = new JPanel();
		home = new JButton("Home");
		admin = new JButton("Admin Page");
		jt = new JTable();
		jt.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
			"Name", "Email","Issue"}
        ));
	}	
	private void designUI()
	{
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(800,1000,80,30);
		p1.add(admin);
		frame.getContentPane().add(admin,BorderLayout.CENTER);
		admin.setBounds(950,1000,80,30);
		p2.add(jt);
		frame.getContentPane().add(jt,BorderLayout.CENTER);
		jt.setBounds(30,40,1500,500);
		frame.add(p1);
		frame.add(p2);
	}
	private void makeConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
			PreparedStatement pst1=con.prepareStatement("select * from issue");
			ResultSet rs=pst1.executeQuery();
			while(rs.next())
			{
				name=rs.getString("name");
				email=rs.getString("email");
				issue=rs.getString("issue");                    
                DefaultTableModel model =(DefaultTableModel) jt.getModel();          
				Object[] row = {(name),(email),(issue)};
				model.addRow(new Object[]{(name),(email),(issue)});
            }
		
			//	pst1.close();
			//	con.close();
		}
			catch(ClassNotFoundException | SQLException | HeadlessException e)
			{
				System.out.println("exception");
			}
	}
	private void handleEvent()
	{
			home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});		
			admin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				AdminInterface ai = new AdminInterface();
				frame.dispose();
			}
		});		
	}
	
}
class UpdateDetails extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JLabel l1, l2,l3,l4,l5;
	private JTextField t1,t2,t3,t4;
	private JButton update,home;
	UpdateDetails()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Update Details");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{
		p1=new JPanel();
		l1 = new JLabel("Enter Area:");
		l2 = new JLabel("Enter Id:");
		l3 = new JLabel("Enter House Name:");
		l4 = new JLabel("Enter Rooms");
		update = new JButton("Update");	
		home = new JButton("Home");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
	}
	private void designUI()
	{ 	
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(50,50,200,30);	
		p1.add(t1);
		frame.getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(300,50,500,30);
		p1.add(l2);
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(50,100,100,30);	
		p1.add(t2);
		frame.getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(300,100,500,30);
		p1.add(l3);
		frame.getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(50,150,150,30);	
		p1.add(t3);
		frame.getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(300,150,500,30);
		p1.add(l4);
		frame.getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(50,200,100,30);	
		p1.add(t4);
		frame.getContentPane().add(t4,BorderLayout.CENTER);
		t4.setBounds(300,200,500,30);
		p1.add(update);
		frame.getContentPane().add(update,BorderLayout.CENTER);
		update.setBounds(50,300,80,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(150,300,80,30);
		frame.add(p1);
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
			try
				{
					String a = t1.getText();
					String id = t2.getText();
					String housename = t3.getText();
					String rooms = t4.getText();
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection established");
					Statement pst = con.createStatement();		
						int x=pst.executeUpdate("insert into housedetails values('"+a+"','"+id+"','"+housename+"','"+rooms+"',null)");
						if(x>0)
						{ 
							JOptionPane.showMessageDialog(null,"Successfully Updated!");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Update Unsuccessful");
						}
				pst.close();
				con.close();					
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
	}
}
class SignUp extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JLabel l1, l2,l3,l4,l5,l6;
	private JTextField t1,t2,t3;
	private JPasswordField pf1,pf2;
	private JButton signup,home;
	SignUp()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("SignUp");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{
		p1=new JPanel();
		l1 = new JLabel("Name:");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Arial",Font.BOLD, 20));
		l2 = new JLabel("Password:");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",Font.BOLD, 20));
		l4 = new JLabel("Email:");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Arial",Font.BOLD, 20));
		l5 = new JLabel("Phone Number:");
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Arial",Font.BOLD, 20));
		signup = new JButton("signup");	
		home = new JButton("Home");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		pf1 = new JPasswordField();
		l6 = new  JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
	}
	private void designUI()
	{ 	
		p1.add(l6);
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(650,350,200,30);	
		p1.add(t1);
		frame.getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(850,350,500,30);
		p1.add(l2);
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(650,400,100,30);	
		p1.add(pf1);
		frame.getContentPane().add(pf1,BorderLayout.CENTER);
		pf1.setBounds(850,400,500,30);
		p1.add(l4);
		frame.getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(650,450,100,30);	
		p1.add(t2);
		frame.getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(850,450,500,30);
		p1.add(l5);
		frame.getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(650,500,200,30);	
		p1.add(t3);
		frame.getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(850,500,500,30);
		p1.add(signup);
		frame.getContentPane().add(signup,BorderLayout.CENTER);
		signup.setBounds(1270,600,80,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(1170,600,80,30);
		frame.add(p1);
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
			try
				{
					String u=t1.getText();
					char[] p = pf1.getPassword();
					String ps = String.valueOf(p);
					String email = t2.getText();
					String phone = t3.getText();
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
					LocalDateTime now = LocalDateTime.now();  
					String strDate = dtf.format(now);
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection established");
					Statement pst = con.createStatement();	
						int x=pst.executeUpdate("insert into tenant values('"+u+"','"+ps+"','"+email+"','"+phone+"','"+strDate+"')");
						if(x>0)
						{ 
							JOptionPane.showMessageDialog(null,"SignUp successful");
							TenantInterface t1 = new TenantInterface();
							frame.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null,"SignUp Unsuccessful");
						}
				pst.close();
				con.close();					
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
	}
}
class TenantLogin extends JFrame 
{
	private JFrame frame;
	private JPanel p1;
	private JTextField userName;
	private JPasswordField passWord;
	private JButton login,home;
	private JLabel l1,l2,l3;
	private String uname, pwd;
	private int flag = 0;
	private JCheckBox c1;
	TenantLogin()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Tenant Login");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{
		p1=new JPanel();
		l1 = new JLabel("Username:");
		l1.setFont(new Font("Arial",Font.BOLD, 20));
		l1.setForeground(Color.WHITE);
		l2 = new JLabel("Password:");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",Font.BOLD, 20));
		userName = new JTextField(15);
		passWord = new JPasswordField(15);
		passWord.setEchoChar('*');
		login = new JButton("Login");
		home = new JButton("Home");
		l3=new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
		c1 = new JCheckBox("Show Password");
	}
	private void designUI()
	{ 	
		setLayout(new BorderLayout());
		p1.add(l3);
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(900,400,200,30);	
		p1.add(userName);		
		frame.getContentPane().add(userName,BorderLayout.CENTER);
		userName.setBounds(1050,400,150,30);
		p1.add(l2);			
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(900,450,100,30);
		p1.add(passWord);		
		frame.getContentPane().add(passWord,BorderLayout.CENTER);
		passWord.setBounds(1050,450,150,30);	
		p1.add(login);
		frame.getContentPane().add(login,BorderLayout.CENTER);
		login.setBounds(1080,550,80,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(900,550,80,30);
		p1.add(c1);
		frame.getContentPane().add(c1,BorderLayout.CENTER);
		c1.setBounds(1050,500,150,30);
		frame.add(p1);
		
	}
	public void handleEvent() 
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					String u=userName.getText();
					char[] p = passWord.getPassword();
					String ps = String.valueOf(p);
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection established");
					PreparedStatement pst=con.prepareStatement("select username,password from tenant");
					ResultSet rs=pst.executeQuery();		
				 	while(rs.next())
					{
						uname=rs.getString("username");
						pwd=rs.getString("password");
						if(uname.equals(u) && pwd.equals(ps))
						{
							flag=1;
							break;
						}
						else
						flag=0;
					}
					if(flag==1)
					{
						JOptionPane.showMessageDialog(null,"Login Successful");
						TenantInterface t1 = new TenantInterface();
						frame.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid username or password");
					}
				pst.close();
				con.close();					
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
		c1.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ie)
		{
			if(c1.isSelected())
			{
				passWord.setEchoChar((char)0);
			}
			else
			{
				passWord.setEchoChar('*');
			}
		}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
	}
}		
class TenantInterface extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JButton pay, report, house;
	private JLabel l1;
	TenantInterface()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Tenant Interface");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{	
		p1=new JPanel();
		pay = new JButton("Pay Rent");	
		report = new JButton("Report An Issue");
		house = new JButton("Look For a House");
		l1= new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
	}
	private void designUI()
	{ 	
		setLayout(new BorderLayout());
		p1.add(l1);
		p1.add(pay);
		frame.getContentPane().add(pay,BorderLayout.CENTER);
		pay.setBounds(1000,400,200,50);	
		p1.add(house);
		frame.getContentPane().add(house,BorderLayout.CENTER);
		house.setBounds(1000,480,200,50);
		p1.add(report);
		frame.getContentPane().add(report,BorderLayout.CENTER);
		report.setBounds(1000,560,200,50);	
		frame.add(p1);
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				PayRent pr = new PayRent();
				frame.dispose();
			}
		});
		report.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				ReportIssue ri = new ReportIssue();
				frame.dispose();
			}
		});
		house.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				House h = new House();
				frame.dispose();
			}
		});
	}
}
class House extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JLabel l1, l2,l3,l4,l5,l6;
	private JComboBox cb1,cb2,cb3,cb4;
	private JCheckBox c1;
	private JButton register,home,view,tenant;
	private String[] number = {"1 ","2 ","3 ","4 "};
	private JTextField names;
	private int flag;
	House()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Look for a house");
		constructUI();
		designUI();
		makeConnection();
		handleEvent();	
		
	}
	private void constructUI()
	{
		p1=new JPanel();
		l1 = new JLabel("Select the Area:");
		l2 = new JLabel("Select Number of Rooms:");
		l3 = new JLabel("Select the House");
		l4 = new JLabel("Select the number of People");
		l5 = new JLabel("Enter Name");
		register = new JButton("Register");
		register.setEnabled(false);
		home = new JButton("Home");
		tenant = new JButton("Tenant");
		cb1 = new JComboBox();
		cb2 = new JComboBox();
		cb3 = new JComboBox();
		cb4 = new JComboBox(number);
		c1 = new JCheckBox("I accept to the terms and conditions");
		view = new JButton("View Agreement");
		names = new JTextField();
	}
	private void designUI()
	{ 	
		p1.add(l5);
		frame.getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(50,50,300,30);	
		p1.add(names);
		frame.getContentPane().add(names,BorderLayout.CENTER);
		names.setBounds(250,50,300,30);
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(50,100,300,30);	
		p1.add(cb1);
		frame.getContentPane().add(cb1,BorderLayout.CENTER);
		cb1.setBounds(250,100,300,30);
		p1.add(l2);
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(50,150,300,30);	
		p1.add(cb2);
		frame.getContentPane().add(cb2,BorderLayout.CENTER);
		cb2.setBounds(250,150,300,30);
		p1.add(l3);
		frame.getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(50,200,300,30);	
		p1.add(cb3);
		frame.getContentPane().add(cb3,BorderLayout.CENTER);
		cb3.setBounds(250,200,300,30);
		p1.add(l4);
		frame.getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(50,250,300,30);	
		p1.add(cb4);
		frame.getContentPane().add(cb4,BorderLayout.CENTER);
		cb4.setBounds(250,250,50,30);
		p1.add(view);
		frame.getContentPane().add(view,BorderLayout.CENTER);
		view.setBounds(50,300,200,30);
		p1.add(c1);
		frame.getContentPane().add(c1,BorderLayout.CENTER);
		c1.setBounds(300,300,250,30);
		p1.add(register);
		frame.getContentPane().add(register,BorderLayout.CENTER);
		register.setBounds(50,350,150,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(300,350,150,30);
		p1.add(tenant);
		frame.getContentPane().add(tenant,BorderLayout.CENTER);
		tenant.setBounds(500,350,150,30);
		frame.add(p1);
	}	
	private void makeConnection()
	{
		try
		{
					cb1.addItem(null); 
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					Statement st1=con.createStatement();
					ResultSet rs1=st1.executeQuery("select distinctrow area from housedetails");
					while(rs1.next())
					{
						String areaDetail = rs1.getString("area");
						cb1.addItem(areaDetail);
					}
					st1.close();
					con.close();
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}				
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie)
			{
				if(c1.isSelected())
				{
					register.setEnabled(true);
				}
				else
				{
					register.setEnabled(false);
				}
			}
		});
		tenant.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 TenantInterface t1 = new TenantInterface();
				 frame.dispose();
			}
		});
		cb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie)
			{
				
				try
				{
					cb2.removeAllItems();
					cb2.addItem(null);
					String data =(String)cb1.getSelectedItem();
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection Established");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select rooms from housedetails where area = '" + data + "' ");
					
				 	while(rs.next())
					{
			
						String filterRooms= rs.getString("rooms");
						cb2.addItem(filterRooms);
					}				
					
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
		cb2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie)
			{
				
				try
				{
					String yes = "Yes";
					cb3.removeAllItems();
					cb3.addItem(null);
					String r =(String)cb2.getSelectedItem();
					String datas =(String)cb1.getSelectedItem();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					Statement st=con.createStatement();
					Statement pst2 = con.createStatement();
					ResultSet rs=st.executeQuery("select housename from housedetails where rooms = '" + r + "' AND area = '" + datas + "'  ");
					ResultSet rs2=pst2.executeQuery("select housename from housedetails where booked = '"+yes+"'");
				 	while(rs.next())
					{
						String filterHouse = rs.getString("housename");
						cb3.addItem(filterHouse);
					}				
					while(rs2.next())
					{
						String result1=rs2.getString("housename");
						cb3.removeItem(result1);
					}
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
			register.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				if(cb1.getSelectedIndex() == -1)
				{
					JOptionPane.showMessageDialog(null, "Please Select Area");
				}
				else if(cb2.getSelectedIndex() == -1)
				{
				JOptionPane.showMessageDialog(null, "Please Select Rooms");
				}
				else if(cb3.getSelectedIndex() == -1)
				{
					JOptionPane.showMessageDialog(null, "Please Select a House");
				}
				else
				{
					try
					{
					String yes = "YES";
					String no = "No";
					String name1 = names.getText();
					String area1 = (String)cb1.getSelectedItem();
					String rooms1 = (String)cb2.getSelectedItem();
					String house1 = (String)cb3.getSelectedItem();
					String numbers = (String)cb4.getSelectedItem();
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection established");
					Statement pst = con.createStatement();		
					Statement pst1 = con.createStatement();
					
					int x=pst.executeUpdate("insert into tenantdetails values('"+name1+"','"+area1+"','"+rooms1+"','"+house1+"','"+numbers+"',null)");
					int y = pst1.executeUpdate("update housedetails set booked = '"+yes+"' where housename = '" + house1 + "'");
					if(x>0)
					{ 
						JOptionPane.showMessageDialog(null,"Registered Successfully!");
						flag = 1;
					}
					else
					{
						flag = 0;
					}
					
					pst.close();
					con.close();					
					}
					catch(ClassNotFoundException | SQLException | HeadlessException e)
					{
						System.out.println("exception");
					}		
				}
				}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
		view.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Agreement a = new Agreement();
			}
		});
	}
}
class Agreement extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JTextArea ta;
	private JButton back;
	Agreement()
	{
		frame = new JFrame();
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.setTitle("View Agreement");
		constructUI();
		designUI();
		handleEvent();
		getFile();
	}
	private void constructUI()
	{
		p1 = new JPanel();
		ta = new JTextArea();
		ta.setLineWrap(true);
		back = new JButton("Back");
	}
	private void designUI()
	{
		frame.setResizable(false);
		p1.add(ta);
		frame.getContentPane().add(ta,BorderLayout.CENTER);
		ta.setBounds(10,10,600,600);
		p1.add(back);
		frame.getContentPane().add(back,BorderLayout.CENTER);
		back.setBounds(50,700,80,30);
		frame.add(p1);
	}
	private void getFile()
	{
		try
		{
			FileReader readTextFile=new FileReader("E:\\Java Proj\\HouseAgreement.txt");
			Scanner fin = new Scanner(readTextFile);
			while(fin.hasNext())
			{
				ta.append(fin.nextLine()+"\n");
			}
		}
		catch(Exception ex){}
	}
	private void handleEvent()
	{
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
			}
		});
	}
}
class ReportIssue extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JLabel l1,l2,l3,l4;
	private JTextArea ta;
	private JTextField t1,t2;
	private JButton submit,home,tenant;
	ReportIssue()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Report Issue");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{
		p1=new JPanel();
		l1 = new JLabel("Enter your e-mail");
		l2 = new JLabel("Enter The Issue");
		l3 = new JLabel("Enter your name");
		submit = new JButton("Submit");	
		home = new JButton("Home");
		tenant = new JButton("Tenant");
		ta = new JTextArea(10,40);
		ta.setLineWrap(true);
		t1 = new JTextField();
		t2 = new JTextField();
	
	}
	private void designUI()
	{ 	
		p1.add(l3);
		frame.getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(50,50,200,30);
		p1.add(t2);
		frame.getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(150,50,600,30);
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(50,100,200,30);	
		p1.add(t1);
		frame.getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(150,100,600,30);
		p1.add(l2);
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(50,150,100,30);	
		p1.add(ta);
		frame.getContentPane().add(ta,BorderLayout.CENTER);
		ta.setBounds(150,150,600,300);
		p1.add(submit);
		frame.getContentPane().add(submit,BorderLayout.CENTER);
		submit.setBounds(50,400,80,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(50,350,80,30);
		p1.add(tenant);
		frame.getContentPane().add(tenant,BorderLayout.CENTER);
		tenant.setBounds(50,300,80,30);
		frame.add(p1);
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 try
				{
					String name = t2.getText();
					String email = t1.getText();
					String issue = ta.getText();
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver connected");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
					System.out.println("Connection established");
					Statement pst = con.createStatement();		
						int x=pst.executeUpdate("insert into issue values('"+name+"','"+email+"','"+issue+"')");
						if(x>0)
						{ 
							JOptionPane.showMessageDialog(null,"Report Sent");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Try Again");
						}
				pst.close();
				con.close();					
				}
				catch(ClassNotFoundException | SQLException | HeadlessException e)
				{
					System.out.println("exception");
				}		
			}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
		tenant.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 TenantInterface t1 = new TenantInterface();
				 frame.dispose();
			}
		});
	}
}
class PayRent extends JFrame
{
	private JFrame frame;
	private JPanel p1;
	private JButton payRent, home, tenant;
	private JTextField t1,t2,t3,t4;
	private JLabel l1,l2,l3,l4;
	public int flag=0;
	PayRent()
	{
		frame = new JFrame();
		frame.setSize(1600,1600);
		frame.setVisible(true);
		frame.setTitle("Pay Rent");
		constructUI();
		designUI();
		handleEvent();	
	}
	private void constructUI()
	{
		p1=new JPanel();
		payRent = new JButton("Pay Rent");	
		tenant = new JButton("Tenant");
		home = new JButton("Home");
		l1 = new JLabel("Credit Card Number:");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Arial",Font.PLAIN, 20));
		l2 = new JLabel("Amount:");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",Font.PLAIN, 20));
		l4 = new JLabel("Name:");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Arial",Font.PLAIN, 20));
		t4 = new JTextField();
		t1 = new JTextField();
		t2 = new JTextField();
		l3= new JLabel(new ImageIcon("E:\\Java Proj\\house.png"));
	}
	private void designUI()
	{ 	
		setLayout(new BorderLayout());
		p1.add(l3);
		p1.add(l4);
		frame.getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(700,400,200,35);	
		p1.add(t4);
		frame.getContentPane().add(t4,BorderLayout.CENTER);
		t4.setBounds(900,400,300,30);
		p1.add(l1);
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(700,450,200,35);	
		p1.add(t1);
		frame.getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(900,450,300,30);
		p1.add(l2);
		frame.getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(700,500,100,35);	
		p1.add(t2);
		frame.getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(900,500,300,30);
		p1.add(home);
		frame.getContentPane().add(home,BorderLayout.CENTER);
		home.setBounds(900,610,100,30);
		p1.add(payRent);
		frame.getContentPane().add(payRent,BorderLayout.CENTER);
		payRent.setBounds(700,610,100,30);
		p1.add(tenant);
		frame.getContentPane().add(tenant,BorderLayout.CENTER);
		tenant.setBounds(1050,610,100,30);
		frame.add(p1);
	}
	private void handleEvent()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		payRent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
			
					try
					{
						String names1 = t4.getText();
						String credit = t1.getText();
						String amount = t2.getText();
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
						LocalDateTime now = LocalDateTime.now();  
						String strDate = dtf.format(now);
						String yes = "Yes";					
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("Driver connected");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserentalsystem","root","");
						System.out.println("Connection established");
						Statement st = con.createStatement();
						Statement st2 = con.createStatement();
						Statement st3 = con.createStatement();
						ResultSet rs=st.executeQuery("select name from tenantdetails where paid = '"+yes+"'");
						while(rs.next())
						{	
							String result=rs.getString("name");
							if(result.equals(names1))
							{
								JOptionPane.showMessageDialog(null,"You've already paid the rent.");
								frame.dispose();
								TenantInterface t = new TenantInterface();
								flag=1;
								break;
							}
							else 
							{
								flag = 0;
							}	
						}
						if(flag==0)
						{
							int y = st3.executeUpdate("update tenantdetails set paid = '"+yes+"' where name = '" + names1 + "'");
							if(y>0)
							{
								int x = st3.executeUpdate("insert into rent values('"+names1+"','"+credit+"','"+amount+"','"+strDate+"')");
								JOptionPane.showMessageDialog(null,"Rent Paid Successfully");
							}
							else 
							{
								JOptionPane.showMessageDialog(null,"Please check your details.");
							}
						}
					}
					catch(ClassNotFoundException | SQLException | HeadlessException e)
					{
						System.out.println("exception");
					}	
				
			}
		});
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				Home h = new Home();
				frame.dispose();
			}
		});
		tenant.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				 TenantInterface t1 = new TenantInterface();
				 frame.dispose();
			}
		});
	}
}
public class RentalSystem
{
	public static void main(String[] args) 
	{
		HouseRent r = new HouseRent(); //start project
	}
}
