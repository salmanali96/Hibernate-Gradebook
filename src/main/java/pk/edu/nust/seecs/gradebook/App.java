package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {

    public static void main(String[] args) {
        CloDao clodao = new CloDao();

        // Add new clo
        Clo clo = new Clo();
        clo.setName("CLO 1");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("2");
        clodao.addClo(clo);

        clodao.updateClo(clo);

        // Delete an existing clo
        //dao.deleteClo(1);

        // Get all clos
        for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clodao.getCloById(1));
       

        
        
        StudentDao studentdao = new StudentDao();
        Student student = new Student();
        
        student.setName("Salman Ali");
        
        studentdao.addStudent(student);
        studentdao.updateStudent(student);
       
        

        
        
        TeacherDao teacherdao = new TeacherDao();
        Teacher teacher = new Teacher();
        
        
       //course.setClasstitle("Advance Programming");
       //course.setCreditHours(4);
       //course.setTeacher(teacher);
        
       // coursedao.addCourse(course);
        //coursedao.updateCourse(course);
        
        
        //
        //set.add(course);
        teacher.setName("Fahad Satti");
        //teacher.setCourses(set);
        
        teacherdao.addTeacher(teacher);
        teacherdao.updateTeacher(teacher);
        
        
        CourseDao coursedao = new CourseDao();
        Course course = new Course();
        
        
        
        course.setClasstitle("Advance Programming");
        course.setCreditHours(4);
        course.setTeacher(teacher);
        
        coursedao.addCourse(course);
        coursedao.updateCourse(course);        
        
        Set<Course> cou = new HashSet<>();
        cou.add(course);
        teacher.setCourses(cou);
        
        teacherdao.updateTeacher(teacher);
        
        
        Content content =new Content();
        ContentDao contentdao = new ContentDao();
        
        content.setTitle("Hibernate");
        content.setDescription("To enhance Programming skills");
        content.setClo(clo);
        
        Set<Student> stu = new HashSet<>();
        stu.add(student);
        
        content.setStudents(stu);
        Date date = new Date();
        content.setEndtime(date);
        content.setStarttime(date);
        
        
        student.setCourses(cou);
  
        studentdao.updateStudent(student);
        
        
        

        

        
        
        
       // GradeDao gradedao = new GradeDao();
       // Grade grade = new Grade();
        
        //grade.setName("Salman Ali");
       // grade.setContentItem(content);
      //  grade.setScore(3);
        
       // Set<Grade> gra = new HashSet<>();
      //  gra.add(grade);
        
        //content.setGrade(gra);
      //  contentdao.addContent(content);
      //  contentdao.updateContent(content);
        
        
       //gradedao.addGrade(grade);
       //gradedao.updateGrade(grade);
        
        
        System.out.println("Information:");
        System.out.println("Name:" + student.getName());
        System.out.println("Teacher" + teacher.getName() + "Course:" + teacher.getTeacherId());
       // System.out.println("Course:" + course.getTeacher());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}