

public class StrokeConcreteFactory {
	//����ֱ�ߡ�
	public static HiStroke produceLine(int x,int y,int ex,int ey)
	{
		return new HhjLine(x,y,ex,ey);
	}
	//����Բ��
	public static HiStroke produceCircle(int x,int y,int r)
	{
		return new HhjCircle(x,y,r);
	}
	//����Բ��
	public static HiStroke produceRectangle(int x,int y,int ex,int ey)
	{
		return new HhjCircle(x,y,10);
	}
}

