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
    public void testConstructor2()
    {
        GraphNode newNode = new GraphNode(0);
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
}
