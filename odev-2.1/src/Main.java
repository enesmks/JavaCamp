
public class Main {

	public static void main(String[] args) {
		Course courseJava = new Course(1, "Enes MAKAS", "12345","Java kamp�");
		Course courseCSharp = new Course(2, "Engin DEM�RO�", "98765","C# kamp�");
		CourseManager courseManager = new CourseManager();

		Course[] courses = {courseCSharp,courseJava};
		
		for(Course course : courses) {
			System.out.println("Kurs :" + course.courseName);
			System.out.println( "E�itmen :" + course.instructorName);
		}
		
		System.out.println("------------------------------");
		
		courseManager.AddCourse(courseCSharp);
		courseManager.DeleteCourse(courseJava);
	

	}

}
