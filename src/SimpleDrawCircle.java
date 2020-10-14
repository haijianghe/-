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
	private int px=0,py=0;  //����㡣
	private int oldx =0,oldy =0 ; //�����
	private boolean bPressed = false;
	private boolean bFirst = true; //��һ�λ�
	
	public SimpleDrawCircle()
	{
		setBackground(backColor);
		addMouseListener(this);  // ����һ����ϣ�������Ӧ����¼�
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
			if( bFirst==false )//�����ɵ�
			{
				g.setColor(backColor);
				//g.setColor(Color.RED);
				g.drawOval(px, py, oldx, oldy);
			}
			//���µ�
			g.setColor(foreColor);
			g.drawOval(px, py, newx, newy);
		}
		if( bFirst==true )
			bFirst = false; //�´λ�ʱ��Ҫ����
		oldx = newx;
		oldy = newy;
	}
}


