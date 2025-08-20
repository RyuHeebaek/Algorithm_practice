import java.io.*;
import java.util.*;

public class Main {

    static int[][] board = new int[9][9];
    static int[] rowMask = new int[9], colMask = new int[9], boxMask = new int[9];
    static List<int[]> blanks = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int r = 0; r < 9; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 9; c++) {
                int v = Integer.parseInt(st.nextToken());
                board[r][c] = v;
                if (v == 0) {
                    blanks.add(new int[]{r, c});
                } else {
                    int bit = 1 << v;
                    rowMask[r] |= bit;
                    colMask[c] |= bit;
                    boxMask[boxIdx(r, c)] |= bit;
                }
            }
        }
        dfs();
    }

    static boolean dfs() {
        if (blanks.isEmpty()) {
            printBoard();
            return true;
        }

        int bestIdx = -1, bestCount = 10, bestCand = 0;
        for (int i = 0; i < blanks.size(); i++) {
            int r = blanks.get(i)[0], c = blanks.get(i)[1];
            int cand = candidates(r,c);
            int cnt = Integer.bitCount(cand);
            if (cnt == 0) return false;
            if (cnt < bestCount) {
                bestCount = cnt;
                bestIdx = i;
                bestCand = cand;
                if (cnt == 1) break;
            }
        }

        int[] cell = blanks.remove(bestIdx);
        int r = cell[0], c = cell[1];
        int b = boxIdx(r, c);

        int cand = bestCand;
        while (cand != 0) {
            int bit = cand & -cand;
            int v = Integer.numberOfTrailingZeros(bit);

            board[r][c] = v;
            rowMask[r] ^= bit;
            colMask[c] ^= bit;
            boxMask[b] ^= bit;

            if (dfs()) return true;

            rowMask[r] ^= bit;
            colMask[c] ^= bit;
            boxMask[b] ^= bit;
            board[r][c] = 0;

            cand -= bit;

        }

        blanks.add(bestIdx, cell);
        return false;

    }

    static int candidates(int r, int c) {
        int used = rowMask[r] | colMask[c] | boxMask[boxIdx(r, c)];
        return (~used) & 0x3FE; // 비트 1~9만 남김
    }

    static int boxIdx(int r, int c) {
        return (r / 3) * 3 + (c / 3);
    }

    static void printBoard() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                sb.append(board[r][c]);
                if (c < 8) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);

    }
}
