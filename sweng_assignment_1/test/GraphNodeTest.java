/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sweng_assignment_1.GraphNode;

/**
 *
 * @author Sam Walsh - 12304297
 */
public class GraphNodeTest
{
    
    public GraphNodeTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Test
    public void testConstructor()
    {
        GraphNode newNode = new GraphNode(0, null);
    }
    
    @Test
    public void testLeftBranch()
    {
        GraphNode parentNode = new GraphNode(0, null);
        GraphNode leftNode = new GraphNode(1, parentNode);
        parentNode.addChild(leftNode);
        assert parentNode.leftBranch().id()==leftNode.id();
    }
    
    @Test
    public void testRightBranch()
    {
        GraphNode parentNode = new GraphNode(0, null);
        GraphNode rightNode = new GraphNode(1, parentNode);
        parentNode.addChild(rightNode);         //children always added left first, this may need to be changed
        parentNode.addChild(rightNode);
        assert parentNode.rightBranch().id()==rightNode.id();
    }
    
    @Test
    public void testParent()
    {
        GraphNode parentNode = new GraphNode(0, null);
        GraphNode childNode = new GraphNode(1, parentNode);
        assert childNode.parent().id()==parentNode.id();

    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
}
