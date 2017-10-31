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
    
    @Test
    public void testConstructor()
    {
        GraphNode newNode = new GraphNode(0, null);
    }
    
    @Test
    public void testBranches()
    {
        GraphNode testNode = new GraphNode(0);
        GraphNode b1 = new GraphNode(1);
        GraphNode b2 = new GraphNode(2);
        GraphNode b3 = new GraphNode(3);
        testNode.addChild(b1);
        testNode.addChild(b2);
        testNode.addChild(b3);
        GraphNode[] children = testNode.children();
        assert children[0].id() == 1;
        assert children[1].id() == 2;
        assert children[2].id() == 3;
    }
    
    @Test
    public void testParents()
    {
        GraphNode testNode = new GraphNode(0);
        GraphNode p1 = new GraphNode(1);
        GraphNode p2 = new GraphNode(2);
        GraphNode p3 = new GraphNode(3);
        testNode.addParent(p1);
        testNode.addParent(p2);
        testNode.addParent(p3);
        GraphNode[] parents = testNode.parents();
        assert parents[0].id() == 1;
        assert parents[1].id() == 2;
        assert parents[2].id() == 3;
    }
    
//    @Test
//    public void testLeftBranch()
//    {
//        GraphNode parentNode = new GraphNode(0, null);
//        GraphNode leftNode = new GraphNode(1, parentNode);
//        parentNode.addChild(leftNode);
//        assert parentNode.leftBranch().id()==leftNode.id();
//    }
//    
//    @Test
//    public void testRightBranch()
//    {
//        GraphNode parentNode = new GraphNode(0, null);
//        GraphNode rightNode = new GraphNode(1, parentNode);
//        parentNode.addChild(rightNode);         //children always added left first, this may need to be changed
//        parentNode.addChild(rightNode);
//        assert parentNode.rightBranch().id()==rightNode.id();
//    }
    
//    @Test
//    public void testParent1()
//    {
//        GraphNode parentNode = new GraphNode(0, null);
//        GraphNode childNode = new GraphNode(1, parentNode);
//        assert childNode.parent().id()==parentNode.id();
//    }
//    
//    @Test
//    public void testParent2()
//    {
//        GraphNode parentNode = new GraphNode(0,null);
//        GraphNode childNode = new GraphNode(1,null);
//        childNode.addParent(parentNode);
//        assert childNode.parent().id()==parentNode.id();
//    }
}
