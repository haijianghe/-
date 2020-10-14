import java.awt.Color;
import java.awt.Graphics;

public class HhjCircle implements HiStroke{
	private int m_radius=0; //�뾶��
	public int m_ptx=0,m_pty=0; //���ĵ�����	
	
	public HhjCircle()
	{
		
	}
	//��ֵ�Ĺ��캯����
	public HhjCircle(int sx,int sy,int radius)
	{
		m_ptx = sx;
		m_pty = sy;
		m_radius = radius;
	}
	
	//��Բ
	@Override
	public void Draw(Graphics g)
	{
		g.drawOval(m_ptx-m_radius, m_pty-m_radius, 
					m_ptx+m_radius, m_pty+m_radius);
	}
	//�ƶ�Բ����λ��newx,newy
	@Override
	public void Move(Graphics g,int newx,int newy)
	{
		Color cr = g.getColor();
		g.setColor(new Color(0xf5f5f5));
		g.drawOval(m_ptx-m_radius, m_pty-m_radius, 
				m_ptx+m_radius, m_pty+m_radius);
		g.setColor(cr);
		m_ptx = newx;
		m_pty = newy;
		g.drawOval(m_ptx-m_radius, m_pty-m_radius, 
				m_ptx+m_radius, m_pty+m_radius);
	}
}
