package Tommy_Henehan.Software_Engineering;
import java.util.List;	
import org.joda.time.DateTime;

public class Course {
	private String name;
	private List<Student> students;
	private List<Module> modules;
	private DateTime start;
	private DateTime end;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}

	public Course(String name, List<Student> students, List<Module> modules, DateTime start, DateTime end) {
		super();
		this.name = name;
		this.students = students;
		this.modules = modules;
		this.start = start;
		this.end = end;
	}
}
