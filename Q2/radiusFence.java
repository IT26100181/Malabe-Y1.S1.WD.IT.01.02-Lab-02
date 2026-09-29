public class radiusFence{
	public static void main(String[] args){
		
		//Given side length of the square fence
		double sideLength = 10.0;
		
		// Calculate the perimeter of the square fence
		double perimeterSquare = 4 * sideLength; // 4 * length
		
		// Calculate the radius of the circular fence using the same perimeter
		// 4 * length = 2 * PI * radius
		//radius = (4 * length / 2 * PI)
		double radius = perimeterSquare / (2 * 3.14);
		System.out.println("Radius of the circular fence : " + radius);
	}
}