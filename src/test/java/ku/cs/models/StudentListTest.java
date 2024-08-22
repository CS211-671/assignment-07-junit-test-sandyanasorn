package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testAddNewStudentByIdAndName(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "a");
        Student student = studentList.findStudentById("1");
        assertEquals("a", student.getName());
    }

    @Test
    void testAddNewStudentByIdNameAndScore(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "a", 10);
        Student student = studentList.findStudentById("1");
        assertEquals(10, student.getScore());
    }

    @Test
    void testFindStudentById(){

    }
}