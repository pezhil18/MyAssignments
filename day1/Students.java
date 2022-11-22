package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student id: " +id);

	}
	
	public void getStudentInfo(int id, String name) {

		System.out.println("Student id and name: " +id +name);

	}

	public void getStudentInfo(String email, long phoneNumber) {

		System.out.println("Student email and phoneNumber: " +email +phoneNumber);

	}
	
	public static void main(String[] args) {
		
		Students Studen = new Students();
		Studen.getStudentInfo(202104);
		Studen.getStudentInfo(12345, "Ezhil");
		Studen.getStudentInfo("pezhil.18@gmail.com", 8939198732L);
		
		
	}
	
}
