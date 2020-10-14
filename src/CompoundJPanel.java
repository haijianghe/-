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
	
	// @Override 一般用途  ，并非可有可无                                                                                                                                                    
	//  帮助自己检查是否正确的复写了父类中已有的方法
	//  告诉读代码的人，这是一个复写的方法
	@Override
	public void paint(Graphics g){
		super.paint(g); //是否绘制原有组件
		g.setColor(Color.orange);
		g.fillRect(100, 100, 100, 100);
	}
	
	//paintComponent，不是paintComponents
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g); //是否绘制原有组件
		g.setColor(Color.BLUE);
		g.fillRect(300, 100, 100, 100);
	}
	 //添加一些组件
    public void addComponents()
    {
		 //添加一些组件
	    JLabel labelCheck = new JLabel("检测标签");
	    JButton btnCheck = new JButton("检测按钮");
	    JLabel labelConn = new JLabel("连接Label");
	    JButton btnConn = new JButton("连接Button");
	    add(labelCheck);
	    add(btnCheck);
	    add(labelConn);
	    add(btnConn);
    }
}
