/** Design a class of your choice from(1-6) individual program
1. Student
2. Geometrical Shape
 *Point, Line, Plane
 *Triangle, Quadrilaterals/Quadrangle (Square, Rhombus, Rectangle, Parallelogram, Trapezoid), Polygon
 *Circle, Ellipse, Hyperbola, Parabola
 *Cone, Sphere, Cylinder
3. Bank Account
4. Book
5. Product
6. Course
*You must define different Constructors.*
*You must define at least four (4) other Methods.*
*You must use different Access Modifiers (public, private).*
*You must declare some Objects and Call different Methods for that Objects.	*/

package practices;
public class MainClass {
	
	public MainClass(String name) {
		String studentName=name;
		System.out.println("Student Name : "+studentName);
	}
	public MainClass(int id,String section) {
		int studentId=id;
		String sec=section;
		System.out.println("Id : "+studentId+"\nSection : "+sec);
	}
	private void contact() {
		System.out.println("Contact : 017xxxxxxxx");
	}
	public void department() {
		System.out.println("Department of CSE");
	}
	private void batch() {
		System.out.println("Batch : 54th");
	}
	private void grade() {
		float cgpa=4.0f;
		System.out.println("CGPA : "+cgpa);
	}
	
	
	public static void main(String[] args) {
		MainClass s1=new MainClass("Latiful Bari");
		MainClass s2=new MainClass(2025402004,"A");
		s2.contact();
		s2.department();
		s2.batch();
		s2.grade();

		
	}

}
