package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList s;
    @BeforeAll
    static void init(){
        s = new StudentList();
    }
    @Test
    void testAddNewStudent() {
        s.addNewStudent("6710450929", "Zajow");
        assertEquals(1 , s.getStudents().size());
        Student student = s.getStudents().get(0);
        assertEquals("6710450929", student.getId());
        assertEquals("Zajow", student.getName());
        s.addNewStudent("6710451259", "Nine", 90);
        assertEquals(2 , s.getStudents().size());
        student = s.getStudents().get(1);
        assertEquals("6710451259", student.getId());
        assertEquals("Nine", student.getName());
        assertEquals(90, student.getScore());
    }
    @Test
    void testFindStudentById() {
        s.addNewStudent("6710450929", "Zajow");
        s.addNewStudent("6710451259", "Nine", 90);
        Student student;
        student = s.findStudentById("6710451259");
        assertEquals("Nine", student.getName());
    }
    @Test
    void testFilterStudentByName() {
        s.addNewStudent("6710450929", "Zajow");
        s.addNewStudent("6710451259", "Nine", 90);
        s.addNewStudent("6710450939", "Zapow");
        s.addNewStudent("6710451249", "Nina", 80);
        StudentList studentlist = s.filterByName("Za");
        assertEquals(2, studentlist.getStudents().size());
        assertEquals("Zajow", studentlist.getStudents().get(0).getName());
        assertEquals("Zapow", studentlist.getStudents().get(1).getName());
    }
    @Test
    void testGiveScoreToId() {
        s.addNewStudent("6710450929", "Zajow");
        s.giveScoreToId("6710450929", 50);
        assertEquals("D",  s.getStudents().get(0).getGrade());
    }
    @Test
    void testViewGradeOfId(){
        s.addNewStudent("6710450929", "Zajow");
        s.addNewStudent("6710451249", "Nina", 80);
        s.giveScoreToId("6710450929", 80);
        assertEquals("A",   s.viewGradeOfId("6710450929"));
    }
}