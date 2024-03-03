package classpart;

// 객체가 아님 클래스
public class Student {

	
	// 멤버변수 = 필드
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public Student() {}
	
	
	
	// 메서드(이름이 동사) = 기능 
	public void showStudentInfor() {
		System.out.println(studentName + "," +address);
	}
	
	public String   getStudentName() {
		return studentName;
		
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String args[]) {
		
		int i = 10;
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
			
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		
		
		
	}
	
}