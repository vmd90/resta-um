package restaumtriangular;

/**
 * Board class
 *
 * @author 8623778
 */
public class Board {

    // estados possiveis

    public static final char N = ' ';
    public static final char E = 'o';
    public static final char F = 'x';

    // state matrix
    private char[][] state;

    public char[][] getState() {
        return state;
    }

    public Board() {
        this(5);
    }

    public Board(char[][] states) {
        this.state = states;
    }

    public Board(int n) {
        state = new char[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                state[i][j] = N;
                for (int k = 0; k <= i; ++k) {
                    state[i][k] = E;
                }
            }
        }
        state[1][0] = state[2][0] = state[3][1] = F;
    }
    /**
     * Copia e gera um novo Board
     * @return novo Board objeto
     */
    public Board copy() {
        int dim = state[0].length;
        char[][] bstate = new char[dim][dim];
        for(int i = 0; i < dim; ++i)
            for(int j = 0; j < dim; ++j)
                bstate[i][j] = state[i][j];
        return new Board(bstate);
    }

    public void print() {
        int n = state[0].length;
        // printing triangle
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(state[i][j]);
            }
            System.out.println();
        }
    }
}
