/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import sweng_assignment_1.Graph;
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
}
