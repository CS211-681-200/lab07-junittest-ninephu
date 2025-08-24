package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    static void init(){
        s = new Student("67xxxxxxxx", "test");
    }
    @Test
    @DisplayName("Add score nisit 1 point")
    void testAddScore(){
        s.addScore(1.0);
        assertEquals(1.0 , s.getScore());
    }
    @Test
    void testChangeName(){
        s.changeName("Matty");
        assertEquals("Matty", s.getName());
    }
    @Test
    void testCalculateGrade(){
        s.addScore(75);
        assertEquals("B" , s.getGrade());
    }
    @Test
    void testIsId(){
        assertEquals(true, s.isId("67xxxxxxxx"));
    }
    @Test
    void testIsNameContains(){
        assertEquals(true , s.isNameContains("st"));
    }
}