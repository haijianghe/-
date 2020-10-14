import javax.swing.JFrame;

public class PaintMain {

	public static void main(String[] args) {
		//TestSimpleDrawLine();
		TestSimpleDrawCircle();
		//TestCompoundJFrame();
		//TestCompoundJPanel();
		//TestDrawPanelSample();
	}
	//测试TestSimpleDrawLine
	private static void TestSimpleDrawLine()
	{
		SimpleDrawLine sdl = new SimpleDrawLine();
		//要等待一点时间，下面的代码才能起作用。
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdl.drawComponents(50,50);
	}
	
	//测试TestSimpleDrawCircle
	private static void TestSimpleDrawCircle()
	{
		JFrame frame = new JFrame();
		SimpleDrawCircle panel = new SimpleDrawCircle();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);;
		frame.setVisible(true);
	}
	
	//测试CompoundJFrame
	private static void TestCompoundJFrame()
	{
		CompoundJFrame cjf = new CompoundJFrame();
		cjf.showInfo("start");
		//添加一些组件
        //cjf.addComponents();
		//cjf.addJPanelComponents();
	}
	
	//测试CompoundJPanel
	private static void TestCompoundJPanel()
	{
		JFrame frame = new JFrame();
		CompoundJPanel panel = new CompoundJPanel();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);;
		frame.setVisible(true);
	}
	
	//测试DrawPanelSample
	private static void TestDrawPanelSample()
	{
		JFrame frame = new JFrame();
		DrawPanelSample panel = new DrawPanelSample();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);;
		frame.setVisible(true);
	}
	
}
