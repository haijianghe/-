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
			System.out.println("*****************����Сϵͳ*****************");             
			System.out.println("a�����һ����");             
			System.out.println("b���ҳ��������е����ֵ��Сֵ");             
			System.out.println("c����������������");             
			System.out.println("x���˳�ϵͳ");  
			String operType=br.readLine();
			// �ÿ͹���            
			if(operType.equals("a"))   
			{
				System.out.println("���������֣�"); 
				BufferedReader bVT=new BufferedReader(new InputStreamReader(System.in));
				String str = bVT.readLine();
				int num = Integer.parseInt(str);
				vp.AddValue(num);
			}
			else if(operType.equals("b"))
			{
				int nMax = vp.GetMax();
				int nMin = vp.GetMin();
				System.out.println("���ֵ:"+nMax+"  ��Сֵ:"+nMin);
			}
			else if(operType.equals("c"))
			{
				String strInfo = vp.AfterSort();
				System.out.println(strInfo);
			}
			else
			{
				System.out.println("�ټ���");
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
//				System.out.println("*****************����Сϵͳ*****************");             
//				System.out.println("a�����һ����");             
//				System.out.println("b���ҳ��������е����ֵ��Сֵ");             
//				System.out.println("c����������������");             
//				System.out.println("x���˳�ϵͳ");  
//				String operType=br.readLine();
//				// �ÿ͹���            
//				if(operType.equals("a"))   
//				{
//					System.out.println("���������֣�"); 
//					BufferedReader bVT=new BufferedReader(new InputStreamReader(System.in));
//					int num = bVT.read();
//					vp.AddValue(num);
//				}
//				else if(operType.equals("b"))
//				{
//					int nMax = vp.GetMax();
//					int nMin = vp.GetMin();
//					System.out.println("���ֵ:"+nMax+"  ��Сֵ:"+nMin);
//				}
//				else if(operType.equals("c"))
//				{
//					String strInfo = vp.AfterSort();
//					System.out.println(strInfo);
//				}
//				else
//				{
//					System.out.println("�ټ���");
//					break;
//				}
//			}//end of while
//		}
//		catch(IOException e)
//		{
//			System.err.println(e.toString());
//		}
//	}	
