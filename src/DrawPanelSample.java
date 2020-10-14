import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//添加implements MouseListener,会添加几个鼠标事件
public class DrawPanelSample extends JPanel implements MouseListener
{
	private static final long serialVersionUID = 1L;
	private Color rectColor = new Color(0xf5f5f5);
	private int m_type=1; //1=直线,2=圆
	private ArrayList<HiStroke> m_strokes = new ArrayList<HiStroke>();
	
	public DrawPanelSample()
	{
		setBackground(rectColor);
		addComponents();
		addMouseListener(this);  // 把这一句加上，才能响应鼠标事件
		this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	System.out.println(m_type+"  is on.");
            }
        });
	}
	
	
	// @Override 一般用途  ，并非可有可无                                                                                                                                                    
	//  帮助自己检查是否正确的复写了父类中已有的方法
	//  告诉读代码的人，这是一个复写的方法
	@Override
	public void paint(Graphics g){
		super.paint(g); //是否绘制原有组件
		int size = m_strokes.size();
		for( int i=0;i<size;i++ )
		{
			HiStroke his = m_strokes.get(i);
			his.Draw(g);
		}
	}
	
//	//paintComponent，不是paintComponents
//	@Override
//	public void paintComponent(Graphics g){
//		super.paintComponent(g); //是否绘制原有组件
//		g.setColor(Color.BLUE);
//		g.fillRect(300, 100, 10, 10);
//	}
	 //添加一些组件
    public void addComponents()
    {
		 //添加一些组件
	    JButton btnLine = new JButton("画直线");
	    btnLine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	m_type = 1;//直线
            }
        });
	    JButton btnRect = new JButton("画矩形");
	    JButton btnCircle = new JButton("画圆");
	    btnCircle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	m_type = 2;//圆
            }
        });
	    JButton btnTriangle = new JButton("画三角形");
	    add(btnLine);
	    add(btnRect);
	    add(btnCircle);
	    add(btnTriangle);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mousedown");
		HiStroke hs;
		if( 1==m_type)
			hs = StrokeConcreteFactory.produceLine(e.getX(), e.getY(), 100, 100);
		else if( 2==m_type)
			hs = StrokeConcreteFactory.produceCircle(e.getX(), e.getY(), 100);
		else
			hs = StrokeConcreteFactory.produceRectangle(e.getX(), e.getY(), 100, 100);
		m_strokes.add(hs);
		hs.Draw(this.getGraphics());
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

