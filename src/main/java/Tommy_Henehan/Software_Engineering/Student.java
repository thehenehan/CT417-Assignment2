package Tommy_Henehan.Software_Engineering;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String username;
	private String DOB;
	private String ID;
	private Course courses;
	private List<Module> modules;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Student (String name, int age, String DOB, String id, Course courses, List<Module> modules) {
		super ();
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = id;
		this.courses = courses;
		this.modules = modules;
	}
	
	public String getUsername () {
		username = name + String.valueOf(age);
		return username;
	}
}
