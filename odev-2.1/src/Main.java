
public class Main {

	public static void main(String[] args) {
		Course courseJava = new Course(1, "Enes MAKAS", "12345","Java kampý");
		Course courseCSharp = new Course(2, "Engin DEMÝROÐ", "98765","C# kampý");
		CourseManager courseManager = new CourseManager();

		Course[] courses = {courseCSharp,courseJava};
		
		for(Course course : courses) {
			System.out.println("Kurs :" + course.courseName);
			System.out.println( "Eðitmen :" + course.instructorName);
		}
		
		System.out.println("------------------------------");
		
		courseManager.AddCourse(courseCSharp);
		courseManager.DeleteCourse(courseJava);
	

	}

}
