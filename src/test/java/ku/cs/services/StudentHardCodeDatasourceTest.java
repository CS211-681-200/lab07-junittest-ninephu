package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    @Test
    void testReadData() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList list = datasource.readData();
        assertEquals(4, list.getStudents().size());
        assertEquals("First", list.findStudentById("6710400001").getName());
        assertEquals("Fourth", list.findStudentById("6710400004").getName());
    }
}
