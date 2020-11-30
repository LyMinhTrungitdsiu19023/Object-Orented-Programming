package OOPLab7;

public class MyPair<T, U> { 
	
	public final T First; 
	public final U Second; 
	
	public MyPair(T first, U second) 
	{ 
		this.First = first; 
		this.Second = second; 
	} 
	public String toString() 
	{ 
		return "(" + First + ", " + Second + ")"; 
	} 
	
	//Question H
	public MyPair Swap() 
	{
		return new MyPair<>(Second, First);
	}
	
	public static void main(String[] args) {
		//Question B
		MyPair<String, Integer> people1 = new MyPair<>("Anders", 13);  
		
		//Question C
		MyPair<String, Double>  people2 = new MyPair<>("Phoenix", 39.7); 
		
		/*Question D : I cannot assign a value of type  
		               MyPair<String, Double> to a variable 
		               of type MyPair<String, Integer>*/ 
		
		//Question E
		MyPair<String, Integer>[] grades = new MyPair[5]; 
		grades[0] = new MyPair<String, Integer>("Ly", 26);
		grades[1] = new MyPair<String, Integer>("Minh", 05);
		grades[2] = new MyPair<String, Integer>("Trung", 2001);
		
		//Question F
		for(MyPair<String, Integer> hihi : grades) 
		{
			System.out.print("  " + hihi);
		}
		
		//Question G
		MyPair<MyPair<Integer, Integer>, String> appointment = new MyPair<>(new MyPair<>(26, 05).Swap(), "LyMinhTrung");
		System.out.print("\n\n  " + appointment);
		System.out.println("   "  + appointment.First.Second);
		
		//Question H 
		System.out.print("\n  Swapped: " + appointment.Swap());
		}

}
