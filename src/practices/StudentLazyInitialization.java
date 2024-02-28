package practices;

public class StudentLazyInitialization {
	
	private static StudentLazyInitialization lazyInitialization;
	
	private StudentLazyInitialization() {
		
		
	}
	int a=5;
	public static StudentLazyInitialization getStudentLazyInstance() {
		if(lazyInitialization==null) {
			lazyInitialization=new StudentLazyInitialization();
			
		}
		return lazyInitialization;
	}
	

}
