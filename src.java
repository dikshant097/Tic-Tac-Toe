//tic tac toe game
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Dikshant implements ActionListener
{
	int a[][]=new int[3][3];
	int ab[]=new int[9];
	JButton b[]=new JButton[9];
	JFrame f;
	JPanel jp;
	JMenuBar bar;
	JMenu menu1,menu2;
	Icon i1;
	JMenuItem item1,item2,item3,item4;
	int turn=0,mode=-1;
	Dikshant(String title)
	{
		int i,j;
		f=new JFrame(title);
		
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				a[i][j]=-10;
		}
		for( i=0;i<9;i++)
			{
				ab[i]=0;
				b[i]=new JButton();
				b[i].addActionListener(this);
				b[i].setEnabled(false);
				f.add(b[i]);
				
			}
		bar=new JMenuBar();
		
		menu2=new JMenu("Game Mode");
		menu2.setMnemonic(KeyEvent.VK_G);
		bar.add(menu2);
		item1=new JMenuItem("Single Player",KeyEvent.VK_S);
		item1.addActionListener(this);
		menu2.add(item1);
		item2=new JMenuItem("Multi-Player",KeyEvent.VK_M);
		item2.addActionListener(this);
		menu2.add(item2);
		menu1=new JMenu("Options");
		menu1.setMnemonic(KeyEvent.VK_O);
		bar.add(menu1);
		item3=new JMenuItem("New Game",KeyEvent.VK_N);
		item3.addActionListener(this);
		menu1.add(item3);
		item4=new JMenuItem("Exit",KeyEvent.VK_E);
		item4.addActionListener(this);
		menu1.add(item4);
		KeyStroke k1=KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK);
		item1.setAccelerator(k1);
		KeyStroke k2=KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK);
		item2.setAccelerator(k2);
		KeyStroke k3=KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK);
		item3.setAccelerator(k3);
		KeyStroke k4=KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK);
		item4.setAccelerator(k4);
		f.setJMenuBar(bar);
		f.setLayout(new GridLayout(3,3,0,0));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	boolean  draw()
	{
		int i;
		for(i=0;i<9;i++)
		{
			if(ab[i]==0)
				return false;
		}
		return true;
	}
	public void newGame()
	{
		int i,j;
		if(mode==1)
		{
			for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				a[i][j]=0;
		}
		}
		else
		{
			for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				a[i][j]=-10;
		}
		}
		for( i=0;i<9;i++)
		{
			ab[i]=0;
			b[i].setIcon(null);
			b[i].setEnabled(true);
		}
	}
	boolean checkEmpty()
	{
		int i,j,c=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]==3)
					c++;
			}
		}
		if(c>1)
			return false;
		else 
			return true;
	}
	void buttonZero(ActionEvent e)
	{
				i1=new ImageIcon("katta.jpg");
				b[0].setIcon(i1);
				ab[0]=1;
				a[0][0]=3;
							if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
									JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
								newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
								newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
								newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
								newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else                                    
							{
									//code to check user's mistake and making bot winner here
									
									
							if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
								
									//Bot trying to defend 
									
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0)) 
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}
					
			}
	void buttonOne(ActionEvent e)
	{
		i1=new ImageIcon("katta.jpg");
				b[1].setIcon(i1);
				ab[1]=1;
				a[0][1]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
								
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}
	}
	void buttonTwo(ActionEvent e)
	{i1=new ImageIcon("katta.jpg");
				b[2].setIcon(i1);
				ab[2]=1;
				a[0][2]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won the game");
									newGame();
							}
							else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost the game");
									newGame();
							}
								
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}
							
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Single Player"))
		{
			mode=1;
			newGame();
			/*int be;
			for( be=0;be<9;be++)
			{
				b[be].setEnabled(true);
				
			}
			for( int i=0;i<3;i++)
			{
				for( int j=0;j<3;j++)
					a[i][j]=0;
			}*/
			
		}
		else if(e.getActionCommand().equals("Multi-Player"))
		{
			mode=0;
			newGame();
			/*int be;
			for( be=0;be<9;be++)
			{
				b[be].setEnabled(true);
				
			}*/
		}
		else if(e.getActionCommand().equals("Exit"))
			System.exit(0);
		else if(e.getActionCommand().equals("New Game"))
			newGame();
		
		if(mode==0)
		{
			if(e.getSource()==b[0]&&ab[0]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[0][0]=0;
			}
			else if(turn==1)
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[0][0]=1;
			}
			
			b[0].setIcon(i1);
			ab[0]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[1]&&ab[1]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[0][1]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[0][1]=1;
			}
			b[1].setIcon(i1);
			ab[1]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[4].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[2]&&ab[2]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[0][2]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[0][2]=1;
			}
			
			b[2].setIcon(i1);
			ab[2]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[4].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[3]&&ab[3]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[1][0]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[1][0]=1;
			}
			
			b[3].setIcon(i1);
			ab[3]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[4].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[4]&&ab[4]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[1][1]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[1][1]=1;
			}
			
			b[4].setIcon(i1);
			ab[4]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[5]&&ab[5]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[1][2]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[1][2]=1;
			}
			
			b[5].setIcon(i1);
			ab[5]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[6]&&ab[6]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[2][0]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[2][0]=1;
			}
			
			b[6].setIcon(i1);
			ab[6]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[7]&&ab[7]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[2][1]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[2][1]=1;
			}
			
			b[7].setIcon(i1);
			ab[7]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		else if(e.getSource()==b[8]&&ab[8]==0)
		{
			if(turn==0)
			{
				i1=new ImageIcon("katta.jpg");
				turn=1;
				a[2][2]=0;
			}
			else
			{
				i1=new ImageIcon("zero.jpg");
				turn=0;
				a[2][2]=1;
			}
			
			b[8].setIcon(i1);
			ab[8]=1;
			if(a[0][0]+a[0][1]+a[0][2]==0)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();

			}
			else if(a[2][0]+a[2][1]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==0)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==0)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==0)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==0)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Cross Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[0][1]+a[0][2]==3)
			{
				for(int c=3;c<9;c++)
					b[c].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[1][0]+a[1][1]+a[1][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[2][0]+a[2][1]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][0]+a[2][0]==3)
			{
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[4].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][1]+a[1][1]+a[2][1]==3)
			{
				b[0].setEnabled(false);
				b[3].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[5].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][2]+a[2][2]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[4].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][0]+a[1][1]+a[2][2]==3)
			{
				b[3].setEnabled(false);
				b[1].setEnabled(false);
				b[2].setEnabled(false);
				b[6].setEnabled(false);
				b[7].setEnabled(false);
				b[5].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(a[0][2]+a[1][1]+a[2][0]==3)
			{
				b[0].setEnabled(false);
				b[1].setEnabled(false);
				b[3].setEnabled(false);
				b[5].setEnabled(false);
				b[7].setEnabled(false);
				b[8].setEnabled(false);
				JOptionPane.showMessageDialog(f,"Player Zero Won the Game!!!");
									newGame();
			}
			else if(draw())
			{
				JOptionPane.showMessageDialog(f,"Game Drawn!!!");
									newGame();
			}
		}
		}
		if(mode==1)
		{
			
			if(e.getSource()==b[0]&&ab[0]==0) 				//user's turn
			{
				buttonZero(e);
			}
			else if(e.getSource()==b[1]&&ab[1]==0)
			{
				buttonOne(e);
						
			}
			else if(e.getSource()==b[2]&&ab[2]==0)
			{
				buttonTwo(e);
			}
			else if(e.getSource()==b[3]&&ab[3]==0)
			{
				i1=new ImageIcon("katta.jpg");
				b[3].setIcon(i1);
				ab[3]=1;
				a[1][0]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
								
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
							}							
			}
			else if(e.getSource()==b[4]&&ab[4]==0)
			{
				i1=new ImageIcon("katta.jpg");
				b[4].setIcon(i1);
				ab[4]=1;
				a[1][1]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}							
			}
			else if(e.getSource()==b[5]&&ab[5]==0)
			{
				i1=new ImageIcon("katta.jpg");
				b[5].setIcon(i1);
				ab[5]=1;
				a[1][2]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!...You Won The Game");
									newGame();
							}
							else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
								}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!...You Lost The Game");
									newGame();
							}
								
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
							}							
			}
			else if(e.getSource()==b[6]&&ab[6]==0)
			{
				i1=new ImageIcon("katta.jpg");
				b[6].setIcon(i1);
				ab[6]=1;
				a[2][0]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
									JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
								
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}							
			}
			else if(e.getSource()==b[7]&&ab[7]==0)
			{
				i1=new ImageIcon("katta.jpg");
				b[7].setIcon(i1);
				ab[7]=1;
				a[2][1]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
else
							{
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
								
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}							
			}
			else if(e.getSource()==b[8]&&ab[8]==0)
			{
				i1=new ImageIcon("katta.jpg");
				b[8].setIcon(i1);
				ab[8]=1;
				a[2][2]=3;
						if(a[0][0]+a[0][1]+a[0][2]==9)		//checking if user have won the game
							{
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==9)
							{
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==9)
							{
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==9)
							{
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==9)
							{
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Congratulations!!!..You Won The Game!");
											newGame();
							}
							else
							{
							
								if(a[0][0]+a[0][1]+a[0][2]==4)		//checking if bot have won the game
							{
									if(ab[0]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(ab[0]==1&&ab[2]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(ab[2]==1&&ab[1]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									for(int c=3;c<9;c++)
									b[c].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[1][0]+a[1][1]+a[1][2]==4)
							{
								if(ab[3]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[3]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();

							}
							else if(a[2][0]+a[2][1]+a[2][2]==4)
							{
								if(ab[6]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[6]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[7]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][0]+a[2][0]==4)
							{
								if(ab[0]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[0]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(ab[6]==1&&ab[3]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[4].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][1]+a[1][1]+a[2][1]==4)
							{
								if(ab[1]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(ab[1]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[7]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								
								b[0].setEnabled(false);
								b[3].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[5].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][2]+a[2][2]==4)
							{
								if(ab[2]==1&&ab[5]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[2]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(ab[5]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[4].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][0]+a[1][1]+a[2][2]==4)
							{
								if(ab[0]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(ab[0]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[8]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								
								b[3].setEnabled(false);
								b[1].setEnabled(false);
								b[2].setEnabled(false);
								b[6].setEnabled(false);
								b[7].setEnabled(false);
								b[5].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
							else if(a[0][2]+a[1][1]+a[2][0]==4)
							{
								if(ab[2]==1&&ab[4]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(ab[2]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(ab[4]==1&&ab[6]==1)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								
								b[0].setEnabled(false);
								b[1].setEnabled(false);
								b[3].setEnabled(false);
								b[5].setEnabled(false);
								b[7].setEnabled(false);
								b[8].setEnabled(false);
								JOptionPane.showMessageDialog(f,"Sorry!!!..You Lost The Game!");
											newGame();
							}
								else if((a[0][0]+a[0][1]+a[0][2]==6)&&(ab[2]==0||ab[1]==0||ab[0]==0))
								{
								
									if(a[0][1]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(a[0][2]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
									else if(a[0][1]==3&&a[0][2]==3)
							
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									
								}
								else if((a[0][0]+a[1][0]+a[2][0]==6)&&(ab[6]==0||ab[3]==0||ab[0]==0)) 
								{
									if(a[1][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[2][0]==3&&a[0][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
									else if(a[1][0]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[1][0]+a[1][1]+a[1][2]==6)&&(ab[5]==0||ab[4]==0||ab[3]==0))
								{
									if(a[1][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][0]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[3].setIcon(i1);
										ab[3]=1;
										a[1][0]=2;
									}
								}
								else if((a[2][0]+a[2][1]+a[2][2]==6)&&(ab[8]==0||ab[7]==0||ab[6]==0))
								{
									if(a[2][0]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[2][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[2][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
								}
								else if((a[0][1]+a[1][1]+a[2][1]==6)&&(ab[7]==0||ab[4]==0||ab[1]==0))
								{
									if(a[0][1]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[7].setIcon(i1);
										ab[7]=1;
										a[2][1]=2;
									}
									else if(a[0][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[1].setIcon(i1);
										ab[1]=1;
										a[0][1]=2;
									}
								}
								else if((a[0][2]+a[1][2]+a[2][2]==6)&&(ab[8]==0||ab[5]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[5].setIcon(i1);
										ab[5]=1;
										a[1][2]=2;
									}
									else if(a[1][2]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else if((a[0][0]+a[1][1]+a[2][2]==6)&&(ab[8]==0||ab[4]==0||ab[0]==0))
								{
									if(a[0][0]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else if(a[0][0]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][2]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
								}
								else if((a[0][2]+a[1][1]+a[2][0]==6)&&(ab[6]==0||ab[4]==0||ab[2]==0))
								{
									if(a[0][2]==3&&a[1][1]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(a[0][2]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(a[1][1]==3&&a[2][0]==3)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
								}
								else
								{
									if(checkEmpty()&&ab[4]==0)	//bot's first step
									{
										i1=new ImageIcon("zero.jpg");
										b[4].setIcon(i1);
										ab[4]=1;
										a[1][1]=2;
									}
									else if(checkEmpty()&&ab[0]==0)
									{
											i1=new ImageIcon("zero.jpg");
										b[0].setIcon(i1);
										ab[0]=1;
										a[0][0]=2;
									}
									else if(checkEmpty()&&ab[2]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[2].setIcon(i1);
										ab[2]=1;
										a[0][2]=2;
									}
									else if(checkEmpty()&&ab[6]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[6].setIcon(i1);
										ab[6]=1;
										a[2][0]=2;
									}
									else if(checkEmpty()&&ab[8]==0)
									{
										i1=new ImageIcon("zero.jpg");
										b[8].setIcon(i1);
										ab[8]=1;
										a[2][2]=2;
									}
									else 
									{
										// code if only one zero is there in a row
										if(((a[0][0]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][1]==8)||(a[0][2]+a[1][1]+a[2][0]==8)||(a[0][0]+a[1][1]+a[2][2]==8)||(a[0][2]+a[1][1]+a[2][2]==8)||(a[0][1]+a[1][1]+a[2][1]==8)||(a[0][1]+a[1][1]+a[2][0]==8))&&(ab[5]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[5].setIcon(i1);
											ab[5]=1;
											a[1][2]=2;
										}
										
										else if(((a[0][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[0][2]==8)||(a[1][0]+a[1][1]+a[1][2]==8)||(a[1][0]+a[1][1]+a[2][2]==8)||(a[2][1]+a[1][1]+a[1][2]==8))&&(ab[1]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[1].setIcon(i1);
											ab[1]=1;
											a[0][1]=2;
										}
										else if(((a[0][1]+a[1][1]+a[1][2]==8)||(a[0][1]+a[1][1]+a[1][0]==8)||(a[1][0]+a[1][1]+a[2][1]==8)||(a[1][2]+a[1][1]+a[2][1]==8))&&(ab[2]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[2].setIcon(i1);
											ab[2]=1;
											a[0][2]=2;
										}
										else if(((a[2][0]+a[2][1]+a[2][2]==8)||(a[0][0]+a[1][1]+a[2][2]==8))&&(ab[3]==0))
										{
											i1=new ImageIcon("zero.jpg");
											b[3].setIcon(i1);
											ab[3]=1;
											a[1][0]=2;
										}
										else
										{
											JOptionPane.showMessageDialog(f,"Game drawn");
											newGame();
										}
									}
									
								}
								
							}
			}
		}
		
	}
	public static void main(String... s)
	{
		new Dikshant("TIC TAC TOE");
	}
}