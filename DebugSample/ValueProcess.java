  public class ValueProcess {
 
	private int nValue[];
	private int nTotal;//个数
	public ValueProcess()
	{
		nValue  = null ;
		nValue = new int[100];
		nTotal = 0;
	}

	public void AddValue(int v)
	{
		int nIndex = nTotal;
		nValue[nIndex] = v;
		nTotal ++;
	}
	public int GetMax()
	{
		int max = nValue[0];
		for( int i=1;i<nTotal;i++ )
			if( max<nValue[i] )
				max = nValue[i];
		return max;
	}
	public int GetMin()
	{
		int min = nValue[0];
		for( int i=1;i<nTotal;i++ )
			if( min>nValue[i] )
				min = nValue[i];
		return min;
	}
	//从小到大
	public String AfterSort()
	{
		for( int i=0;i<nTotal;i++ )
		{
			int first = nValue[i];
			for( int j=i+1;j<nTotal; j++ )
				if( first>nValue[j])
				{
					first = nValue[j];
					nValue[j] = first;
				}
		}
		StringBuffer buffer = new StringBuffer();
		for( int i=0;i<nTotal;i++ )
		{
			buffer.append(nValue[i]);
			buffer.append(",");
		}
		return buffer.toString();
	}
}
/***************** 待调试代码
  public class ValueProcess {
 
	private int nValue[];
	private int nTotal;//个数
	public ValueProcess()
	{
		nValue  = null ;
		nTotal = 0;
	}
	public void AddValue(int v)
	{
		int nIndex = nTotal-1;
		nValue[nIndex] = v;
		nTotal ++;
	}
	public int GetMax()
	{
		int max = nValue[0];
		for( int i=1;i<nTotal;i++ )
			if( max<nValue[i] )
				max = nValue[i];
		return max;
	}
	public int GetMin()
	{
		int min = nValue[0];
		for( int i=1;i<nTotal;i++ )
			if( min>nValue[i] )
				min = nValue[i];
		return min;
	}
	//从小到大
	public String AfterSort()
	{
		for( int i=0;i<nTotal;i++ )
		{
			int first = nValue[i];
			for( int j=i+1;j<nTotal; j++ )
				if( first>nValue[j])
				{
					first = nValue[j];
					nValue[j] = first;
				}
		}
		StringBuffer buffer = new StringBuffer();
		for( int i=0;i<nTotal;i++ )
		{
			buffer.append(nValue[i]);
			buffer.append(",");
		}
		return buffer.toString();
	}
}
************/