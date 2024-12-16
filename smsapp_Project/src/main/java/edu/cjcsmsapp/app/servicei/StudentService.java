package edu.cjcsmsapp.app.servicei;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.cjcsmsapp.app.model.Student;

@Repository
public interface StudentService {

	public void saveStudentDetails(Student s);

	public List<Student> getAllStudents();
	
	public List<Student> searchBatch(String batchNumber);

	public Student getSingleStudent(int id);
	
	public List<Student> updateStudentfees(int studentid, float amount);

	public void removeDelete(int id);
	
	
	public List<Student> updateStudentBatch(int studentid, String batchNumber);
}



