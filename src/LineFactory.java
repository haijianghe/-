
//直线工厂
public class LineFactory implements StrokeFactory
{
	public HiStroke produceStroke()
	{
		return new HhjLine();
	}
}