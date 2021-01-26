import org.junit.Test;

import static org.junit.Assert.*;

public class CaculatorTest {

    //test methods for add(a,b)
    @Test
    public void addTestWorst1 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-50);
        int expected = -60;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst2 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-49);
        int expected = -59;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst3 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,499);
        int expected = 489;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst4 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,500);
        int expected = 490;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst5 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,225);
        int expected = 215;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst6 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-50);
        int expected = -59;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst7 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-49);
        int expected = -58;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst8 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,499);
        int expected = 490;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst9 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,500);
        int expected = 491;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst10 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,225);
        int expected = 216;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst11 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-50);
        int expected = 49;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst12 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-49);
        int expected = 50;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst13 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,499);
        int expected = 598;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst14 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,500);
        int expected = 599;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst15 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,225);
        int expected = 324;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst16 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-50);
        int expected = 50;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst17 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-49);
        int expected = 51;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst18 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,499);
        int expected = 599;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst19 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,500);
        int expected = 600;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst20 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,225);
        int expected = 325;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst21 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-50);
        int expected = -5;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst22 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-49);
        int expected = -4;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst23 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,499);
        int expected = 544;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst24 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,500);
        int expected = 545;
        assertEquals(expected,result);
    }
    @Test
    public void addTestWorst25 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,225);
        int expected = 270;
        assertEquals(expected,result);
    }


    //test mothods for add(a,b,c)

    @Test
    public void addThreeTestWorstCase1 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-50,-10);
        int expected = -70;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase2 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-50,-9);
        int expected = -69;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase3 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-50,9);
        int expected = -51;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase4 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-50,10);
        int expected = -50;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase5 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-50,0);
        int expected = -60;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase6 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-49,-10);
        int expected = -69;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase7 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-49,-9);
        int expected = -68;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase8 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-49,9);
        int expected = -50;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase9 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-49,10);
        int expected = -49;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase10 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,-49,0);
        int expected = -59;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase11 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,499,-10);
        int expected = 479;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase12 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,499,-9);
        int expected = 480;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase13 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,499,9);
        int expected = 498;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase14 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,499,10);
        int expected = 499;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase15 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,499,0);
        int expected = 489;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase16 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,500,-10);
        int expected = 480;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase17 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,500,-9);
        int expected = 481;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase18 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,500,9);
        int expected = 499;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase19 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,500,10);
        int expected = 500;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase20 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,500,0);
        int expected = 490;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase21 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,225,-10);
        int expected = 205;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase22 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,225,-9);
        int expected = 206;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase23 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,225,9);
        int expected = 224;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase24 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,225,10);
        int expected = 225;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase25 () {
        Caculator cal = new Caculator();
        int result = cal.add(-10,225,0);
        int expected = 215;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase26 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-50,-10);
        int expected = -69;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase27 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-50,-9);
        int expected = -68;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase28 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-50,9);
        int expected = -50;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase29 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-50,10);
        int expected = -49;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase30 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-50,0);
        int expected = -59;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase31 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-49,-10);
        int expected = -68;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase32 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-49,-9);
        int expected = -67;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase33 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-49,9);
        int expected = -49;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase34 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-49,10);
        int expected = -48;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase35 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,-49,0);
        int expected = -58;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase36 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,499,-10);
        int expected = 480;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase37 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,499,-9);
        int expected = 481;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase38 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,499,9);
        int expected = 499;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase39 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,499,10);
        int expected = 500;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase40 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,499,0);
        int expected = 490;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase41 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,500,-10);
        int expected = 481;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase42 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,500,-9);
        int expected = 482;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase43 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,500,9);
        int expected = 500;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase44 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,500,10);
        int expected = 501;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase45 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,500,0);
        int expected = 491;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase46 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,225,-10);
        int expected = 206;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase47 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,225,-9);
        int expected = 207;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase48 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,225,9);
        int expected = 225;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase49 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,225,10);
        int expected = 226;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase50 () {
        Caculator cal = new Caculator();
        int result = cal.add(-9,225,0);
        int expected = 216;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase51 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-50,-10);
        int expected = 39;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase52 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-50,-9);
        int expected = 40;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase53 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-50,9);
        int expected = 58;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase54 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-50,10);
        int expected = 59;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase55 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-50,0);
        int expected = 49;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase56 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-49,-10);
        int expected = 40;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase57 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-49,-9);
        int expected = 41;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase58 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-49,9);
        int expected = 59;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase59 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-49,10);
        int expected = 60;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase60 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,-49,0);
        int expected = 50;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase61 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,499,-10);
        int expected = 588;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase62 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,499,-9);
        int expected = 589;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase63 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,499,9);
        int expected = 607;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase64 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,499,10);
        int expected = 608;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase65 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,499,0);
        int expected = 598;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase66 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,500,-10);
        int expected = 589;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase67 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,500,-9);
        int expected = 590;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase68 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,500,9);
        int expected = 608;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase69 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,500,10);
        int expected = 609;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase70 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,500,0);
        int expected = 599;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase71 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,225,-10);
        int expected = 314;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase72 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,225,-9);
        int expected = 315;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase73 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,225,9);
        int expected = 333;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase74 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,225,10);
        int expected = 334;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase75 () {
        Caculator cal = new Caculator();
        int result = cal.add(99,225,0);
        int expected = 324;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase76 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-50,-10);
        int expected = 40;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase77 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-50,-9);
        int expected = 41;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase78 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-50,9);
        int expected = 59;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase79 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-50,10);
        int expected = 60;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase80 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-50,0);
        int expected = 50;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase81 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-49,-10);
        int expected = 41;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase82 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-49,-9);
        int expected = 42;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase83 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-49,9);
        int expected = 60;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase84 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-49,10);
        int expected = 61;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase85 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,-49,0);
        int expected = 51;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase86 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,499,-10);
        int expected = 589;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase87 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,499,-9);
        int expected = 590;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase88 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,499,9);
        int expected = 608;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase89 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,499,10);
        int expected = 609;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase90 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,499,0);
        int expected = 599;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase91 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,500,-10);
        int expected = 590;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase92 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,500,-9);
        int expected = 591;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase93 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,500,9);
        int expected = 609;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase94 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,500,10);
        int expected = 610;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase95 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,500,0);
        int expected = 600;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase96 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,225,-10);
        int expected = 315;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase97 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,225,-9);
        int expected = 316;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase98 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,225,9);
        int expected = 334;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase99 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,225,10);
        int expected = 335;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase100 () {
        Caculator cal = new Caculator();
        int result = cal.add(100,225,0);
        int expected = 325;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase101 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-50,-10);
        int expected = -15;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase102 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-50,-9);
        int expected = -14;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase103 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-50,9);
        int expected = 4;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase104 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-50,10);
        int expected = 5;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase105 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-50,0);
        int expected = -5;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase106 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-49,-10);
        int expected = -14;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase107 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-49,-9);
        int expected = -13;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase108 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-49,9);
        int expected = 5;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase109 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-49,10);
        int expected = 6;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase110 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,-49,0);
        int expected = -4;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase111 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,499,-10);
        int expected = 534;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase112 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,499,-9);
        int expected = 535;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase113 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,499,9);
        int expected = 553;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase114 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,499,10);
        int expected = 554;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase115 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,499,0);
        int expected = 544;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase116 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,500,-10);
        int expected = 535;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase117 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,500,-9);
        int expected = 536;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase118 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,500,9);
        int expected = 554;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase119 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,500,10);
        int expected = 555;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase120 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,500,0);
        int expected = 545;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase121 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,225,-10);
        int expected = 260;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase122 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,225,-9);
        int expected = 261;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase123 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,225,9);
        int expected = 279;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase124 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,225,10);
        int expected = 280;
        assertEquals(expected,result);
    }
    @Test
    public void addThreeTestWorstCase125 () {
        Caculator cal = new Caculator();
        int result = cal.add(45,225,0);
        int expected = 270;
        assertEquals(expected,result);
    }


    @Test
    public void testAdd1() {
    }

    //substract

    @Test
    public void substractTestWorst1 () {
        Caculator cal = new Caculator();
        int result = cal.substract(10,-1000);
        int expected = 1010;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst2 () {
        Caculator cal = new Caculator();
        int result = cal.substract(10,-999);
        int expected = 1009;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst3 () {
        Caculator cal = new Caculator();
        int result = cal.substract(10,999);
        int expected = -989;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst4 () {
        Caculator cal = new Caculator();
        int result = cal.substract(10,1000);
        int expected = -990;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst5 () {
        Caculator cal = new Caculator();
        int result = cal.substract(10,0);
        int expected = 10;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst6 () {
        Caculator cal = new Caculator();
        int result = cal.substract(11,-1000);
        int expected = 1011;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst7 () {
        Caculator cal = new Caculator();
        int result = cal.substract(11,-999);
        int expected = 1010;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst8 () {
        Caculator cal = new Caculator();
        int result = cal.substract(11,999);
        int expected = -988;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst9 () {
        Caculator cal = new Caculator();
        int result = cal.substract(11,1000);
        int expected = -989;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst10 () {
        Caculator cal = new Caculator();
        int result = cal.substract(11,0);
        int expected = 11;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst11 () {
        Caculator cal = new Caculator();
        int result = cal.substract(999,-1000);
        int expected = 1999;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst12 () {
        Caculator cal = new Caculator();
        int result = cal.substract(999,-999);
        int expected = 1998;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst13 () {
        Caculator cal = new Caculator();
        int result = cal.substract(999,999);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst14 () {
        Caculator cal = new Caculator();
        int result = cal.substract(999,1000);
        int expected = -1;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst15 () {
        Caculator cal = new Caculator();
        int result = cal.substract(999,0);
        int expected = 999;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst16 () {
        Caculator cal = new Caculator();
        int result = cal.substract(1000,-1000);
        int expected = 2000;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst17 () {
        Caculator cal = new Caculator();
        int result = cal.substract(1000,-999);
        int expected = 1999;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst18 () {
        Caculator cal = new Caculator();
        int result = cal.substract(1000,999);
        int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst19 () {
        Caculator cal = new Caculator();
        int result = cal.substract(1000,1000);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst20 () {
        Caculator cal = new Caculator();
        int result = cal.substract(1000,0);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst21 () {
        Caculator cal = new Caculator();
        int result = cal.substract(505,-1000);
        int expected = 1505;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst22 () {
        Caculator cal = new Caculator();
        int result = cal.substract(505,-999);
        int expected = 1504;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst23 () {
        Caculator cal = new Caculator();
        int result = cal.substract(505,999);
        int expected = -494;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst24 () {
        Caculator cal = new Caculator();
        int result = cal.substract(505,1000);
        int expected = -495;
        assertEquals(expected,result);
    }
    @Test
    public void substractTestWorst25 () {
        Caculator cal = new Caculator();
        int result = cal.substract(505,0);
        int expected = 505;
        assertEquals(expected,result);
    }

    //devide
    @Test
    public void divideWorstTest1 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-10,5);
        int expected = -2;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest2 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-10,6);
        int expected = -1;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest3 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-10,49);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest4 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-10,50);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest5 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-10,27);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest6 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-9,5);
        int expected = -1;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest7 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-9,6);
        int expected = -1;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest8 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-9,49);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest9 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-9,50);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest10 () {
        Caculator cal = new Caculator();
        int result = cal.divide(-9,27);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest11 () {
        Caculator cal = new Caculator();
        int result = cal.divide(29,5);
        int expected = 5;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest12 () {
        Caculator cal = new Caculator();
        int result = cal.divide(29,6);
        int expected = 4;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest13 () {
        Caculator cal = new Caculator();
        int result = cal.divide(29,49);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest14 () {
        Caculator cal = new Caculator();
        int result = cal.divide(29,50);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest15 () {
        Caculator cal = new Caculator();
        int result = cal.divide(29,27);
        int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest16 () {
        Caculator cal = new Caculator();
        int result = cal.divide(30,5);
        int expected = 6;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest17 () {
        Caculator cal = new Caculator();
        int result = cal.divide(30,6);
        int expected = 5;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest18 () {
        Caculator cal = new Caculator();
        int result = cal.divide(30,49);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest19 () {
        Caculator cal = new Caculator();
        int result = cal.divide(30,50);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest20 () {
        Caculator cal = new Caculator();
        int result = cal.divide(30,27);
        int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest21 () {
        Caculator cal = new Caculator();
        int result = cal.divide(10,5);
        int expected = 2;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest22 () {
        Caculator cal = new Caculator();
        int result = cal.divide(10,6);
        int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest23 () {
        Caculator cal = new Caculator();
        int result = cal.divide(10,49);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest24 () {
        Caculator cal = new Caculator();
        int result = cal.divide(10,50);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test
    public void divideWorstTest25 () {
        Caculator cal = new Caculator();
        int result = cal.divide(10,27);
        int expected = 0;
        assertEquals(expected,result);
    }
    @Test


    @Test
    public void multiply() {
    }
}