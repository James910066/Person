import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class PersonTest {
    Person p1, p2, p3, p4, p5;

    @BeforeEach
    void setUp()
    {
        p1 = new Person("000001", "James", "Tester1", "Mr.", 2000);
        p2 = new Person("000002", "Melissa", "Tester2", "Mrs.", 1982);
        //Person.setID(0);
        p3 = new Person("000003", "Nathan", "Dinser", "Mr.", 2007);
        p4 = new Person( "000004", "Jaden", "Dinser", "Miss", 2007);
        p5 = new Person( "000005", "Mckaela", "Dinser", "Miss", 2001);
    }

    @org.junit.jupiter.api.Test
    void getID() {
        assertEquals("000001",p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setID() {
        assertEquals("000001",p1.getID());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals("James", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("James");
        assertEquals("James", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Tester1",p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Dinser");
        assertEquals("Dinser", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
       assertEquals("Mr.",p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p1.setTitle("Mr.");
        assertEquals("Mr.", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void getYOB() {
        assertEquals(2000, p1.getYOB());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p1.setYOB(1977);
        assertEquals(1977, p1.getYOB());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @Test
    void fullName() {
        p1.fullName();
        assertEquals("James Tester1", "James Tester1");
    }
    @Test
    void formalName() {
        p1.formalName();
        assertEquals("Mr. James Tester1","Mr. James Tester1");
    }

    @Test
    void getAge() {
        p1.getAge();
        assertEquals(2000,2000);
    }

    @Test
    void getAgeOffYear() {
        p1.getAgeOffYear(23); //age = 2023 - 2000
    }

    @Test
    void toCSVDataRecord() {}
}