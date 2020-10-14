import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SimpleDrawCircle  extends JPanel implements MouseListener,MouseMotionListener 
{
	private static final long serialVersionUID = 1L;
	private Color backColor = new Color(0xf5f5f5);
	private Color foreColor = new Color(0x5f5f5f);
	private int px=0,py=0;  //坐标点。
	private int oldx =0,oldy =0 ; //坐标点
	private boolean bPressed = false;
	private boolean bFirst = true; //第一次画
	
	public SimpleDrawCircle()
	{
		setBackground(backColor);
		addMouseListener(this);  // 把这一句加上，才能响应鼠标事件
		this.addMouseMotionListener(this);
	}
	
	
	 
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		px = e.getX();
		py = e.getY();
		bPressed = true;
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		bFirst=true;
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		int newx = arg0.getX();
		int newy = arg0.getY();
		if( (newx!=oldx) || (newy!=oldy) )
		{
			Graphics g = this.getGraphics();
			if( bFirst==false )//擦除旧的
			{
				g.setColor(backColor);
				//g.setColor(Color.RED);
				g.drawOval(px, py, oldx, oldy);
			}
			//画新的
			g.setColor(foreColor);
			g.drawOval(px, py, newx, newy);
		}
		if( bFirst==true )
			bFirst = false; //下次画时，要擦除
		oldx = newx;
		oldy = newy;
	}
}


