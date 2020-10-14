import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
	  

/**
 * 简单的绘图程序。
 */
class SimpleDrawLine extends JFrame {
    private static final long serialVersionUID = 2L;
    private static final int width = 100;
    private static final int height = 200;
    
    private Color rectColor = new Color(0xf5f5f5);
    
    /**
     * SimpleDrawLine构造方法
     */
    public SimpleDrawLine() {
        Container p = getContentPane();
        setBounds(100, 100, 500, 500);
        setVisible(true);
        p.setBackground(rectColor);
        setLayout(null);   
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

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
}
