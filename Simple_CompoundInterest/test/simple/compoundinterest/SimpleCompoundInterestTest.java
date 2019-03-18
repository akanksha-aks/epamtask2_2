/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.compoundinterest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author akanksha singh
 */
public class SimpleCompoundInterestTest {
    
    public SimpleCompoundInterestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class SimpleCompoundInterest.
     */
    @Test
    public void testMain() {
        int p= 1000;
        int t=2;
        int r=10;
        SimpleCompoundInterest obj= new SimpleCompoundInterest();
        int result = obj.SI(p,r,t);
        assertEquals(200,result);
    }
    public void SiFail(){
        int p= 100;
        int t=20;
        int r=1;
        SimpleCompoundInterest obj= new SimpleCompoundInterest();
        int result = obj.SI(p,r,t);
        assertEquals("ERROR IN SI()",0,result);
        
    }
  
  
}    

