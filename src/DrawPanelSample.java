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

//���implements MouseListener,����Ӽ�������¼�
public class DrawPanelSample extends JPanel implements MouseListener
{
	private static final long serialVersionUID = 1L;
	private Color rectColor = new Color(0xf5f5f5);
	private int m_type=1; //1=ֱ��,2=Բ
	private ArrayList<HiStroke> m_strokes = new ArrayList<HiStroke>();
	
	public DrawPanelSample()
	{
		setBackground(rectColor);
		addComponents();
		addMouseListener(this);  // ����һ����ϣ�������Ӧ����¼�
		this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	System.out.println(m_type+"  is on.");
            }
        });
	}
	
	
	// @Override һ����;  �����ǿ��п���                                                                                                                                                    
	//  �����Լ�����Ƿ���ȷ�ĸ�д�˸��������еķ���
	//  ���߶�������ˣ�����һ����д�ķ���
	@Override
	public void paint(Graphics g){
		super.paint(g); //�Ƿ����ԭ�����
		int size = m_strokes.size();
		for( int i=0;i<size;i++ )
		{
			HiStroke his = m_strokes.get(i);
			his.Draw(g);
		}
	}
	
//	//paintComponent������paintComponents
//	@Override
//	public void paintComponent(Graphics g){
//		super.paintComponent(g); //�Ƿ����ԭ�����
//		g.setColor(Color.BLUE);
//		g.fillRect(300, 100, 10, 10);
//	}
	 //���һЩ���
    public void addComponents()
    {
		 //���һЩ���
	    JButton btnLine = new JButton("��ֱ��");
	    btnLine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	m_type = 1;//ֱ��
            }
        });
	    JButton btnRect = new JButton("������");
	    JButton btnCircle = new JButton("��Բ");
	    btnCircle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	m_type = 2;//Բ
            }
        });
	    JButton btnTriangle = new JButton("��������");
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

