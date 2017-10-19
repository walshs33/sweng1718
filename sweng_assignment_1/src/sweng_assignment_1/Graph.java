/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng_assignment_1;

/**
 *
 * @author Sam Walsh - 12304297
 */
public class Graph
{
    private int nodes;
    private GraphNode root;
    
    public Graph()
    {
        this.nodes = 0;
        this.root = null;
    }
    
    public Graph(GraphNode root)
    {
        if(root==null)
        {
            this.nodes = 0;
        }
        else
        {
            this.nodes = 1;
        }
        this.root = root;
    }
    
    public int nodes()
    {
        return this.nodes;
    }
    
    public GraphNode root()
    {
        return this.root;
    }
    
    //no verification that the root is null, assuming good input
    public void addRoot(GraphNode root)
    {
        this.root = root;
        nodes++;
    }
    
    //no verification that there is a free space for node, assuming good input
    public void addNode(GraphNode parent, GraphNode child)
    {
        parent.addChild(child);
        child.addParent(parent);
        nodes++;
    }
    
    public int[] ancestors(GraphNode node)
    {
        GraphNode workingNode = node;
        int noOfAncestors = 0;
        int[] ancestors = new int[noOfAncestors];
        while(node.parent()!=null)
        {
            noOfAncestors++;
        }
    }
}
