package br.com.edtonlemos.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.edtonlemos.models.Student;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

	private List<Student> students;

	public StudentDataUtil() {
		loadSimpleData();
	}
	
	public void loadSimpleData() {
		students = new ArrayList<Student>();
		
		students.add(new Student("Joe", "Jonas", "joe@email.com"));
		students.add(new Student("Jake", "Gylahal", "jake@email.com"));
		students.add(new Student("Harry", "Styles", "harry@email.com"));
	}

	public List<Student> getStudents() {
		return students;
	}
	
}
