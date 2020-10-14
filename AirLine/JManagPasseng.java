/*�����ÿͣ�
 * ������ ����һ���ÿͣ���ʾ�ÿ���Ϣ��
 * �ļ�����
 */
import java.util.*; 
import java.io.*; 

public class JManagPasseng {
	private ArrayList<JPassenger> m_listPassenger=null; //���������ÿ͡�
	public JManagPasseng()
	{
		m_listPassenger = new  ArrayList<JPassenger>();
		ReadFile();
	}
	//��������
	protected void finalize()
	 {

	 }
	//�˵�����,��Ҫ�����ÿ�ʱ����ֱ�ӵ��ô��ࡣ
	public void MenuOperate() 
	{// ����һ�����ײ˵�
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true)         
			{             
				System.out.println("@@@@@@@@@@@�ÿ͹���ҳ��@@@@@@@@@@@");             
				System.out.println("1�����һ���ÿ�");             
				System.out.println("2������һ���ÿ�");             
				System.out.println("3����ʾ�����ÿ�");             
				System.out.println("4��ɾ��һ���ÿ�");             
				System.out.println("5���˳��ÿ͹������");  
				String operType=br.readLine();
				// ���             
				if(operType.equals("1"))             
				{                 
					System.out.println("�������ÿ�������"); 
					String name=br.readLine();                 
					System.out.println("�������Ա�");                 
					char ch=br.readLine().charAt(0);
					System.out.println("�����빤����λ��");
					String workUnit=br.readLine();                 
					System.out.println("���������֤���룺");
					String strId=br.readLine();
					JPassenger psger = new JPassenger(name,ch,workUnit,strId);
					AddPasseng(psger);                 
					System.out.println("��ӳɹ���");             
				}                            
				// ����             
				else if(operType.equals("2"))             
				{                 
					System.out.println("�������ÿ�������");                 
					String name=br.readLine();  
					ShowInfo(name);             
				}                            
				else if(operType.equals("3"))             
				{                 
					int number = m_listPassenger.size();
					System.out.println("�ܹ���"+number+"���ÿͣ�");
					for( int i=0;i<number;i++ )
					{
						JPassenger pasg=(JPassenger)m_listPassenger.get(i);
						System.out.println((i+1)+":  "+pasg.GetInfo());
					}
				}                            
				// ɾ��             
				else if(operType.equals("4"))             
				{                 
					System.out.println("�������ÿ�������");                 
					String name=br.readLine();          
					DelPasseng(name);                 
					System.out.println("ɾ���ɹ���");    
					}            
				else if(operType.equals("5"))            
				{      
					//�˳��ÿ͹���ҳ��
					WriteFile();//��֤��������Ϣ��
					return;                    
				}            
				else            
				{                 
					System.out.println("������������");             
				}         
			}//end of while
		}
		catch(IOException e)
		{
			System.err.println(e.toString());
		}
	}
	//�����ÿ�     
	private void AddPasseng(JPassenger psger) 
	{         
		m_listPassenger.add(psger);     
	}     
	// �����ÿ���������ʾ�ÿ���Ϣ    
	private void ShowInfo(String name)     
	{         
		// ��������ArrayList         
		for(int i=0;i<m_listPassenger.size();i++)         
		{             
			// ȡ��JPassenger����             
			JPassenger pasg=(JPassenger)m_listPassenger.get(i);                            
			// �Ƚ�����             
			if(pasg.GetName().equals(name))             
			{                 
				System.out.println("�ҵ����ÿͣ���Ϣ�ǣ�"); 
				System.out.println(pasg.GetInfo());             
			}         
		}      
	}
	//���Խ��ÿʹ�ϵͳ��ɾ��     
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
	//���ļ�passenger.txt�ж����ÿ���Ϣ
	private void ReadFile()
	{
		m_listPassenger.clear();//����ɵ�
		try{
			DataInputStream fm = new DataInputStream(new BufferedInputStream(
					new FileInputStream("passenger.txt")));
			//�ÿ͸���
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
			System.err.println("�ļ�passenger.txt������"+e.toString());
		}
	}
	//���ļ�passenger.txtд���ÿ���Ϣ
	private void WriteFile()
	{
		try{
			DataOutputStream fm = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("passenger.txt")));
			//�ÿ͸���
			int number = m_listPassenger.size();
			fm.writeInt(number);
			for( int i=0;i<number;i++ )
			{
				// ȡ��JPassenger����             
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
			System.err.println("�ļ�passenger.txtд����"+e.toString());
		}
	}
}
