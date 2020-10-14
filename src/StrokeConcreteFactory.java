

public class StrokeConcreteFactory {
	//生成直线。
	public static HiStroke produceLine(int x,int y,int ex,int ey)
	{
		return new HhjLine(x,y,ex,ey);
	}
	//生成圆。
	public static HiStroke produceCircle(int x,int y,int r)
	{
		return new HhjCircle(x,y,r);
	}
	//生成圆。
	public static HiStroke produceRectangle(int x,int y,int ex,int ey)
	{
		return new HhjCircle(x,y,10);
	}
}

