/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blueskywalker.fst;

import junit.framework.TestCase;

/**
 *
 * @author blueskywalker
 */
public class EntryTableTest extends TestCase {
    
    public EntryTableTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of readFromFile method, of class EntryTable.
     */
    public void testReadFromFile() {
        System.out.println("readFromFile");
        String name = "test.txt";
        EntryTable instance = new EntryTable();
        instance.readFromFile(name);
        
        assertEquals(10, instance.size());
    }

    /**
     * Test of checkUnique method, of class EntryTable.
     */
    public void testCheckUnique() {
        System.out.println("checkUnique");
        EntryTable instance = new EntryTable();
        boolean result = instance.checkUnique();
        assertEquals(false, result);
        instance.readFromFile("test.txt");
        result = instance.checkUnique();
        assertEquals(true, result);
    }
}
