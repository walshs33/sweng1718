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
public class GraphNode
{
    private int identifier;
    private GraphNode parent;
    private GraphNode leftBranch;
    private GraphNode rightBranch;
    
    public GraphNode(int id, GraphNode parent)
    {
        this.identifier = id;
        this.parent = parent;
        leftBranch = null;
        rightBranch = null;   
    }
    
    public int id()
    {
        return identifier;
    }
    
    public GraphNode parent()
    {
        return parent;
    }
    
    public GraphNode leftBranch()
    {
        return leftBranch;
    }
    
    public GraphNode rightBranch()
    {
        return rightBranch;
    }
    
    public void addChild(GraphNode child)
    {
        if(this.leftBranch == null)
        {
            this.leftBranch = child;
        }
        else
        {
            this.rightBranch = child;
        }
    }
    
    public void addParent(GraphNode parent)
    {
        this.parent = parent;
    }
    
}
