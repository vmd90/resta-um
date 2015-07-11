package restaumtriangular;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Peg Solitaire init class
 *
 * @author 7152778
 */
public class PegSolitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int N = 5;
        char[][] states;

        // Caso nao haja argumento nenhum, cria um board padrao
        if (args.length == 0) {
            states = new char[N][N];
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    states[i][j] = Board.N;
                    for (int k = 0; k <= i; ++k) {
                        states[i][k] = Board.F;
                    }
                }
            }
            states[2][2] = Board.E;
        } else {
            try {
                /* passe como argumento um arquivo de texto com o board formado assim:
                 x
                 xx
                 xox
                 xxxx
                 xxxxx
                 Podendo ser maior em quantidade de linhas ('x' indica com pino e 'o' indica vazio)
                 */
                // lendo o arquivo
                try (Scanner sc = new Scanner(new File(args[0]))) {
                    // primeiro pega o numero de linhas
                    N = 0;
                    while (sc.hasNextLine()) {
                        sc.nextLine();
                        ++N;
                    }
                }

                states = new char[N][N];
                for (int i = 0; i < N; ++i) {
                    for (int j = 0; j < N; ++j) {
                        states[i][j] = Board.N;
                    }
                }
                int i = 0;
                try (Scanner sc = new Scanner(new File(args[0]))) {
                    // preenche a matriz de pinos
                    while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        for (int j = 0; j <= i; ++j) {
                            states[i][j] = line.charAt(j);
                        }
                        ++i;
                    }
                }
            } catch (FileNotFoundException ex) {
                System.err.println("Erro: arquivo '" + args[0] + "' nao encontrado.");
                return;
            }
        }

        GameTree gt = new GameTree(states); // default
        Search search = new DepthSearch(gt);
        search.doSearch();
    }

}
