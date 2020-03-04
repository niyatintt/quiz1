import java.util.Scanner;

public class RoomArea {
	
	public static void main(String[] args) {
	    // user input 
		Scanner sc = new Scanner(System.in); 
		System.out.println("please enter lenghth in feet");
		Double length = sc.nextDouble(); 
		
		
		System.out.println("plase enter width in feet ");
		Double width = sc.nextDouble();
    
        
        
        
		//area of room in feet
		Double areaInFeet = (length*width);
		
		System.out.println("The area of room in feet is: " + areaInFeet);
		//area of room in meter
		Double areaInSquaremeter=(areaInFeet) * 0.09290304;
		
		System.out.println("the area of romm in square meters is: "+ areaInSquaremeter);
		
	}

}
