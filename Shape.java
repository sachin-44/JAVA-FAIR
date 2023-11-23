abstract class Shape{
	abstract void noOfSides();
	
}

class Triangle extends Shape{
	void noOfSides()
	{
		System.out.println("Triangle has 3 sides");
	}
}	
class Rectangle extends Shape{
	void noOfSides()
	{
		System.out.println("Rectangle has 4 sides");
	}
}



class Hexagon extends Shape{
	void noOfSides()
	{
		System.out.println("Hexagon has 6 sides");
	}
}


class Shape_48{
	public static void main(String args[]){
		
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Hexagon h=new Hexagon();
		t.noOfSides();
		r.noOfSides();
		h.noOfSides();
	}
}
			
