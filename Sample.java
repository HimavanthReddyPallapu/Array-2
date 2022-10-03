// Time Complexity : O(mxn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class Solution {
    int m,n;
    public void gameOfLife(int[][] board) {
        //base condition
        
        if(board==null || board.length==0)
        {
            return;
        }
        
        m=board.length;
        n=board[0].length;
        
        //1-->0 set 2
        //0-->1 set 3
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                //count the number of live neighbors
                int liveNeighbors= countLiveNeighbors(board,i,j);
                
             // cell is live
                if(board[i][j]==1)
                {
                    if(liveNeighbors<2 || liveNeighbors>3)
                    {
                        board[i][j]=2;
                    }
                        
                }
                //cell is dead
                else
                {
                   if(liveNeighbors==3)
                   {
                       board[i][j]=3;
                   }
                }
            }
            
        }
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(board[i][j]==3)
                    {
                        board[i][j]=1;
                    }
                    else if(board[i][j]==2)
                    {
                        board[i][j]=0;
                    }
                }
            }
    }
    
    private int countLiveNeighbors(int[][] board,int i, int j)
    {
        int[][] dirs={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
        int count=0;
        for(int[] dir: dirs)
        {
            int nr=i+dir[0];
            int nc=j+dir[1];
            
            if(nr>=0 && nc>=0 && nr<m && nc<n && (board[nr][nc]==1 || board[nr][nc]==2))
            {
                count++;
            }
        }
        return count;
    }
}
