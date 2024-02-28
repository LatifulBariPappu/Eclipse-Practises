package practices;

public class TestStudent {

	public static void main(String[] args) {
		StudentLazyInitialization s=StudentLazyInitialization.getStudentLazyInstance();
		System.out.println(s.a);

	}

}
