import java.applet.Applet;




import java.awt.event.*;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
@SuppressWarnings("serial")
public class Firstgame extends Applet implements MouseListener,Runnable,ActionListener 
{
int x,a,i=10,m1,m2;
int y,b=50,c=1500;
ImageIcon ic;
Label jl1,jl2,jl3;
int j,g,h=1;
Thread t;
Button jb;
int tu=18;


public void init()
{
	i=10;
	jl1=new Label("Remaining turns:"+tu);
	jl2=new Label("Score:0");
	jl3=new Label("Catch the Object");

	jb=new Button();
	add(jb);
	add(jl1);
	add(jl2);
	add(jl3);
	//ic=getImage(getCodeBase(),"564835.jpg");
	
	
	t=new Thread(this);
	t.start();
	addMouseListener(this);
	jb.addActionListener(this);
		
}
public void paint(Graphics g)
{
	jl1.setBounds(20,80,130,50);
	jl2.setBounds(1200,80,80,50);
	jl3.setBounds(500,40,600,80);
	jl3.setFont(new Font("Times new Roman",Font.BOLD|Font.ITALIC,40));
	jl2.setForeground(Color.RED);
	jl1.setForeground(Color.BLUE);
	jl3.setForeground(Color.ORANGE);
	//g.drawImage(ic,x,y,100,100,this);
	
	jb.setBounds(x,y,100,100);
	
	//g.drawOval(x, y,200,200);                                  
}
public void mouseClicked(MouseEvent m) 
{
	m1=m.getX();
	m2=m.getY();
	
	
	
}
public void mouseEntered(MouseEvent aes) 
{
	
	
	

	// TODO Auto-generated method stub
	
}
public void mouseExited(MouseEvent aes)
{

	

	// TODO Auto-generated method stub
	
}
public void mousePressed(MouseEvent aes)
{
if(aes.getComponent()!=jb)
{tu--;
	jl1.setText("Remaining turns:"+String.valueOf(tu));
}
else
{
	jl1.setText("Remaining turns:"+String.valueOf(tu));}
	
}
public void mouseReleased(MouseEvent aes) {
	
	// TODO Auto-generated method stub
	
}
public void run()
{
	try
	{
		while(i!=0)
		{
			
			Thread.sleep(c);
			 if(tu<=0)
			{
				
				JOptionPane.showMessageDialog(this ,"You used your all turns");
				
				
				System.exit(1);
		
				
			}
			 else if(c==0)
				{
					JOptionPane.showMessageDialog(this ,"You complete the game with score"+i+" Do u want to play again ?");
					System.exit(1);
				}
				
			
			Random r=new Random();
			x=r.nextInt(600);
			y=r.nextInt(600);
			repaint();
			
		
			
		}
	}
		catch(InterruptedException e){}
			
	
	// TODO Auto-generated method stub
	
}
public int nextInt(int c)
{
	return 0;}
public void actionPerformed(ActionEvent e)

{
	
	if(e.getSource()==jb)
	{
		tu--;
		jl2.setText("Score:"+String.valueOf(i));
		jl1.setText("Remaining turns:"+String.valueOf(tu));
		jl2.setForeground(Color.RED);
		jl1.setForeground(Color.BLUE);
		JOptionPane.showMessageDialog(this," The level is Getting Harder You scored "+(i)+" points");
		i=i+10;
		c=c-b;
	
	
	}
		
	// TODO Auto-generated method stub
	
}


}
