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
