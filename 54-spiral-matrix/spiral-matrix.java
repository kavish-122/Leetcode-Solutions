class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int rigth = n-1;
        int bottom = m-1;
        int left = 0;
        int top = 0;
        while(left<=rigth && top<=bottom){
            // for rigth
            for(int i=left; i<=rigth; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][rigth]); 
            }
            rigth--;
            if(top<=bottom){
                for(int i=rigth; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=rigth){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}