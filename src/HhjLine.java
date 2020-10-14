import java.awt.Color;
import java.awt.Graphics;

public class HhjLine implements HiStroke{
	private int m_endx=0,m_endy=0; //���������ꡣ
	public int m_ptx=0,m_pty=0; //��ʼ������	
	
	public HhjLine()
	{
		
	}
	//��ֵ�Ĺ��캯����
	public HhjLine(int sx,int sy,int ex,int ey)
	{
		m_ptx = sx;
		m_pty = sy;
		m_endx = ex;
		m_endy = ey;
	}
	
	//��ֱ��
	@Override
	public void Draw(Graphics g)
	{
		g.drawLine(m_ptx, m_pty, m_endx, m_endy);
	}
	//�ƶ�ֱ�ߵ���λ��newx,newy
	@Override
	public void Move(Graphics g,int newx,int newy)
	{
		Color cr = g.getColor();
		g.setColor(new Color(0xf5f5f5));
		g.drawLine(m_ptx, m_pty, m_endx, m_endy);
		g.setColor(cr);
		g.drawLine(m_ptx, m_pty, newx, newy);
		m_endx = newx;
		m_endy = newy;
	}
}
