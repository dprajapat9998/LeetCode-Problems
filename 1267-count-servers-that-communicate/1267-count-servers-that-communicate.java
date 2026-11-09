class Solution {
    public boolean iscomunicate(int grid[][],int i,int j){
        grid[i][j]=-1;
        for(int k=0;k<grid.length;k++){
            if(grid[k][j]==1){
                grid[i][j]=1;
                return true;
            }
        }
        for(int k=0;k<grid[0].length;k++){
            if(grid[i][k]==1){
                grid[i][j]=1;
                return true;
            }
        }
        return false;
    }
    public int countServers(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && iscomunicate(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
}