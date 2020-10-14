import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * JFrame的综合功能。
 * 1，paint 和painComponent（注意是否带s）的区别；是否需要override.
 * 2，super.paint(g); super.painComponent(g);的使用。
 * 
 */
public class CompoundJFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int width = 100;
    private static final int height = 200;
    
    private Color rectColor = new Color(0xA1B2C3);
    
    /**
     * CompoundJFrame构造方法
     */
    public CompoundJFrame() {
        Container contentPane = getContentPane();
        setBounds(50, 50, 600, 600);
        setVisible(true);
        contentPane.setBackground(rectColor);
        //setLayout(null);   //会清空组件
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        //添加一些组件
        //addComponents();
        addJPanelComponents();
        // 添加鼠监听事件，当鼠标点击时触发
        this.addMouseListener(new MouseAdapter() {
            // 定义鼠标点击事件响应过程
            @Override
            public void mouseClicked(MouseEvent e) {
                //获取鼠标点击的那一点的x，y坐标
                int x = e.getX(), y = e.getY();
                System.out.println(x+","+y);
                drawComponents(x,y);
            }
        });
    }//end of public SimpleDrawLine() 
    
    //画直线。
    public void drawComponents(int startx,int starty) {
    	Graphics g = this.getGraphics();
        g.setColor(Color.RED);
        g.drawRect(startx, starty, width, height);
    }
    
    //paintComponents带s，不是paintComponent
    //下面的方法好像不起作用。
    @Override
	public void paintComponents(Graphics g){
		super.paintComponents(g); //是否绘制原有组件
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 100, 100);
	}
    
    //显示信息
    public void showInfo(String strInfo)
    {
    	System.out.println(strInfo);
    }
    
    //添加一些组件，下面的方法调试通过，注意：JFrame能添加组件。
    public void addComponents()
    {
		Container contentPane = this.getContentPane();
		//添加一些组件
	    JLabel labelCheck = new JLabel("检测标签");
	    JButton btnCheck = new JButton("检测按钮");
	    JLabel labelConn = new JLabel("连接Label");
	    JButton btnConn = new JButton("连接Button");
	    contentPane.add(labelCheck);
	    contentPane.add(btnCheck);
	    contentPane.add(labelConn);
	    contentPane.add(btnConn);
	    //注意：JFrame能添加组件。与资料介绍不同。
	    JButton btnThird = new JButton("直接按钮");
	    this.add(btnThird);
    }
    
    //添加一些组件，下面的方法调试通过，通过JPanel添加组件。
    //把JPanel添加组件 。因为Swing组件不可以直接加入到顶级容器中,通常是 JFrame, JDialog, and JApplet三个顶层容器类。
    //把JPanel及JPanel上的其他组件都加入顶层容器JFrame  
    public void addJPanelComponents()
    {
    	JPanel panel = new JPanel();
    	Container contentPane = this.getContentPane();
		//添加一些组件
	    JLabel labelCheck = new JLabel("检测标签");
	    JButton btnCheck = new JButton("检测按钮");
	    JLabel labelConn = new JLabel("连接Label");
	    JButton btnConn = new JButton("连接Button");
	    panel.add(labelCheck);
	    panel.add(btnCheck);
	    panel.add(labelConn);
	    panel.add(btnConn);
	    //通过JPanel添加组件。
	    contentPane.add(panel);
    }
}

