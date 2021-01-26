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
