import javax.swing.JFrame;

public class PaintMain {

	public static void main(String[] args) {
		//TestSimpleDrawLine();
		TestSimpleDrawCircle();
		//TestCompoundJFrame();
		//TestCompoundJPanel();
		//TestDrawPanelSample();
	}
	//����TestSimpleDrawLine
	private static void TestSimpleDrawLine()
	{
		SimpleDrawLine sdl = new SimpleDrawLine();
		//Ҫ�ȴ�һ��ʱ�䣬����Ĵ�����������á�
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdl.drawComponents(50,50);
	}
	
	//����TestSimpleDrawCircle
	private static void TestSimpleDrawCircle()
	{
		JFrame frame = new JFrame();
		SimpleDrawCircle panel = new SimpleDrawCircle();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);;
		frame.setVisible(true);
	}
	
	//����CompoundJFrame
	private static void TestCompoundJFrame()
	{
		CompoundJFrame cjf = new CompoundJFrame();
		cjf.showInfo("start");
		//���һЩ���
        //cjf.addComponents();
		//cjf.addJPanelComponents();
	}
	
	//����CompoundJPanel
	private static void TestCompoundJPanel()
	{
		JFrame frame = new JFrame();
		CompoundJPanel panel = new CompoundJPanel();
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);;
		frame.setVisible(true);
	}
	
	//����DrawPanelSample
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
