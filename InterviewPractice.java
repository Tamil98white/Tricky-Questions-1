class InterviewPractice
{
	public static void main(String[] args) 
	{
		
		InterviewPractice m = new InterviewPractice();
		m.rec();
		m.mul();
		m.ascci();
		m.dt();
		m.id();
		m.cube();
	}
	void rec(){
		int w = 3;
		int h = 2;
		int r = w*h;
		System.out.println("Area of Rectangle : "+r);
		System.out.println(" ");
	}

	void mul(){
	 double f = 8.2;
	 double s = 6.2;
	 double ans = f * s;
	 System.out.println("Mulitiplication value is : "+ans);
	 System.out.println(" ");
	
	}
	void ascci(){
		
        char c = 'A';
        int ascii = c;
		System.out.println("Input is : "+c);
        System.out.println("The ASCII value is: " + ascii);
		System.out.println(" ");
	}
	void dt(){
		double in = 3.6987;
        int value = (int) in;
		System.out.println("Covet int value to double value ");
		System.out.println("Double value is : "+in);
        System.out.println("Int value is : "+value);
		System.out.println(" ");
	}
	void id(){
		int a = 5;
		double b = 6.2;
		double c = a + b;
		System.out.println("Addition of integer and double value is : " +c);
		System.out.println(" ");
	}
	void squareofdouble(){
		double a = 3.9;
		double square  = a * a;
		System.out.println("square of double value is : " +square);
		System.out.println(" ");
	}
	void cube(){
		double cube = 3.2;
		System.out.println("Cube of the Number is : "+(cube*cube*cube));
		System.out.println(" ");
	}
	 


}
