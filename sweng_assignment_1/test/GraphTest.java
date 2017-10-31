/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import sweng_assignment_1.Graph;
import sweng_assignment_1.GraphNode;
/**
 *
 * @author Sam Walsh - 12304297
 */
public class GraphTest
{
    
    public GraphTest()
    {
    }
    
    @Test
    public void testConstructor1()
    {
        Graph test = new Graph();
    }
    
    @Test
    public void testConstructor2()
    {
        Graph test = new Graph(null);
    }
    
    @Test
    public void testNodes1()
    {
        Graph test = new Graph();
        assert test.nodes()==0;
    }
    
    @Test
    public void testNodes2()
    {
        Graph test = new Graph(null);
        assert test.nodes()==0;
    }
    
    @Test
    public void testAddRoot()
    {
        Graph test = new Graph();
        test.addRoot(new GraphNode(0));
        assert test.nodes()==1;
        assert test.root().id()==0;
    }
    
    @Test
    public void testAddNode()
    {
        Graph test = new Graph(new GraphNode(0,null));
        test.addNode(test.root(), new GraphNode(1));
        test.addNode(test.root(), new GraphNode(2));
        test.addNode(test.root(), new GraphNode(3));
        GraphNode[] rootChildren = test.root().children();
        assert rootChildren[0].id()==1;
        assert rootChildren[1].id()==2;
        assert rootChildren[2].id()==3;
    }
    
    @Test
    public void testAncestors()
    {
        Graph test = new Graph(new GraphNode(0));
        GraphNode test1 = new GraphNode(1);
        GraphNode test2 = new GraphNode(2);
        GraphNode test3 = new GraphNode(3);
        GraphNode test4 = new GraphNode(4);
        test.addNode(test.root(), test1);
        test.addNode(test1, test2);
        test.addNode(test2, test3);
        test.addNode(test3, test4);
        assert test.ancestors(test4).get(0)==3; 
        assert test.ancestors(test4).get(1)==2; 
        assert test.ancestors(test4).get(2)==1; 
        assert test.ancestors(test4).get(3)==0;
        
        GraphNode test5 = new GraphNode(5);
        test.addNode(test2, test5);
        test5.addChild(test4);
        test4.addParent(test5);
        assert test.ancestors(test4).get(4)==5;
    }
    
//    @Test
//    public void testLCA()
//    {
//        Graph test = new Graph(new GraphNode(0,null));
//        GraphNode nodeA = new GraphNode(1,null);
//        GraphNode nodeB = new GraphNode(2,null);
//        test.addNode(test.root(), nodeA);
//        test.addNode(test.root(), nodeB);
//        assert test.lowestCommonAncestor(nodeA, nodeB) == 0;
//        GraphNode nodeC = new GraphNode(3,null);
//        GraphNode nodeD= new GraphNode(4,null);
//        GraphNode nodeE = new GraphNode(5,null);
//        test.addNode(nodeA, nodeC);
//        test.addNode(nodeC, nodeD);
//        test.addNode(nodeA, nodeE);
//        assert test.lowestCommonAncestor(nodeD, nodeE) == 1;
//        assert test.lowestCommonAncestor(nodeE, nodeD) == 1;
//        
//    }
}
