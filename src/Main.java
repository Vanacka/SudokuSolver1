public class Main {
    public static void main(String[] args) {
        int [][] arr = {
                { 5, 0, 4, 0, 0, 0, 9, 0, 0 },
                { 0, 7, 0, 1, 9, 0, 0, 0, 8 },
                { 1, 0, 0, 3, 0, 0, 5, 0, 0 },
                { 8, 0, 9, 0, 0, 0, 0, 2, 0 },
                { 0, 2, 0, 0, 0, 0, 7, 0, 1 },
                { 0, 1, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 1, 5, 0, 7, 0, 8, 0 },
                { 0, 8, 0, 4, 0, 0, 6, 0, 5 },
                { 3, 0, 5, 0, 0, 0, 1, 0, 9 }
    };
        SudokuSolver ss = new SudokuSolver(arr);
        ss.print();
    }
}