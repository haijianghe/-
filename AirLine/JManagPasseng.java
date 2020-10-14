/*管理旅客，
 * 包括： 增加一个旅客，显示旅客信息。
 * 文件操作
 */
import java.util.*; 
import java.io.*; 

public class JManagPasseng {
	private ArrayList<JPassenger> m_listPassenger=null; //保存所有旅客。
	public JManagPasseng()
	{
		m_listPassenger = new  ArrayList<JPassenger>();
		ReadFile();
	}
	//析构函数
	protected void finalize()
	 {

	 }
	//菜单操作,当要管理旅客时，可直接调用此类。
	public void MenuOperate() 
	{// 做出一个简易菜单
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true)         
			{             
				System.out.println("@@@@@@@@@@@旅客管理页面@@@@@@@@@@@");             
				System.out.println("1：添加一个旅客");             
				System.out.println("2：查找一个旅客");             
				System.out.println("3：显示所有旅客");             
				System.out.println("4：删除一个旅客");             
				System.out.println("5：退出旅客管理操作");  
				String operType=br.readLine();
				// 添加             
				if(operType.equals("1"))             
				{                 
					System.out.println("请输入旅客姓名："); 
					String name=br.readLine();                 
					System.out.println("请输入性别：");                 
					char ch=br.readLine().charAt(0);
					System.out.println("请输入工作单位：");
					String workUnit=br.readLine();                 
					System.out.println("请输入身份证号码：");
					String strId=br.readLine();
					JPassenger psger = new JPassenger(name,ch,workUnit,strId);
					AddPasseng(psger);                 
					System.out.println("添加成功！");             
				}                            
				// 查找             
				else if(operType.equals("2"))             
				{                 
					System.out.println("请输入旅客姓名：");                 
					String name=br.readLine();  
					ShowInfo(name);             
				}                            
				else if(operType.equals("3"))             
				{                 
					int number = m_listPassenger.size();
					System.out.println("总共有"+number+"个旅客：");
					for( int i=0;i<number;i++ )
					{
						JPassenger pasg=(JPassenger)m_listPassenger.get(i);
						System.out.println((i+1)+":  "+pasg.GetInfo());
					}
				}                            
				// 删除             
				else if(operType.equals("4"))             
				{                 
					System.out.println("请输入旅客姓名：");                 
					String name=br.readLine();          
					DelPasseng(name);                 
					System.out.println("删除成功！");    
					}            
				else if(operType.equals("5"))            
				{      
					//退出旅客管理页面
					WriteFile();//保证保存了信息。
					return;                    
				}            
				else            
				{                 
					System.out.println("输入数据有误！");             
				}         
			}//end of while
		}
		catch(IOException e)
		{
			System.err.println(e.toString());
		}
	}
	//加入旅客     
	private void AddPasseng(JPassenger psger) 
	{         
		m_listPassenger.add(psger);     
	}     
	// 根据旅客姓名，显示旅客信息    
	private void ShowInfo(String name)     
	{         
		// 遍历整个ArrayList         
		for(int i=0;i<m_listPassenger.size();i++)         
		{             
			// 取出JPassenger对象             
			JPassenger pasg=(JPassenger)m_listPassenger.get(i);                            
			// 比较姓名             
			if(pasg.GetName().equals(name))             
			{                 
				System.out.println("找到该旅客，信息是："); 
				System.out.println(pasg.GetInfo());             
			}         
		}      
	}
	//可以将旅客从系统中删除     
	private void DelPasseng(String name)     
	{         
		for(int i=0;i<m_listPassenger.size();i++)         
		{             
			JPassenger pasg=(JPassenger)m_listPassenger.get(i);             
			if(pasg.GetName().equals(name))             
			{                 
				m_listPassenger.remove(i);             
			}         
		}     
	} 
	//从文件passenger.txt中读入旅客信息
	private void ReadFile()
	{
		m_listPassenger.clear();//清除旧的
		try{
			DataInputStream fm = new DataInputStream(new BufferedInputStream(
					new FileInputStream("passenger.txt")));
			//旅客个数
			int number = fm.readInt();
			for( int i=0;i<number;i++ )
			{
				String name = fm.readUTF();
				char ch = fm.readChar();
				String unit = fm.readUTF();
				String id = fm.readUTF();
				JPassenger pasg = new JPassenger(name,ch,unit,id);
				AddPasseng(pasg);
			}
			fm.close();
		}
		catch(IOException e)
		{
			System.err.println("文件passenger.txt读错误。"+e.toString());
		}
	}
	//向文件passenger.txt写入旅客信息
	private void WriteFile()
	{
		try{
			DataOutputStream fm = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("passenger.txt")));
			//旅客个数
			int number = m_listPassenger.size();
			fm.writeInt(number);
			for( int i=0;i<number;i++ )
			{
				// 取出JPassenger对象             
				JPassenger pasg=(JPassenger)m_listPassenger.get(i);
				fm.writeUTF(pasg.GetName());
				fm.writeChar(pasg.GetSex());
				fm.writeUTF(pasg.GetWorkspace());
				fm.writeUTF(pasg.GetIdentification());
			}
			fm.close();
		}
		catch(IOException e)
		{
			System.err.println("文件passenger.txt写错误。"+e.toString());
		}
	}
}
