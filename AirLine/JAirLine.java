import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���չ�˾��ƱԤ��ϵͳ
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
				System.out.println("*****************��ƱԤ��ϵͳ*****************");             
				System.out.println("a���ÿ͹���");             
				System.out.println("b���������");             
				System.out.println("c����ƱԤ��");             
				System.out.println("d����ӡ��Ʊ");             
				System.out.println("x���˳�ϵͳ");  
				String operType=br.readLine();
				// �ÿ͹���            
				if(operType.equals("a"))             
					one.MenuOperate();
				else if(operType.equals("b"))
				{
					System.out.println("������� δ���");    
				}
				else if(operType.equals("c"))
				{
					System.out.println("��ƱԤ�� δ���");
				}
				else if(operType.equals("d"))
				{
					System.out.println("��ӡ��Ʊ δ���");
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
