import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCalculatorTest {

    @Test
    public void getGradeTest1() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,1);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest2() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,2);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest3() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,10);
        String expected = "C";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest4() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,9);
        String expected = "C";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest5() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest6() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest7() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,5);
        String expected = "A";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest8() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,5);
        String expected = "A";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest9() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest110() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest11() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,5);
        String expected = "B";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest12() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,5);
        String expected = "C";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest13() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest14() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest15() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,5);
        String expected = "B";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest16() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,5);
        String expected = "C";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest17() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,5);
        String expected = "C";

        assertEquals(expected,grade);
    }


    //test cases for getGPA
    @Test
    public void getGPATest1() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("A+");
        double expected = 4.00;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest2() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("A");
        double expected = 3.50;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest3() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("B");
        double expected = 3.00;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest4() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("C");
        double expected = 2.00;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest5() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("F");
        double expected = 0.00;

        assertEquals(expected,gpa,0.001);
    }

    @Test
    public void getGPATest6() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("D");
        double expected = 0.00;

        assertEquals(expected,gpa,0.001);
    }
}