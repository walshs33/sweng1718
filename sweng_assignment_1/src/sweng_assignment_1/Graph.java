/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng_assignment_1;

import java.util.ArrayList;
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
    
    //have to use Integer and not int because java
    public ArrayList<Integer> ancestors(GraphNode node)
    {
        ArrayList<Integer> ancestors = new ArrayList<Integer>();
        GraphNode[] parents = node.parents();
        
        if(node != this.root)
        {
        for(int i = 0; i < parents.length; i++)
        {
            ancestors.add(parents[i].id());
            ancestors.addAll(ancestors(parents[i]));
        }
        }
//        Integer[] result = ancestors.toArray(new Integer[0]);
        
        return ancestors;
    }
    
    public int lowestCommonAncestor(GraphNode nodeA, GraphNode nodeB)
    {
        Integer[] ancestorsA = ancestors(nodeA).toArray(new Integer[0]);
        Integer[] ancestorsB = ancestors(nodeB).toArray(new Integer[0]);
        
        int lenA = ancestorsA.length;
        int lenB = ancestorsB.length;
        
        int ancestorId = 0;
        for(int i = lenA-1; i>=0; i--)
        {
            for(int j = lenB-1; j>=0; j--)
            {
                if(ancestorsA[i]==ancestorsB[j])
                {
                    ancestorId = ancestorsA[i];
                }
            }
        }
        return ancestorId;
    }
}
