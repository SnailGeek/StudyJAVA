public class  PolyConstructors
{
	public static void main(String[] args) 
	{
		new RoundGlyph(5);
	}
}

class Glyph
{
	void draw()
	{
		System.out.println("Glyph.draw()");
	}
	Glyph()
	{
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph
{
	private int radius = 1;
	RoundGlyph(int r)
	{
		radius = r;
		System.out.println("RoudGlyph.RoudGlyph().radius = " + radius);
	}
	void draw()
	{
		System.out.println("RoudGlyph.draw(), radius = " + radius);
	}
}
