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
    private GraphNode[] parents;
    private GraphNode[] children;
//    private GraphNode parent;
//    private GraphNode leftBranch;
//    private GraphNode rightBranch;
//    
    public GraphNode(int id, GraphNode parent)
    {
        this.identifier = id;
        this.parents = new GraphNode[1];
        this.parents[0] = parent;
        this.children = new GraphNode[0];
    }
    
    public GraphNode(int id)
    {
        this.identifier = id;
        this.parents= new GraphNode[0];
        this.children = new GraphNode[0];
    }
    
    public int id()
    {
        return identifier;
    }
    
    public GraphNode[] parents()
    {
        return this.parents;
    }
    
    public GraphNode[] children()
    {
        return this.children;
    }
    
    public void addChild(GraphNode child)
    {
        GraphNode[] tmp = this.children;
        this.children = new GraphNode[tmp.length + 1];
        System.arraycopy(tmp, 0, this.children, 0, tmp.length);
        this.children[this.children.length - 1] = child;
    }
    
    public void addParent(GraphNode parent)
    {
        GraphNode[] tmp = this.parents;
        this.parents = new GraphNode[tmp.length + 1];
        System.arraycopy(tmp, 0, this.parents, 0, tmp.length);
        this.parents[this.parents.length - 1] = parent;
    }
    
//    public GraphNode parent()
//    {
//        return parent;
//    }
//    
//    public GraphNode leftBranch()
//    {
//        return leftBranch;
//    }
//    
//    public GraphNode rightBranch()
//    {
//        return rightBranch;
//    }
//    
//    public void addChild(GraphNode child)
//    {
//        if(this.leftBranch == null)
//        {
//            this.leftBranch = child;
//        }
//        else
//        {
//            this.rightBranch = child;
//        }
//    }
//    
//    public void addParent(GraphNode parent)
//    {
//        this.parent = parent;
//    }
    
}
