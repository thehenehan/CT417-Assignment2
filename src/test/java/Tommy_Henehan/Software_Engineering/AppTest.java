package Tommy_Henehan.Software_Engineering;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

	@Test
	public void studentNameTest() {
		Student student = new Student(null, null, null, null, null, null);
		student.setName("Tommy");
		student.setAge(22);
		String test  = "Tommy"+":"+"22";
		assertEquals(student.getUsername(),test);
	}
	
	@Test
	public void moduleNameTest() {
		Module module = new Module(null, null, null, null);
		module.setModuleName("Databases");
		String test = "Databases";
		assertEquals(module.getModuleName(),test);
		
		
	}
	
	@Test
	public void courseTestName() {
		Course course = new Course(null, null, null, null);
		course.setCourseName("Business Information Systems");
		String test = "Business Information Systems";
		assertEquals(course.getCourseName(),test);
		
	}
}
