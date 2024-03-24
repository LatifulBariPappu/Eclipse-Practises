package student;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern lazyInitialization;
	
	private SingletonDesignPattern() {
				
	}
	int studentId;
	String studentName;
	String studentBatch;
	String studentGPA;
	public String getStudentGPA() {
		return studentGPA;
	}
	public void setStudentGPA(String studentGPA) {
		this.studentGPA = studentGPA;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentBatch() {
		return studentBatch;
	}
	public void setStudentBatch(String studentBatch) {
		this.studentBatch = studentBatch;
	}
	
	public void setStudentId(int s_id) {
		studentId=s_id;
	}
	public int getStudentId() {
		return studentId;
	}
	//-----Double Checked Locking-----
	public static SingletonDesignPattern getStudentLazyInstance() {
		if(lazyInitialization==null) {
			synchronized (SingletonDesignPattern.class) {
				if(lazyInitialization==null) {
					lazyInitialization=new SingletonDesignPattern();
				}
			}
			
		}
		return lazyInitialization;
	}
	

}
