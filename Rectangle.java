
public class Rectangle {
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public Rectangle(int length,int width)// פעולה בונה
	{
		
		this.length=length;
		this.width=width;
				
	}
	public void draw()
	{
		for(int i=0; i<width; i++)
			
		{
			for(int j=0; j<length; j++)
			{
				System.out.print("*");
		    }
			System.out.println();

	    }
	}
		
		public int calcArea()
		{
			int Area= length*width;
			return Area; 
		}
		
		public int calcPerimeter()
		{
			int Perimeter= length*2+width*2;
			return Perimeter;
		}
		
		public void scale(int factor)
		{
			length= length*factor;
			width= width*factor;
		}
		public String ToString()
		{
			 String answer= "length: " + length + " width: " + width;
			 return answer;
		}

		
	}
	
	

