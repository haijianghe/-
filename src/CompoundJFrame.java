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
 * JFrame���ۺϹ��ܡ�
 * 1��paint ��painComponent��ע���Ƿ��s���������Ƿ���Ҫoverride.
 * 2��super.paint(g); super.painComponent(g);��ʹ�á�
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
     * CompoundJFrame���췽��
     */
    public CompoundJFrame() {
        Container contentPane = getContentPane();
        setBounds(50, 50, 600, 600);
        setVisible(true);
        contentPane.setBackground(rectColor);
        //setLayout(null);   //��������
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        //���һЩ���
        //addComponents();
        addJPanelComponents();
        // ���������¼����������ʱ����
        this.addMouseListener(new MouseAdapter() {
            // ����������¼���Ӧ����
            @Override
            public void mouseClicked(MouseEvent e) {
                //��ȡ���������һ���x��y����
                int x = e.getX(), y = e.getY();
                System.out.println(x+","+y);
                drawComponents(x,y);
            }
        });
    }//end of public SimpleDrawLine() 
    
    //��ֱ�ߡ�
    public void drawComponents(int startx,int starty) {
    	Graphics g = this.getGraphics();
        g.setColor(Color.RED);
        g.drawRect(startx, starty, width, height);
    }
    
    //paintComponents��s������paintComponent
    //����ķ������������á�
    @Override
	public void paintComponents(Graphics g){
		super.paintComponents(g); //�Ƿ����ԭ�����
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 100, 100);
	}
    
    //��ʾ��Ϣ
    public void showInfo(String strInfo)
    {
    	System.out.println(strInfo);
    }
    
    //���һЩ���������ķ�������ͨ����ע�⣺JFrame����������
    public void addComponents()
    {
		Container contentPane = this.getContentPane();
		//���һЩ���
	    JLabel labelCheck = new JLabel("����ǩ");
	    JButton btnCheck = new JButton("��ⰴť");
	    JLabel labelConn = new JLabel("����Label");
	    JButton btnConn = new JButton("����Button");
	    contentPane.add(labelCheck);
	    contentPane.add(btnCheck);
	    contentPane.add(labelConn);
	    contentPane.add(btnConn);
	    //ע�⣺JFrame���������������Ͻ��ܲ�ͬ��
	    JButton btnThird = new JButton("ֱ�Ӱ�ť");
	    this.add(btnThird);
    }
    
    //���һЩ���������ķ�������ͨ����ͨ��JPanel��������
    //��JPanel������ ����ΪSwing���������ֱ�Ӽ��뵽����������,ͨ���� JFrame, JDialog, and JApplet�������������ࡣ
    //��JPanel��JPanel�ϵ�������������붥������JFrame  
    public void addJPanelComponents()
    {
    	JPanel panel = new JPanel();
    	Container contentPane = this.getContentPane();
		//���һЩ���
	    JLabel labelCheck = new JLabel("����ǩ");
	    JButton btnCheck = new JButton("��ⰴť");
	    JLabel labelConn = new JLabel("����Label");
	    JButton btnConn = new JButton("����Button");
	    panel.add(labelCheck);
	    panel.add(btnCheck);
	    panel.add(labelConn);
	    panel.add(btnConn);
	    //ͨ��JPanel��������
	    contentPane.add(panel);
    }
}

