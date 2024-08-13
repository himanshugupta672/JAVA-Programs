class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int temp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    solve(temp,i,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=temp[i][j];
            }
        }

    }
    public void solve(int temp[][],int r,int c){
        int n = temp.length;
        int m = temp[0].length;
        for(int i=0;i<n;i++){
            temp[i][c] =0;
        }
        for(int j=0;j<m;j++){
            temp[r][j] = 0;
        }
    }
}