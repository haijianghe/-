import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
	  

/**
 * �򵥵Ļ�ͼ����
 */
class SimpleDrawLine extends JFrame {
    private static final long serialVersionUID = 2L;
    private static final int width = 100;
    private static final int height = 200;
    
    private Color rectColor = new Color(0xf5f5f5);
    
    /**
     * SimpleDrawLine���췽��
     */
    public SimpleDrawLine() {
        Container p = getContentPane();
        setBounds(100, 100, 500, 500);
        setVisible(true);
        p.setBackground(rectColor);
        setLayout(null);   
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

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
}
