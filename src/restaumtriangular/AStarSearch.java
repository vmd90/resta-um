
package restaumtriangular;

import java.util.PriorityQueue;

/**
 *
 * @author Victor
 */
public class AStarSearch implements Search {
    
    private GameTree gameTree;
    
    public AStarSearch(GameTree gt) {
        gameTree = gt;
    }

    @Override
    public void doSearch() {
        Node root = gameTree.getRoot();
        PriorityQueue<Node> frontier = new PriorityQueue<>();
        frontier.add(root);
    }
    
}
