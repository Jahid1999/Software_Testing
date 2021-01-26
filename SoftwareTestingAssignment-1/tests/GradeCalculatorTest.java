import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCalculatorTest {

    @Test
    public void getGradeTestWorstCase1 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase2 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase3 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase4 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase5 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase6 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase7 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase8 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase9 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase10 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase11 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase12 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase13 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase14 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase15 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase16 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase17 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase18 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase19 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase20 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase21 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase22 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase23 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase24 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase25 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,0,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase26 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase27 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase28 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase29 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase30 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase31 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase32 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase33 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase34 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase35 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase36 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase37 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase38 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase39 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase40 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase41 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase42 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase43 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase44 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase45 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase46 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase47 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase48 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase49 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase50 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,1,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase51 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase52 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase53 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase54 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase55 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase56 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase57 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase58 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase59 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase60 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase61 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase62 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase63 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase64 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase65 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase66 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase67 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase68 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase69 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase70 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase71 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase72 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase73 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase74 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase75 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,14,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase76 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase77 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase78 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase79 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase80 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase81 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase82 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase83 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase84 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase85 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase86 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase87 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase88 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase89 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase90 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase91 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase92 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase93 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase94 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase95 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase96 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase97 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase98 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase99 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase100 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,15,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase101 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase102 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase103 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase104 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase105 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase106 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase107 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase108 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase109 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase110 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase111 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase112 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase113 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase114 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase115 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase116 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase117 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase118 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase119 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase120 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase121 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase122 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase123 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase124 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase125 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(0,7,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase126 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase127 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase128 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase129 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase130 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase131 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase132 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase133 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase134 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase135 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase136 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase137 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase138 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase139 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase140 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase141 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase142 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase143 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase144 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase145 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase146 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase147 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase148 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase149 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase150 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,0,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase151 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase152 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase153 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase154 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase155 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase156 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase157 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase158 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase159 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase160 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase161 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase162 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase163 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase164 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase165 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase166 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase167 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase168 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase169 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase170 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase171 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase172 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase173 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase174 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase175 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,1,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase176 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase177 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase178 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase179 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase180 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase181 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase182 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase183 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase184 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase185 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase186 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase187 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase188 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase189 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase190 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase191 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase192 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase193 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase194 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase195 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase196 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase197 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase198 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase199 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase200 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,14,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase201 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase202 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase203 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase204 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase205 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase206 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase207 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase208 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase209 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase210 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase211 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase212 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase213 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase214 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase215 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase216 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase217 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase218 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase219 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase220 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase221 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase222 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase223 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase224 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase225 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,15,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase226 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase227 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase228 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase229 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase230 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase231 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase232 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase233 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase234 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase235 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase236 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase237 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase238 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase239 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase240 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase241 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase242 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase243 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase244 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase245 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase246 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase247 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase248 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase249 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase250 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(1,7,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase251 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase252 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase253 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase254 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase255 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase256 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase257 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase258 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase259 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase260 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase261 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase262 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase263 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase264 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase265 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase266 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase267 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase268 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase269 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase270 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase271 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase272 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase273 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase274 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase275 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,0,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase276 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase277 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase278 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase279 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase280 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase281 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase282 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase283 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase284 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase285 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase286 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase287 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase288 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase289 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase290 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase291 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase292 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase293 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase294 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase295 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase296 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase297 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase298 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase299 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase300 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,1,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase301 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase302 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase303 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase304 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase305 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase306 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase307 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase308 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase309 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase310 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase311 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase312 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase313 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase314 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase315 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase316 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase317 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase318 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase319 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase320 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase321 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase322 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase323 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase324 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase325 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,14,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase326 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase327 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase328 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase329 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase330 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase331 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase332 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase333 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase334 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase335 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase336 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase337 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase338 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase339 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase340 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase341 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase342 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase343 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase344 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase345 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase346 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase347 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase348 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase349 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase350 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,15,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase351 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase352 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase353 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase354 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase355 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase356 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase357 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase358 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase359 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase360 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase361 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase362 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase363 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase364 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase365 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase366 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase367 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase368 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase369 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase370 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase371 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase372 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase373 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase374 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase375 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(24,7,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase376 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase377 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase378 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase379 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase380 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase381 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase382 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase383 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase384 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase385 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase386 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase387 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase388 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase389 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase390 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase391 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase392 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase393 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase394 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase395 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase396 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase397 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase398 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase399 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase400 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,0,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase401 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase402 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase403 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase404 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase405 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase406 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase407 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase408 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase409 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase410 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase411 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase412 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase413 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase414 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase415 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase416 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase417 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase418 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase419 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase420 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase421 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase422 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase423 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase424 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase425 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,1,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase426 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase427 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase428 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase429 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase430 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase431 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase432 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase433 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase434 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase435 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase436 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase437 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase438 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase439 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase440 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase441 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase442 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase443 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase444 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase445 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase446 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase447 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase448 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase449 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase450 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,14,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase451 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase452 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase453 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase454 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase455 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase456 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase457 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase458 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase459 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase460 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase461 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase462 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase463 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase464 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase465 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase466 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase467 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase468 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase469 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase470 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase471 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase472 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase473 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase474 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase475 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,15,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase476 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase477 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase478 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase479 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase480 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase481 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase482 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase483 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase484 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase485 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase486 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase487 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase488 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase489 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase490 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase491 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase492 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase493 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase494 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase495 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase496 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase497 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase498 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase499 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase500 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(25,7,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase501 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase502 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase503 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase504 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase505 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase506 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase507 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase508 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase509 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase510 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase511 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase512 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase513 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase514 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase515 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase516 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase517 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase518 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase519 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase520 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase521 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase522 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase523 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase524 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase525 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,0,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase526 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase527 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase528 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase529 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase530 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase531 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase532 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase533 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase534 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase535 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase536 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase537 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase538 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase539 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase540 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase541 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase542 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase543 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase544 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase545 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase546 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase547 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase548 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase549 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase550 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,1,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase551 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase552 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase553 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase554 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase555 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase556 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase557 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase558 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase559 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase560 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase561 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase562 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase563 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase564 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase565 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase566 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase567 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase568 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase569 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase570 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase571 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase572 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase573 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase574 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase575 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,14,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase576 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase577 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase578 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase579 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase580 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase581 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase582 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase583 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase584 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase585 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase586 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase587 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase588 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase589 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase590 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase591 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase592 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase593 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase594 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase595 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase596 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase597 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase598 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase599 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase600 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,15,25,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase601 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,0,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase602 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,0,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase603 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,0,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase604 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,0,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase605 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,0,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase606 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,1,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase607 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,1,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase608 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,1,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase609 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,1,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase610 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,1,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase611 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,49,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase612 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,49,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase613 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,49,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase614 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,49,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase615 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,49,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase616 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,50,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase617 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,50,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase618 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,50,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase619 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,50,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase620 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,50,5);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase621 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,25,0);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase622 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,25,1);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase623 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,25,9);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase624 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,25,10);
        String expected = "X";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase625 () {
        GradeCalculator gradeCal= new GradeCalculator();
        String grade = gradeCal.getGrade(12,7,25,5);
        String expected = "X";
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
        double gpa = gc.getGPA("D");
        double expected = 0.00;

        assertEquals(expected,gpa,0.001);
    }

    @Test
    public void getGPATest6() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("F");
        double expected = 0.00;

        assertEquals(expected,gpa,0.001);
    }
}
