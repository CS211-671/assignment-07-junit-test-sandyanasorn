package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610450919", "sand");
    }

    @Test
    void testAddScore() {
        Student s1 = new Student("6610450919", "sand");
        s1.addScore(10.5);
        assertEquals(10.5, s1.getScore());
        s1.addScore(50);
        assertEquals(60.5, s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1 = new Student("6610450919", "sand", 50);
        s1.addScore(20);
        assertEquals("B", s1.grade());
    }

    @Test
    void testChangeName(){
        Student s1 = new Student("6610450919", "sand");
        s1.changeName("SAND");
        assertEquals("SAND", s1.getName());
    }

    @Test
    void testIsId(){
        Student s1 = new Student("6610450919", "sand");
        s1.isId("6610450919");
        assertEquals("6610450919", s1.getId());
    }
}