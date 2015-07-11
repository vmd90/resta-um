package restaumtriangular;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * 1. Calcula quantos movimentos possiveis no node atual (node dado) 2. Retorna
 * o numero de pinos que ainda estao no tabuleiro 3. Retorna os pinos que podem
 * se mover e seus destinos finais
 *
 * @author Victor
 */
public class Movement {

    public Movement() {
    }

    /**
     * Retorna uma lista dos pontos que ocorrem possiveis movimentos
     *
     * @param n no atual
     * @return uma lista dos pontos que ocorrem possiveis movimentos
     */
    public static ArrayList<Integer[]> getMoves(Node n) {
        ArrayList<Integer[]> moves = new ArrayList<>(); // movimentos possiveis
        char[][] s = n.getBoard().getState();
        int dim = s[1].length; // dimensao do board
        Integer[] m = new Integer[6]; // 6 coordenadas de pontos
        for (int y = 0; y < dim; ++y) {
            for (int x = 0; x <= y; ++x) {
                if (s[y][x] == Board.F) {
                    //Up
                    if ((y - 2) >= 0) {
                        if (s[(y - 2)][x] == Board.E) {
                            if (s[(y - 1)][x] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x;
                                m[3] = y - 1;
                                m[4] = x;
                                m[5] = y - 2;
                                moves.add(m);
//                                if (moves.isEmpty()) {
//                                    moves.add(m);
//                                }
//                                for (Integer[] f : moves) {
//                                    for (int v = 0; v <= 5; v++) {
//                                        System.out.print(f[v]);
//                                    }
//                                    System.out.println(" ");
//                                    if (!Objects.equals(f[0], m[0]) || !Objects.equals(f[1], m[1]) || !Objects.equals(f[2], m[2])
//                                            || !Objects.equals(f[3], m[3]) || !Objects.equals(f[4], m[4]) || !Objects.equals(f[5], m[5])) {
//                                        moves.add(m);
//                                    }
//                                }
                            }
                        }
                    }

                    //Right
                    if ((x + 2) < dim) {
                        if (s[y][x + 2] == Board.E) {
                            if (s[y][x + 1] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x + 1;
                                m[3] = y;
                                m[4] = x + 2;
                                m[5] = y;
                                moves.add(m);
//                                if (moves.isEmpty()) {
//                                    moves.add(m);
//                                }
//                                for (Integer[] f : moves) {
//                                    for (int v = 0; v <= 5; v++) {
//                                        System.out.print(f[v]);
//                                    }
//                                    System.out.println(" ");
//                                    if (!Objects.equals(f[0], m[0]) || !Objects.equals(f[1], m[1]) || !Objects.equals(f[2], m[2])
//                                            || !Objects.equals(f[3], m[3]) || !Objects.equals(f[4], m[4]) || !Objects.equals(f[5], m[5])) {
//                                        moves.add(m);
//                                    }
//                                }
                            }
                        }
                    }
                    //Down_Right
                    if ((y + 2) < dim) {
                        if ((x + 2) < dim) {
                            if (s[(y + 2)][x + 2] == Board.E) {
                                if (s[(y + 1)][x + 1] == Board.F) {
                                    m[0] = x;
                                    m[1] = y;
                                    m[2] = x + 1;
                                    m[3] = y + 1;
                                    m[4] = x + 2;
                                    m[5] = y + 2;
                                    moves.add(m);
//                                    if (moves.isEmpty()) {
//                                        moves.add(m);
//                                    }
//                                    for (Integer[] f : moves) {
//                                        for (int v = 0; v <= 5; v++) {
//                                            System.out.print(f[v]);
//                                        }
//                                        System.out.println(" ");
//                                        if (!Objects.equals(f[0], m[0]) || !Objects.equals(f[1], m[1]) || !Objects.equals(f[2], m[2])
//                                                || !Objects.equals(f[3], m[3]) || !Objects.equals(f[4], m[4]) || !Objects.equals(f[5], m[5])) {
//                                            moves.add(m);
//                                        }
//                                    }
                                }
                            }
                        }
                    }
                    //Down
                    if ((y + 2) < dim) {
                        if (s[(y + 2)][x] == Board.E) {
                            if (s[(y + 1)][x] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x;
                                m[3] = y + 1;
                                m[4] = x;
                                m[5] = y + 2;
                                moves.add(m);
//                                if (moves.isEmpty()) {
//                                    moves.add(m);
//                                }
//                                for (Integer[] f : moves) {
//                                    for (int v = 0; v <= 5; v++) {
//                                        System.out.print(f[v]);
//                                    }
//                                    System.out.println(" ");
//                                    if (!Objects.equals(f[0], m[0]) || !Objects.equals(f[1], m[1]) || !Objects.equals(f[2], m[2])
//                                            || !Objects.equals(f[3], m[3]) || !Objects.equals(f[4], m[4]) || !Objects.equals(f[5], m[5])) {
//                                        moves.add(m);
//                                    }
//                                }
                            }
                        }
                    }
                    //Left
                    if ((x - 2) >= 0) {
                        if (s[y][x - 2] == Board.E) {
                            if (s[y][x - 1] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x - 1;
                                m[3] = y;
                                m[4] = x - 2;
                                m[5] = y;
                                moves.add(m);
//                                if (moves.isEmpty()) {
//                                    moves.add(m);
//                                }
//                                for (Integer[] f : moves) {
//                                    for (int v = 0; v <= 5; v++) {
//                                        System.out.print(f[v]);
//                                    }
//                                    System.out.println(" ");
//                                    if (!Objects.equals(f[0], m[0]) || !Objects.equals(f[1], m[1]) || !Objects.equals(f[2], m[2])
//                                            || !Objects.equals(f[3], m[3]) || !Objects.equals(f[4], m[4]) || !Objects.equals(f[5], m[5])) {
//                                        moves.add(m);
//                                    }
//                                }
                            }
                        }
                    }
                    //Up_Left
                    if ((y - 2) >= 0) {
                        if ((x - 2) >= 0) {
                            if (s[y - 2][x - 2] == Board.E) {
                                if (s[y - 1][x - 1] == Board.F) {
                                    m[0] = x;
                                    m[1] = y;
                                    m[2] = x - 1;
                                    m[3] = y - 1;
                                    m[4] = x - 2;
                                    m[5] = y - 2;
//                                    if (moves.isEmpty()) {
//                                        moves.add(m);
//                                    }
                                    moves.add(m);
//                                    for (Integer[] f : moves) {
//                                        for (int v = 0; v <= 5; v++) {
//                                            System.out.print(f[v]);
//                                        }
//                                        System.out.println(" ");
//                                        if (!Objects.equals(f[0], m[0]) || !Objects.equals(f[1], m[1]) || !Objects.equals(f[2], m[2])
//                                                || !Objects.equals(f[3], m[3]) || !Objects.equals(f[4], m[4]) || !Objects.equals(f[5], m[5])) {
//                                            moves.add(m);
//                                        }
//                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        return moves;

    }

    /**
     * Retorna uma lista dos pontos
     *
     * @param n
     * @return
     */
    public static ArrayList<Node> getMovements(Node n) {
        ArrayList<Node> moves = new ArrayList<>();
        char[][] s = n.getBoard().getState();
        int dim = s[0].length;
        int[] m = new int[6]; // 6 coordenadas dos pontos (inicial, meio, final) para um possivel movimento
        for (int y = 0; y < dim; ++y) {
            for (int x = 0; x <= y; ++x) {
                
                if (s[y][x] == Board.F) { // checa se nessa posicao existe um pino

                    //Up
                    if ((y - 2) >= 0) {
                        if (s[(y - 2)][x] == Board.E) {
                            if (s[(y - 1)][x] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x;
                                m[3] = y - 1;
                                m[4] = x;
                                m[5] = y - 2;
                                Node node = new Node(n.getBoard());
                                node.getBoard().getState()[m[1]][m[0]] = Board.E; // ponto inicial
                                node.getBoard().getState()[m[3]][m[2]] = Board.E; // ponto do meio
                                node.getBoard().getState()[m[5]][m[4]] = Board.F; // ponto final
                                if (moves.isEmpty() || !moves.contains(node)) {
                                    moves.add(node);
                                }
                            }
                        }
                    }

                    //Right
                    if ((x + 2) < dim) {
                        if (s[y][x + 2] == Board.E) {
                            if (s[y][x + 1] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x + 1;
                                m[3] = y;
                                m[4] = x + 2;
                                m[5] = y;
                                Node node = new Node(n.getBoard());
                                node.getBoard().getState()[m[1]][m[0]] = Board.E; // ponto inicial
                                node.getBoard().getState()[m[3]][m[2]] = Board.E; // ponto do meio
                                node.getBoard().getState()[m[5]][m[4]] = Board.F; // ponto final
                                if (moves.isEmpty() || !moves.contains(node)) {
                                    moves.add(node);
                                }
                            }
                        }
                    }
                    //Down_Right
                    if ((y + 2) < dim) {
                        if ((x + 2) < dim) {
                            if (s[(y + 2)][x + 2] == Board.E) {
                                if (s[(y + 1)][x + 1] == Board.F) {
                                    m[0] = x;
                                    m[1] = y;
                                    m[2] = x + 1;
                                    m[3] = y + 1;
                                    m[4] = x + 2;
                                    m[5] = y + 2;
                                    Node node = new Node(n.getBoard());
                                    node.getBoard().getState()[m[1]][m[0]] = Board.E; // ponto inicial
                                    node.getBoard().getState()[m[3]][m[2]] = Board.E; // ponto do meio
                                    node.getBoard().getState()[m[5]][m[4]] = Board.F; // ponto final
                                    if (moves.isEmpty() || !moves.contains(node)) {
                                        moves.add(node);
                                    }
                                }
                            }
                        }
                    }
                    //Down
                    if ((y + 2) < dim) {
                        if (s[(y + 2)][x] == Board.E) {
                            if (s[(y + 1)][x] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x;
                                m[3] = y + 1;
                                m[4] = x;
                                m[5] = y + 2;
                                Node node = new Node(n.getBoard());
                                node.getBoard().getState()[m[1]][m[0]] = Board.E; // ponto inicial
                                node.getBoard().getState()[m[3]][m[2]] = Board.E; // ponto do meio
                                node.getBoard().getState()[m[5]][m[4]] = Board.F; // ponto final
                                if (moves.isEmpty() || !moves.contains(node)) {
                                    moves.add(node);
                                }
                            }
                        }
                    }
                    //Left
                    if ((x - 2) >= 0) {
                        if (s[y][x - 2] == Board.E) {
                            if (s[y][x - 1] == Board.F) {
                                m[0] = x;
                                m[1] = y;
                                m[2] = x - 1;
                                m[3] = y;
                                m[4] = x - 2;
                                m[5] = y;
                                Node node = new Node(n.getBoard());
                                node.getBoard().getState()[m[1]][m[0]] = Board.E; // ponto inicial
                                node.getBoard().getState()[m[3]][m[2]] = Board.E; // ponto do meio
                                node.getBoard().getState()[m[5]][m[4]] = Board.F; // ponto final
                                if (moves.isEmpty() || !moves.contains(node)) {
                                    moves.add(node);
                                }
                            }
                        }
                    }
                    //Up_Left
                    if ((y - 2) >= 0) {
                        if ((x - 2) >= 0) {
                            if (s[y - 2][x - 2] == Board.E) {
                                if (s[y - 1][x - 1] == Board.F) {
                                    m[0] = x;
                                    m[1] = y;
                                    m[2] = x - 1;
                                    m[3] = y - 1;
                                    m[4] = x - 2;
                                    m[5] = y - 2;
                                    Node node = new Node(n.getBoard());
                                    node.getBoard().getState()[m[1]][m[0]] = Board.E; // ponto inicial
                                    node.getBoard().getState()[m[3]][m[2]] = Board.E; // ponto do meio
                                    node.getBoard().getState()[m[5]][m[4]] = Board.F; // ponto final
                                    if (moves.isEmpty() || !moves.contains(node)) {
                                        moves.add(node);
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        return moves;
    }

    /**
     * Retorna o numero de pinos restantes do no atual
     *
     * @param n no atual
     * @return numero de pinos restantes
     */
    public static int getPins(Node n) {
        Board b = n.getBoard();
        char s[][] = b.getState();
        int dim = s[0].length;
        int m = 0;
        for (int y = 0; y < dim; ++y) {
            for (int x = 0; x <= y; ++x) {
                if (s[y][x] == Board.F) {
                    m++;
                }
            }
        }
        return m;
    }

}
