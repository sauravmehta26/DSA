import java.util.*;
class MatrixSetZeros{
    static ArrayList<ArrayList<Integer>> setZeros(ArrayList<ArrayList<Integer>> matrix,int m,int n){
        // create the extra rows and col to mark the zeroes by one 
        int[] row= new int[m];
        int[] col= new int[n];
        // Initialize row and col arrays to track which rows and columns need to be set to zero
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        // Set the rows to zero
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(row[i]==1 || col[j]==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix =new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int m = matrix.size();
        int n = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> result = setZeros(matrix, m, n);
        for (ArrayList<Integer> row : result) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}