import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DebugMain {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ValueProcess vp = new ValueProcess();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try {
		while(true)         
		{             
			System.out.println("*****************数字小系统*****************");             
			System.out.println("a：添加一个数");             
			System.out.println("b：找出已有数列的最大值最小值");             
			System.out.println("c：对已有数列排序");             
			System.out.println("x：退出系统");  
			String operType=br.readLine();
			// 旅客管理            
			if(operType.equals("a"))   
			{
				System.out.println("请输入数字："); 
				BufferedReader bVT=new BufferedReader(new InputStreamReader(System.in));
				String str = bVT.readLine();
				int num = Integer.parseInt(str);
				vp.AddValue(num);
			}
			else if(operType.equals("b"))
			{
				int nMax = vp.GetMax();
				int nMin = vp.GetMin();
				System.out.println("最大值:"+nMax+"  最小值:"+nMin);
			}
			else if(operType.equals("c"))
			{
				String strInfo = vp.AfterSort();
				System.out.println(strInfo);
			}
			else
			{
				System.out.println("再见！");
				break;
			}
		}//end of while
	}
	catch(IOException e)
	{
		System.err.println(e.toString());
	}
	}
}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ValueProcess vp = new ValueProcess();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		try {
//			while(true)         
//			{             
//				System.out.println("*****************数字小系统*****************");             
//				System.out.println("a：添加一个数");             
//				System.out.println("b：找出已有数列的最大值最小值");             
//				System.out.println("c：对已有数列排序");             
//				System.out.println("x：退出系统");  
//				String operType=br.readLine();
//				// 旅客管理            
//				if(operType.equals("a"))   
//				{
//					System.out.println("请输入数字："); 
//					BufferedReader bVT=new BufferedReader(new InputStreamReader(System.in));
//					int num = bVT.read();
//					vp.AddValue(num);
//				}
//				else if(operType.equals("b"))
//				{
//					int nMax = vp.GetMax();
//					int nMin = vp.GetMin();
//					System.out.println("最大值:"+nMax+"  最小值:"+nMin);
//				}
//				else if(operType.equals("c"))
//				{
//					String strInfo = vp.AfterSort();
//					System.out.println(strInfo);
//				}
//				else
//				{
//					System.out.println("再见！");
//					break;
//				}
//			}//end of while
//		}
//		catch(IOException e)
//		{
//			System.err.println(e.toString());
//		}
//	}	
