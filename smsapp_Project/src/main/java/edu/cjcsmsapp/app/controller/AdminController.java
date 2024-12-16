package edu.cjcsmsapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjcsmsapp.app.model.Student;
import edu.cjcsmsapp.app.servicei.StudentService;

@Controller
public class AdminController {
	
	@Autowired
	 StudentService ss;
	
@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}

@RequestMapping("/login")
   public String onlogin(@RequestParam String username ,@RequestParam String password,Model m )
   {
   if(username.equals("admin")&& password.equals("admin"))
   {
	   List<Student> students =ss.getAllStudents();
	   m.addAttribute("data",students);
	   return "adminscreen";
   }
   else {
	   m.addAttribute("login_fail","Enter valid login details");
	   return "login";
   }
}
@RequestMapping("/enroll_student")
    public  String saveStudent(@ModelAttribute Student student,Model m)
    {
    	ss.saveStudentDetails(student);
    	List<Student> students=ss.getAllStudents();
    	m.addAttribute("data",students);
    	return "adminscreen";
    }
@RequestMapping("/search")
   public String searchBatch(@RequestParam("batchNumber")String batchNumber,Model m)
   {
	List<Student> result=ss.searchBatch(batchNumber);
	if(result.size()>0)
	{
		m.addAttribute("data",result);
	}
	else {
//		List<Student> students=ss.getAllStudents();
//		m.addAttribute("data",students);
		m.addAttribute("message" , "No Record Available for the batch" +batchNumber);
	}
	return "adminscreen";
   }

@RequestMapping("/fees")
public String onfees(@RequestParam("id") int id,Model m)
{
	Student st=ss.getSingleStudent(id);
	  m.addAttribute("st",st);
	return"fees";
}

@RequestMapping("/payfees")
public String payFees(@RequestParam("studentid") int studentid, @RequestParam("amount") float amount ,Model m)
{
	List<Student> list=ss.updateStudentfees(studentid,amount);
	m.addAttribute("data",list);
	return "adminscreen";
}

@RequestMapping("/remove")
public String removeStudent(@RequestParam("id") int id,Model m) 
{
	ss.removeDelete(id);
	List<Student> list=ss.getAllStudents();
	m.addAttribute("data",list);
	return "adminscreen";
}
@RequestMapping("/batch")
 public  String onBatchChange(@RequestParam("id")int id,Model m)
 {
	 Student st=ss.getSingleStudent(id);
	 List<Student> list= ss.getAllStudents();
	 m.addAttribute("st",st);
	 m.addAttribute("data",list);
	 return"batch";
 }

@RequestMapping("/batchshift")
public String payFees(@RequestParam("studentid") int studentid, @RequestParam("batchNumber")String batchNumber ,Model m)
{
	List<Student> list=ss.updateStudentBatch(studentid,batchNumber);
	m.addAttribute("data",list);
	return "adminscreen";
}

}






