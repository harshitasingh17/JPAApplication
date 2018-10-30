import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Student;
import com.cg.dao.StudentDaoImpl;


public class TestJpaClientDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentDaoImpl stoDao=new StudentDaoImpl();
       Scanner sc= new Scanner(System.in);
      /* System.out.println("Enter roll No.:");
       int rn=sc.nextInt();
       */ //automatic generation of rollno.
       System.out.println("enter name:");
       String nm=sc.next();
       
       Student st= new Student();
       //st.setRollNo(rn);
       st.setStuName(nm);
       Student stu= stoDao.addStudent(st);
       System.out.println("Data inserted"+ stu);
       System.out.println("-----------Retrieve student based on rollno.--------");
       Student student=stoDao.getStuByRollNo(2);
       System.out.println(student);
       System.out.println("---------Retrieve All-------");
       List<Student> stList=stoDao.getAllStudents();
       Iterator<Student> it=stList.iterator();
       System.out.println("RollNO.\t\tName");
       System.out.println("----------------");
       while(it.hasNext()){
    	   Student tempStu=it.next();
    	   System.out.println(tempStu.getRollNo()+"\t\t"+tempStu.getStuName());
    	   
       }
       /*System.out.println("---------Delete-------");
	   System.out.println("Record 9 Deleted :"+ stoDao.deleteStudent(9));
	   */
	   System.out.println("---------Update Name-------");
	   Student st3=stoDao.updateStudentName(288,"Surbhi");
	   System.out.println("Updated"+st3);
	}

}
