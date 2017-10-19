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
        test.addRoot(new GraphNode(0,null));
        assert test.nodes()==1;
        assert test.root().id()==0;
    }
    
    @Test
    public void testAddNode()
    {
        Graph test = new Graph(new GraphNode(0,null));
        test.addNode(test.root(), new GraphNode(1,null));//left branch tested
        test.addNode(test.root(), new GraphNode(2,null));//right branch tested
        assert test.root().leftBranch().id()==1;
        assert test.root().rightBranch().id()==2;
    }
}
