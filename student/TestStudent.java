package student;

public class TestStudent {

	public static void main(String[] args) {
		SingletonDesignPattern s=SingletonDesignPattern.getStudentLazyInstance();
		s.setStudentId(2025402004);
		s.setStudentBatch("54th");
		s.setStudentGPA("3.40");
		s.setStudentName("Latiful Bari Pappu");
		System.out.println("Student Name : "+s.getStudentName()
							+"\nBatch : "+s.getStudentBatch()
							+"\nId : "+s.getStudentId()
							+"\nCGPA : "+s.getStudentGPA());

	}

}
