/*�ÿ�*/

public class JPassenger {
	private String m_strName; //�ÿ�����
	private char m_cSex; //�Ա���='M',Ů='F'
	private String m_strWorkspace;//������λ
	private String m_strIdentification;//���֤����
	public JPassenger(){}
	public JPassenger(String name,char sex,String work,String iden)
	{
		m_strName = name;
		m_cSex = sex;
		m_strWorkspace = work;
		m_strIdentification = iden;
	}
	//��ȡ�ÿ�����
	public String GetName()
	{
		return m_strName;
	}
	//��ȡ�Ա�
	public char GetSex()
	{
		return m_cSex;
	}
	//��ȡ������λ
	public String GetWorkspace()
	{
		return m_strWorkspace;
	}
	//��ȡ���֤����
	public String GetIdentification()
	{
		return m_strIdentification;
	}
	//��ȡ�ÿ͵���ʾ��Ϣ
	public String GetInfo()
	{
		return "����:"+m_strName+"  �Ա�:"+(m_cSex=='M'?"��":"Ů")+
				"  ������λ"+m_strWorkspace+"  ���֤����"+m_strIdentification;
	}
}
