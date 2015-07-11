
package restaumtriangular;

import java.util.ArrayList;

/**
 * Node class used to store the whole board matrix
 * @author Victor
 */
public class Node {
    private Board board;
    // list of possible moves
    private ArrayList<Node> nodes;
    // possible movements in the board
    //private Node up, down, left, right, up_left, down_right;
    
    public Node() {
        board = new Board();
        nodes = new ArrayList<>();
    }
    
    public Node(Node n) {
        board = n.board;
        nodes = n.nodes;
    }
    
    public Node(int dimBoard) {
        board = new Board(dimBoard);
        nodes = new ArrayList<>();
    }
    
    public Node(Board b) {
        board = b.copy();
        nodes = new ArrayList<>();
    }
    
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
    public void addNode(Node n) {
        nodes.add(n);
    }
    
    @Override
    public boolean equals(Object o) {
        Node n = (Node)o;
        return checkNodes(this, n);
    }
    
    /**
     * Verifica se dois nos sao iguais
     * @param n1 no 1
     * @param n2 no 2
     * @return true se dois nos sao iguais, false caso contrario
     */
    private boolean checkNodes(Node n1, Node n2) {
        char[][] s1 = n1.getBoard().getState();
        char[][] s2 = n2.getBoard().getState();
        int dim = s1[0].length;
        for(int i = 0; i < dim; ++i) {
            for(int j = 0; j <= i; ++j) {
                if(s1[i][j] != s2[i][j])
                    return false;
            }
        }
        return true;
    }
}
