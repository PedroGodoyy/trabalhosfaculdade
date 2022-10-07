import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int B[] = gerar(new int[5], 'B');
        int I[] = gerar(new int[5], 'I');
        int N[] = gerar(new int[5], 'N');
        int G[] = gerar(new int[5], 'G');
        int O[] = gerar(new int[5], 'O');
        int matrix[][] = new int[5][5];
        N[2] = 99;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                switch (i){
                    case 0:
                        matrix[j][i] = B[j];
                        break;
                    case 1:
                        matrix[j][i] = I[j];
                        break;
                    case 2:
                        matrix[j][i] = N[j];
                        break;
                    case 3:
                        matrix[j][i] = G[j];
                        break;
                    case 4:
                        matrix[j][i] = O[j];
                        break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%2d]", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] gerar(int num[], char letra){
        int count = 0;
        boolean repetido = false;
        do {
            Random random = new Random();
            boolean tem = false;
            int gerado = 0;
            switch (letra){
                case 'B':
                    gerado = random.nextInt(15)+1;
                    break;
                case 'I':
                    gerado = random.nextInt(15)+1+15;
                    break;
                case 'N':
                    gerado = random.nextInt(15)+1+30;
                    break;
                case 'G':
                    gerado = random.nextInt(15)+1+45;
                    break;
                case 'O':
                    gerado = random.nextInt(15)+1+60;
                    break;
            }
            for (int i = 0; i < count; i++) {
                if (num[i] == gerado){
                    tem = true;
                    break;
                }
            }
            if(tem)continue;
            num[count] = gerado;
            count++;
        }while(count < 5 );
        return num;
    }
}