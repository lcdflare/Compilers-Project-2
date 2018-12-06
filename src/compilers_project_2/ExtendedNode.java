package compilers_project_2;


public class ExtendedNode extends SimpleNode {
	public ExtendedNode(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public ExtendedNode(MyNewGrammar p, int i) {
		super(p, i);
		// TODO Auto-generated constructor stub
	}
	
	public void dump(String prefix) {
	    System.out.println(toString(prefix));
	    if (children != null) {
	      for (int i = 0; i < children.length; ++i) {
	        ExtendedNode n = (ExtendedNode)children[i];
	        if (n != null) {
	          n.dump(prefix + "->");
	        }
	      }
	    }
	  }
	
	public void printStackFormat() {
		//There's a child
		if (children != null) {
			// Only one child
			if (children.length == 1) {
				System.out.print(toString() + " ");
				ExtendedNode n = (ExtendedNode)children[0];
				n.printStackFormat();
			}
			// More than one child
			else {
				for(int i = 0; i < children.length; ++i) {
					System.out.println();
					ExtendedNode n = (ExtendedNode)children[i];
			        if (n != null) {
			          n.printStackFormat();
			          System.out.print("->");
				}	
				}
			}
		}
	}
}
