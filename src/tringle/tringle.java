package tringle;

public class tringle {
float base,height;

public float getBase() {
	return base;
}

	public void setBase(float base) {
	this.base = base;
}

	public float getHeight() {
	return height;
}

	public void setHeight(float height) {
	this.height = height;
}
	public float area()
	{
		return 0.5f*height*base;
	}
	public float perimeter()
	{
		return (2.0f*base)+height;
	}
}
