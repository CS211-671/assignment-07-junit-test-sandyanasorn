package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    public void testAddNewStudentWithoutScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("1", "a");
        ArrayList<Student> students = studentList.getStudents();

        assertEquals(1, students.size());
        assertEquals("1", students.get(0).getId());
        assertEquals("a", students.get(0).getName());
        assertEquals(0.0, students.get(0).getScore());
    }

    @Test
    public void testAddNewStudentWithScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("2", "b", 100.0);
        ArrayList<Student> students = studentList.getStudents();

        assertEquals(1, students.size());
        assertEquals("2", students.get(0).getId());
        assertEquals("b", students.get(0).getName());
        assertEquals(100.0, students.get(0).getScore());
    }

    @Test
    public void testFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("3", "c");
        Student student = studentList.findStudentById("3");

        assertNotNull(student);
        assertEquals("3", student.getId());
        assertEquals("c", student.getName());
    }

    @Test
    public void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("4", "d", 50.0);
        studentList.giveScoreToId("4", 25.0);
        Student student = studentList.findStudentById("4");

        assertNotNull(student);
        assertEquals(75.0, student.getScore());
    }

    @Test
    public void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("5", "e", 92.0);
        String grade = studentList.viewGradeOfId("5");

        assertEquals("A", grade);
    }
}