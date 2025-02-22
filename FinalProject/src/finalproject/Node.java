package finalproject;
// Supporting Class
import static betterutils.BetterUtils.*;
import java.io.Serializable;
import java.util.ArrayList; 

public class Node implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String data;
	private Boolean isRoot = false;
	private Node left;
	private Node right;
	private Node parent;
	private BinaryTree binaryParent;
	private String dataType;
	private int levelOfTree = 1;

	/**
	 * makes node with data
	 * @param data - data of node
	 */
	public Node(String data)
	{
		this.data = data;
		left = null;
		right = null;
	}

	/**
	 * makes new now with data and parent node
	 * @param data - data of node
	 * @param parent - parent node
	 */
	public Node(String data, Node parent)
	{
		this.data = data;
		left = null;
		right = null;
		this.parent = parent;
		levelOfTree = parent.getLevelOfTree() + 1;
		binaryParent = parent.getBinaryParent();
	}

	/**
	 * makes node with parent of binary tree
	 * @param data - node data
	 * @param parent - binary tree parent
	 */
	public Node(String data, BinaryTree parent)
	{
		this.data = data;
		left = null;
		right = null;
		binaryParent = parent;
	}

	/**
	 * updates data
	 * @param data - new data
	 */
	public void setData(String data)
	{
		this.data = data;
	}

	/**
	 * gets the parent node
	 * @return - get parent node
	 */
	public Node getParent()
	{
		return parent;
	}

	/**
	 * gets the data
	 * @return - returns the data
	 */
	public String getData()
	{
		return data;
	}

	/**
	 * gets the left child node
	 * @return - the left child node
	 */
	public Node getLeft()
	{
		return left;
	}

	/**
	 * gets the right child node
	 * @return - the right child node
	 */
	public Node getRight()
	{
		return right;
	}

	/**
	 * sets the right child node
	 * @param Right - data of right node
	 */
	public void setRight(String Right)
	{
		right = new Node(Right, this);
		right.setBinaryParent(binaryParent);
	}

	/**
	 * sets the left child node
	 * @param Left - data of left node
	 */
	public void setLeft(String Left)
	{
		left = new Node(Left, this);
		left.setBinaryParent(binaryParent);
	}

	/**
	 * gets binary tree parent
	 * @return - parent tree of all nodes
	 */
	public BinaryTree getBinaryParent()
	{
		return binaryParent;
	}

	/**
	 * creates new parent of all nodes .. because its so possible to update the
	 * creator
	 * @param binaryParent - new parent of all nodes
	 */
	public void setBinaryParent(BinaryTree binaryParent)
	{
		this.binaryParent = binaryParent;
	}

	/**
	 * checks if it has child with data
	 * @return - true if kids false if null
	 */
	public boolean hasChild()
	{
		try
		{
			if(right.getData() != null) // If Statement
			{
				return true;
			}
			else if(left.getData() != null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;

		}
	}

	/**
	 * matches data with toMatch
	 * @param toMatch - string to match data with
	 * @return - true or false based on if data = toMatch
	 */
	public boolean isSame(String toMatch)
	{
		return data.equalsIgnoreCase(toMatch);
	}

	/**
	 * matches child with string
	 * @param toMatch - string to match with child data
	 * @return - matching child
	 */
	public Node whichChild(String toMatch)
	{
		try
		{
			if(toMatch.equalsIgnoreCase(left.getData())) // If Statement
			{
				return left;
			}
			else if(toMatch.equalsIgnoreCase(right.getData()))
			{
				return right;
			}
			else
			{
				return this;
			}
		}
		catch(Exception e)
		{
			System.out.println(toMatch);
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * gets type of data
	 * @return - data type
	 */
	public String getDataType()
	{
		return dataType;
	}

	/**
	 * set the data type
	 * @param dataType - new dataType
	 */
	public void setDataType(String dataType)
	{
		this.dataType = dataType;
	}

	/**
	 * prints the nodes of the current node
	 */
	public void printNodes()
	{
		if(left != null) // If Statement
		{
			println((getLevelOfTree() + 1) + left.getData());
			left.printNodes();
		}
		if(right != null)
		{
			println((getLevelOfTree() + 1) + right.getData());
			right.printNodes();
		}
	}

	/**
	 * @return - the levelOfTree
	 */
	public int getLevelOfTree()
	{
		return levelOfTree;
	}

	/**
	 * @param levelOfTree - the levelOfTree to set
	 */
	public void setLevelOfTree(int levelOfTree)
	{
		this.levelOfTree = levelOfTree;
	}

	/**
	 * counts the nodes
	 * @return - the number of nodes
	 */
	public int countNodes()
	{
		int leftCount = levelOfTree;
		int rightCount = levelOfTree;
		if(left != null) // If Statement
		{
			leftCount = left.countNodes();
		}
		else if(right != null)
		{
			rightCount = right.countNodes();
		}
		if(leftCount >= rightCount) // If Statement
		{
			return leftCount;
		}
		else
		{
			return rightCount;
		}
	}

	/**
	 * cycles through all nodes to help build the tree of the computer life
	 */
	public void cycleNodes()
	{
		String[] tree = binaryParent.getTree(); // Method That Returns Array
		String buffer = "    ";
		try
		{
			tree[levelOfTree] =
					tree[levelOfTree].concat(data + buffer);
			
			/*System.out.print(levelOfTree);
			System.out.print(tree.length);
			System.out.println("");
			System.out.println("");*/
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			/*System.out.print(levelOfTree);
			System.out.print(tree.length);
			System.out.println("");
			System.out.println("");*/
			String[] newTree = new String[tree.length + 2];
			for(int i = 0; i < tree.length; i ++)
			{
				newTree[i] = tree[i];
			}
			newTree[tree.length + 1] = "";
			binaryParent.setTree(newTree.clone());
			tree = binaryParent.getTree();
			//return;
		}
		catch(NullPointerException e)
		{
			/*System.out.print(data);
			System.out.print(tree[levelOfTree]);
			System.out.println("");
			System.out.println("");*/
			
			tree[levelOfTree] = data + buffer;
		}
				
		println(data);
		binaryParent.setTree(tree); // Method That Takes Array As Argument
		if(left != null) // If Statement
		{
			left.cycleNodes();
		}
		if(right != null) // If Statement
		{
			right.cycleNodes();
		}
	}
	
	public void printNodes(String toPrint)
	{
		toPrint += " -> " + data;
		
		
		if(right == null && left == null)
		{
			ArrayList<String> printTree = binaryParent.getPrintTree();
			printTree.add(toPrint);
			binaryParent.setPrintTree(printTree);
		}
		if(left != null) // If Statement
		{
			left.printNodes(toPrint);
		}
		if(right != null) // If Statement
		{
			right.printNodes(toPrint);
		}
	}

	/**
	 * @return the isRoot
	 */
	public Boolean getIsRoot()
	{
		return isRoot;
	}

	/**
	 * @param isRoot the isRoot to set
	 */
	public void setIsRoot(Boolean isRoot)
	{
		this.isRoot = isRoot;
	}
	
	/*public Node[] expandTree(Node[] tree)
	{
		Node[] newTree = new Node[tree.length + 1];
		for(int i = 0; i < tree.length; i ++)
		{
			newTree[i] = tree[i];
		}
		return newTree;
		
	}*/

}