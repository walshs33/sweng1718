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
        
        assert test.ancestors(test4).size() == 8;
    }
    
    @Test
    public void testAncestors2()
    {
        Graph test = new Graph(new GraphNode(0));
        GraphNode test1 = new GraphNode(1);
        GraphNode test2 = new GraphNode(2);
        GraphNode test3 = new GraphNode(3);
        GraphNode test4 = new GraphNode(4);
        GraphNode test5 = new GraphNode(5);
        test.addNode(test.root(), test1);
        test.addNode(test.root(), test2);
        test.addNode(test1, test3);
        test.addNode(test2, test4);
        test.addNode(test3,test5);
        test5.addParent(test4);
        test4.addChild(test5);
        
        assert test.ancestors(test5).size() == 6;
        assert test.ancestors(test5).get(0) == 3;
        assert test.ancestors(test5).get(1) == 1;
        assert test.ancestors(test5).get(2) == 0;
        assert test.ancestors(test5).get(3) == 4;
        assert test.ancestors(test5).get(4) == 2;
        assert test.ancestors(test5).get(5) == 0;
    }
    
    @Test
    public void testLCA()
    {
        Graph test = new Graph(new GraphNode(0));
        GraphNode test1 = new GraphNode(1);
        GraphNode test2 = new GraphNode(2);
        GraphNode test3 = new GraphNode(3);
        GraphNode test4 = new GraphNode(4);
        GraphNode test5 = new GraphNode(5);
        GraphNode test6 = new GraphNode(6);
        GraphNode test7 = new GraphNode(7);
        GraphNode test8 = new GraphNode(8);
        test.addNode(test.root(), test1);
        test.addNode(test.root(), test2);
        test.addNode(test1, test3);
        test.addNode(test2, test4);
        test.addNode(test3, test5);
        test4.addChild(test5);
        test5.addParent(test4);
        test.addNode(test4, test6);
        test.addNode(test5, test7);
        test.addNode(test4, test8);
        test6.addChild(test8);
        test8.addParent(test6);
        assert test.lowestCommonAncestor(test7, test8) == 4;
        
    }
}
