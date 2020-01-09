package Tommy_Henehan.Software_Engineering;
import java.util.List;

public class Module {
	private String name;
	private String ID;
	private List<Student> students;
	private List<Course> courses;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Module(String name, String ID, List<Student> students, List<Course> courses) {
		super();
		this.name = name;
		this.ID = ID;
		this.students = students;
		this.courses = courses;
	}
}
