class Largestof3_48 {
	public static void main(String args[]) {
		int a=2,b=5,c=3;
		System.out.println("First number:"+a);
		System.out.println("Second number:"+b);
		System.out.println("Third number:"+c);
		if(a>b) {
			if(a>c)
				System.out.println("Largest number is "+a);
			else
				System.out.println("Largest umber is "+c);
		}
		else {
			if(b>c)
				System.out.println("Largest number is "+b);
			else
				System.out.println("Largest number is "+c);
		}
	}
} 
