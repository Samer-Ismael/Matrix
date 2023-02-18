import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] matrix = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,1},
                {0,0,0,0,0},
                {0,0,0,0,0}};

        int answer = 0;
        for (int x = 0; x < matrix.length; x++) {

            if (matrix[0][x] == 1 || matrix[4][x] == 1) {
                answer += 2;
            }
            if (matrix[1][x] == 1 || matrix[3][x] == 1 ) {
                answer++;
            }
        }
        for (int y = 0; y < matrix.length; y++) {

            if (matrix[y][0] == 1 || matrix[y][4] == 1 ) {
                answer += 2;
            }
            if (matrix[y][3] == 1 || matrix[y][1] == 1 ) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
