

package restaumtriangular;

/**
 * GameTree class assembles a game tree of possible movement
 * @author Victor
 */
public class GameTree {
    // root node
    private Node root;
    
    public GameTree() {
        root = new Node();
    }
    
    public GameTree(Node n) {
        root = n;
    }
    /**
     * Create a game tree with first state matrix
     * @param states state matrix
     */
    public GameTree(char[][] states) {
        root = new Node(new Board(states));
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public void add(Node n) {
        
    }
}
