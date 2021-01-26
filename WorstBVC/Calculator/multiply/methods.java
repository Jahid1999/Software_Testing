@Test
public void multiplyWorstCase1 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-100,-50);
	int expected = 5000;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase2 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-100,-49);
	int expected = 4900;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase3 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-100,49);
	int expected = -4900;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase4 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-100,50);
	int expected = -5000;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase5 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-100,0);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase6 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-99,-50);
	int expected = 4950;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase7 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-99,-49);
	int expected = 4851;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase8 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-99,49);
	int expected = -4851;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase9 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-99,50);
	int expected = -4950;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase10 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(-99,0);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase11 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(99,-50);
	int expected = -4950;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase12 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(99,-49);
	int expected = -4851;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase13 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(99,49);
	int expected = 4851;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase14 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(99,50);
	int expected = 4950;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase15 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(99,0);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase16 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(100,-50);
	int expected = -5000;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase17 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(100,-49);
	int expected = -4900;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase18 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(100,49);
	int expected = 4900;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase19 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(100,50);
	int expected = 5000;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase20 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(100,0);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase21 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(0,-50);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase22 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(0,-49);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase23 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(0,49);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase24 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(0,50);
	int expected = 0;
	assertEquals(expected,result);
}
@Test
public void multiplyWorstCase25 () {
	Caculator cal = new Caculator();
	int result = cal.multiply(0,0);
	int expected = 0;
	assertEquals(expected,result);
}
