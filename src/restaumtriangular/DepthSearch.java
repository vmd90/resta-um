

package restaumtriangular;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Busca em profundidade
 * @author Victor
 */
public class DepthSearch implements Search {
    
    private GameTree gameTree;
    
    public DepthSearch(GameTree gt) {
        gameTree = gt;
    }

    @Override
    public void doSearch() {
        ArrayList<Node> list = new ArrayList<>(); // nos visitados
        Stack<Node> stack = new Stack<>();
        Node root = gameTree.getRoot();
        stack.push(root);
        while(!stack.empty()) {
            System.out.println("Pilha:-------------------------");
            Iterator<Node> it2 = stack.iterator();
            while(it2.hasNext()) {
                it2.next().getBoard().print();
            }
            System.out.println("---------------------------:");
            Node t = stack.pop();
            list.add(t);
            if( Movement.getPins(t) == 1 ){
                System.out.println("SOLUCAO ENCONTRADA.");
                Iterator<Node> it = list.iterator();
                while(it.hasNext()) {
                    it.next().getBoard().print();
                }
                return;
            }
            
            ArrayList<Node> mov = Movement.getMovements(t);
            System.out.println("Opcoes de movimento: " + mov.size());
            if(mov.isEmpty() && stack.empty()) { // sem movimentos possiveis
                break;
            }
            
            // Existem movimentos entao empilha e comeca de novo
            for(Node node : mov) {
                System.out.println("Numero de pins: "+ Movement.getPins(node));
                stack.push(node);
            }
        }
        System.out.println("SOLUCAO NAO ENCONTRADA!");
//        Iterator<Node> it = list.iterator();
//        while(it.hasNext()) {
//            it.next().getBoard().print();
//        }
    }
    
}
