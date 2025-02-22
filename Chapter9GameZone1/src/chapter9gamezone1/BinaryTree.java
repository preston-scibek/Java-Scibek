package chapter9gamezone1;

import static betterutils.BetterUtils.*;
import java.io.Serializable;

public class BinaryTree implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Node root;
	private String[] tree;

	/**
	 * makes binary tree
	 * @param data - data of root node;
	 */
	public BinaryTree(String data)
	{

		this.setRoot(new Node(data, this));
		this.root.setIsRoot(true);
	}

	/**
	 * gets root node
	 * @return - the root node
	 */
	public Node getRoot()
	{
		return root;
	}

	/**
	 * sets a new root node
	 * @param root - new root node
	 */
	public void setRoot(Node root)
	{
		this.root = root;
		this.root.setIsRoot(true);
	}

	/**
	 * prints the tree
	 */
	public void printTree()
	{
		this.root.printNodes();
	}

	/**
	 * builds the tree of the computers memory and then prints it out
	 */
	public void buildTree()
	{
		int numberOfNodes = this.root.countNodes();
		String buffer = " ";
		this.tree = new String[numberOfNodes + 4];
		for(int i = 0; i <= numberOfNodes + 3; i++)
		{
			buffer = " ";
			for(int j = 0; j < numberOfNodes - i; j++)
			{
				buffer = buffer.concat("    ");
			}
			tree[i] = buffer;
		}
		this.root.cycleNodes();
		for(int i = 0; i < tree.length; i++)
		{
			println(tree[i]);
		}

	}

	/**
	 * @return the tree
	 */
	public String[] getTree()
	{
		return this.tree;
	}

	/**
	 * @param tree the tree to set
	 */
	public void setTree(String[] tree)
	{
		this.tree = tree;
	}
}
