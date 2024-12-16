package edu.cjcsmsapp.app.repositoryI;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjcsmsapp.app.model.Student;
@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{

	public List<Student> findAllByBatchNumber(String batchNumber);
	
//	public List<String> findALLByBatchNumber();
}

