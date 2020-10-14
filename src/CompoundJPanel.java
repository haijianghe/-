import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompoundJPanel extends JPanel{
	private Color rectColor = new Color(0xf5f5f5);
	
	public CompoundJPanel()
	{
		setBackground(rectColor);
		addComponents();
	}
	
	// @Override һ����;  �����ǿ��п���                                                                                                                                                    
	//  �����Լ�����Ƿ���ȷ�ĸ�д�˸��������еķ���
	//  ���߶�������ˣ�����һ����д�ķ���
	@Override
	public void paint(Graphics g){
		super.paint(g); //�Ƿ����ԭ�����
		g.setColor(Color.orange);
		g.fillRect(100, 100, 100, 100);
	}
	
	//paintComponent������paintComponents
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g); //�Ƿ����ԭ�����
		g.setColor(Color.BLUE);
		g.fillRect(300, 100, 100, 100);
	}
	 //���һЩ���
    public void addComponents()
    {
		 //���һЩ���
	    JLabel labelCheck = new JLabel("����ǩ");
	    JButton btnCheck = new JButton("��ⰴť");
	    JLabel labelConn = new JLabel("����Label");
	    JButton btnConn = new JButton("����Button");
	    add(labelCheck);
	    add(btnCheck);
	    add(labelConn);
	    add(btnConn);
    }
}
