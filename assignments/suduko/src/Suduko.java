public class Suduko {
    public static void main(String[] args) {
        int size = 9;
        int[][] currentBoard = {
                {1, 2, 3, 4, 5, 4, 3, 4, 8},
                {1, 2, 6, 4, 5, 4, 3, 4, 8},
                {1, 2, 3, 4, 5, 4, 3, 4, 8},
                {1, 2, 3, 4, 5, 4, 3, 4, 8},
                {1, 2, 3, 4, 5, 4, 3, 4, 8},
                {1, 2, 3, 4, 5, 4, 3, 4, 8},
                {1, 2, 3, 4, 5, 4, 3, 4, 8},
                {1, 2, 3, 4, 5, 0, 3, 4, 8},
                {1, 2, 2, 4, 5, 4, 3, 4, 8}
        };


    }
    public static booleean numRow(int[][] b, int row, int number){
        for(int i=0;i<size;i++){
            if(b[row][i]==number){
                return true;
            }
            return false;
        }
    }

    public static booleean numRow(int[][] b, int col, int number){
        for(int i=0;i<size;i++){
            if(b[i][col]==number){
                return true;
            }
            return false;
        }
    }
}
