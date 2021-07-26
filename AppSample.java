import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AppSample
{
	String msg = "";
	AppSample()
	{
		JFrame jf = new JFrame("AppSample");
		jf.setSize(350,350);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setFont(new Font("Plain",Font.BOLD,100));
		
		/*Numbers*/
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");	
		
		/*Operaors*/
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton equal = new JButton("=");
		JButton sqr = new JButton("^");
		JButton sqrt = new JButton("s");
		JButton modulus = new JButton("%");
		JButton clear = new JButton("c");
		JButton point = new JButton(".");
		
		/*Modeling*/
		
		one.setBackground(Color.red);
		one.setForeground(Color.black);
		
		two.setBackground(Color.red);
		two.setForeground(Color.black);
		
		three.setBackground(Color.red);
		three.setForeground(Color.black);
		
		four.setBackground(Color.red);
		four.setForeground(Color.black);
		
		five.setBackground(Color.red);
		five.setForeground(Color.black);
		
		six.setBackground(Color.red);
		six.setForeground(Color.black);
		
		seven.setBackground(Color.red);
		seven.setForeground(Color.black);
		
		eight.setBackground(Color.red);
		eight.setForeground(Color.black);
		
		nine.setBackground(Color.red);
		nine.setForeground(Color.black);
		
		zero.setBackground(Color.red);
		zero.setForeground(Color.black);
		
		plus.setBackground(Color.red);
		plus.setForeground(Color.black);
		
		minus.setBackground(Color.red);
		minus.setForeground(Color.black);
		
		multiply.setBackground(Color.red);
		multiply.setForeground(Color.black);
		
		divide.setBackground(Color.red);
		divide.setForeground(Color.black);
		
		point.setBackground(Color.red);
		point.setForeground(Color.black);
		
		modulus.setBackground(Color.red);
		modulus.setForeground(Color.black);
		
		sqr.setBackground(Color.red);
		sqr.setForeground(Color.black);
		
		sqrt.setBackground(Color.red);
		sqrt.setForeground(Color.black);
		
		clear.setBackground(Color.red);
		clear.setForeground(Color.black);
		
		equal.setBackground(Color.red);
		equal.setForeground(Color.black);
		
		/*Text Field-->Work Space*/
		
		JTextField jtf = new JTextField(10);
		
		/*Assign controls with their respective listeners*/
		
		jtf.addKeyListener(new KeyAdapter()
		{
			public void keyTypped(KeyEvent ke)
			{
				if(ke.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
					clear.addActionListener((ae)->{try{msg = msg.substring(0,msg.length()-1);}
						catch(StringIndexOutOfBoundsException se){}
						jtf.setText(msg);
					});
				}
				msg += ke.getKeyChar();
			}	
			
		});
		one.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		two.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		three.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		four.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		five.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		six.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		seven.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		eight.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		nine.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		zero.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		plus.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		minus.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
		
		multiply.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		divide.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
			
		sqr.addActionListener((ae)->{msg += ae.getActionCommand();
			jtf.setText(msg);});
		
		sqrt.addActionListener((ae)->{msg +=ae.getActionCommand();
			jtf.setText(msg);});

	   	 modulus.addActionListener((ae)->{msg +=ae.getActionCommand();
			jtf.setText(msg);});

		clear.addActionListener((ae)->{try{msg = msg.substring(0,msg.length()-1);}
			catch(StringIndexOutOfBoundsException se){}
			jtf.setText(msg);});
		point.addActionListener((ae)->{msg += ae.getActionCommand();	
			jtf.setText(msg);});
		
		equal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			
			  try {
					char[] chArr = (jtf.getText()).toCharArray();
					String res = "";
					double val = 0;
					for(int i=0;i<chArr.length;i++)
					{
						if(Character.isDigit(chArr[i]))
						{
							res += chArr[i];
							val = Double.parseDouble(res);
						}
						else if(String.valueOf(chArr[i]).equals("."))
						{
							res += chArr[i];
							val = Double.parseDouble(res);
						}	
						else if(String.valueOf(chArr[i]).equals("s"))
						{
							val = Math.sqrt(val);
						}	
						else
						{
							if(Character.isDigit(chArr[i+1]))
							{
								int j = i+1;
								String temp = "";
								while(j<chArr.length&&Character.isDigit(chArr[j])||j<chArr.length&&String.valueOf(chArr[j]).equals("."))
								{
									temp +=chArr[j];
									j++;
								}
								if(String.valueOf(chArr[i]).equals("+"))
								{
									val = val + Double.parseDouble(temp);
								}
								else if(String.valueOf(chArr[i]).equals("-"))
								{
									val = val - Double.parseDouble(temp);
								}
								else if(String.valueOf(chArr[i]).equals("*"))
								{
									val = val * Double.parseDouble(temp);
								}
								else if(String.valueOf(chArr[i]).equals("/"))
								{
									val = val / Double.parseDouble(temp);
								}
								else if(String.valueOf(chArr[i]).equals("%"))
								{
									val = val%Double.parseDouble(temp);
								}
								else if(String.valueOf(chArr[i]).equals("^"))
								{
									val = Math.pow(val,Double.parseDouble(temp));
								}
								i = j-1;
							}
							else
							{
								throw new InvalidSyntaxException("Invalid");
							}
						}
					}
					msg = "";
					msg += val;
					jtf.setText(msg);
				} catch(ArrayIndexOutOfBoundsException a){System.out.println("Syntax error");}
			}
		});
		/*set tool tip text*/
		jtf.setToolTipText("WorkArea");
		plus.setToolTipText("Addition");
		minus.setToolTipText("Substraction");
		multiply.setToolTipText("Multiply");
		modulus.setToolTipText("modulus");
		sqrt.setToolTipText("SqureRoot");
		sqr.setToolTipText("Square");
		divide.setToolTipText("Division");
		point.setToolTipText("Point");
		clear.setToolTipText("clear");
		equal.setToolTipText("EqualTo");
		
		/*Setting Layout*/
		
		jf.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
	
		/*First row Constraints*/
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.gridwidth = 5;
		gbc.ipady = 25;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		/*First Row*/
		
		jf.add(jtf,gbc);
		
		/*second row Constraints*/
		gbc.insets = new Insets(0,0,0,0);
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_START;
		
		/*Second row*/
		
		jf.add(clear,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		
		jf.add(minus,gbc);
		
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		
		jf.add(multiply,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		
		jf.add(divide,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		
		jf.add(plus,gbc);
		
		/*Row Three*/
		
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.LINE_START;
		
		jf.add(equal,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
			
		jf.add(zero,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		
		jf.add(one,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		
		jf.add(two,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		
		jf.add(three,gbc);
		
		/*Row Four*/
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.LINE_START;
		
		jf.add(modulus,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		
		jf.add(five,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		
		jf.add(six,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		
		jf.add(seven,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		
		jf.add(eight,gbc);
		
		/*Row Five*/
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.LINE_START;
		
		jf.add(sqrt,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		
		jf.add(four,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		
		jf.add(point,gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 4;		
		
		jf.add(sqr,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		
		jf.add(nine,gbc);
		
		
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new AppSample();
			}	
		});
	}
}