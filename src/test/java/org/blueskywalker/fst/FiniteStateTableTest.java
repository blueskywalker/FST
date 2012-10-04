/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blueskywalker.fst;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blueskywalker
 */
public class FiniteStateTableTest {
    
    public FiniteStateTableTest() {
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
     * Test of build method, of class FiniteStateTable.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        String fileName = "";
        FiniteStateTable instance = null;
        instance.build(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traverseDFA method, of class FiniteStateTable.
     */
    @Test
    public void testTraverseDFA() {
        System.out.println("traverseDFA");
        int root = 0;
        int value = 0;
        StringBuffer str = null;
        int pos = 0;
        int n = 0;
        FiniteStateTable instance = null;
        int expResult = 0;
        int result = instance.traverseDFA(root, value, str, pos, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildDFA method, of class FiniteStateTable.
     */
    @Test
    public void testBuildDFA() {
        System.out.println("buildDFA");
        int root = 0;
        int start = 0;
        int size = 0;
        int stringPos = 0;
        FiniteStateTable instance = null;
        instance.buildDFA(root, start, size, stringPos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFST2File method, of class FiniteStateTable.
     */
    @Test
    public void testSaveFST2File() {
        System.out.println("saveFST2File");
        String fileName = "";
        FlatFST fst = null;
        FiniteStateTable instance = null;
        instance.saveFST2File(fileName, fst);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofSize method, of class FiniteStateTable.
     */
    @Test
    public void testOfSize() {
        System.out.println("ofSize");
        int state = 0;
        FiniteStateTable instance = null;
        int expResult = 0;
        int result = instance.ofSize(state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofChar method, of class FiniteStateTable.
     */
    @Test
    public void testOfChar() {
        System.out.println("ofChar");
        int state = 0;
        int n = 0;
        FiniteStateTable instance = null;
        char expResult = ' ';
        char result = instance.ofChar(state, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofValue method, of class FiniteStateTable.
     */
    @Test
    public void testOfValue() {
        System.out.println("ofValue");
        int state = 0;
        int n = 0;
        FiniteStateTable instance = null;
        int expResult = 0;
        int result = instance.ofValue(state, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofValueSet method, of class FiniteStateTable.
     */
    @Test
    public void testOfValueSet() {
        System.out.println("ofValueSet");
        int state = 0;
        int n = 0;
        int newValue = 0;
        FiniteStateTable instance = null;
        instance.ofValueSet(state, n, newValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofNext method, of class FiniteStateTable.
     */
    @Test
    public void testOfNext() {
        System.out.println("ofNext");
        int state = 0;
        int n = 0;
        FiniteStateTable instance = null;
        int expResult = 0;
        int result = instance.ofNext(state, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransitionTable method, of class FiniteStateTable.
     */
    @Test
    public void testGetTransitionTable() {
        System.out.println("getTransitionTable");
        FiniteStateTable instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getTransitionTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDFA method, of class FiniteStateTable.
     */
    @Test
    public void testGetDFA() {
        System.out.println("getDFA");
        FiniteStateTable instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getDFA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofFinished method, of class FiniteStateTable.
     */
    @Test
    public void testOfFinished() {
        System.out.println("ofFinished");
        int state = 0;
        FiniteStateTable instance = null;
        boolean expResult = false;
        boolean result = instance.ofFinished(state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
