/*旅客*/

public class JPassenger {
	private String m_strName; //旅客姓名
	private char m_cSex; //性别，男='M',女='F'
	private String m_strWorkspace;//工作单位
	private String m_strIdentification;//身份证号码
	public JPassenger(){}
	public JPassenger(String name,char sex,String work,String iden)
	{
		m_strName = name;
		m_cSex = sex;
		m_strWorkspace = work;
		m_strIdentification = iden;
	}
	//获取旅客姓名
	public String GetName()
	{
		return m_strName;
	}
	//获取性别
	public char GetSex()
	{
		return m_cSex;
	}
	//获取工作单位
	public String GetWorkspace()
	{
		return m_strWorkspace;
	}
	//获取身份证号码
	public String GetIdentification()
	{
		return m_strIdentification;
	}
	//获取旅客的显示信息
	public String GetInfo()
	{
		return "姓名:"+m_strName+"  性别:"+(m_cSex=='M'?"男":"女")+
				"  工作单位"+m_strWorkspace+"  身份证号码"+m_strIdentification;
	}
}
