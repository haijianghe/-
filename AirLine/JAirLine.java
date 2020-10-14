import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 航空公司机票预定系统
 */

/**
 * @author Administrator
 *
 */
public class JAirLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JManagPasseng one = new JManagPasseng();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true)         
			{             
				System.out.println("*****************机票预定系统*****************");             
				System.out.println("a：旅客管理");             
				System.out.println("b：航班管理");             
				System.out.println("c：机票预定");             
				System.out.println("d：打印机票");             
				System.out.println("x：退出系统");  
				String operType=br.readLine();
				// 旅客管理            
				if(operType.equals("a"))             
					one.MenuOperate();
				else if(operType.equals("b"))
				{
					System.out.println("航班管理 未完成");    
				}
				else if(operType.equals("c"))
				{
					System.out.println("机票预定 未完成");
				}
				else if(operType.equals("d"))
				{
					System.out.println("打印机票 未完成");
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
