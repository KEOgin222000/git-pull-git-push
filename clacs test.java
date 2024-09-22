
public void testInvalidMultiplication(){
            int result = CalcMain.multiplication(11,5);
            assertNotEquals(result,22);
}
@Test
public void testInvalidDivison(){
         float result = CalcMain.division(20,5);
         assertNotEquals(result,5.0f);
}
@Test
public void testInvalidRemainder(){
         int result = CalcMain.remainder(12,6);
         assertNotEquals(result,1);
    }
}
