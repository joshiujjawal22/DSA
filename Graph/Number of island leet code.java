
/*
*
* ------Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water 
* and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid 
* are all surrounded by water.-----

* Question from "Leet Code"

* 
*       Test Cases:

        Input:
        1 1 1 1 0
        1 1 0 1 0
        1 1 0 0 0
        0 0 0 0 0

        Output: 1
* 
        Input:
        1 1 1 1 0
        1 1 0 1 0
        1 1 0 0 1
        0 0 0 0 0

        Output: 2
*       
*
*   Solution:Using recursion     
*   [Graph(DFS,BFS,Union) Conceptual problem]
*/


import java.util.Scanner;


class Main{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        char grid[][] =new char[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                grid[i][j]=sc.next().charAt(0);

            Solution island=new Solution();
            System.out.println(island.numIslands(grid));
    }
}


class Solution {

    public int numIslands(char[][] grid) {
        
        
         int m = grid.length;
        if(m==0) return 0;
        int n = grid[0].length;
    int c=0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(grid[i][j]=='1'){
                c++;
                join(grid, i, j);
            }
        }
    }
 
    return c;
}
 
public void join(char[][] grid, int i, int j){

    int m=grid.length;
    int n=grid[0].length;
 
    if(i<0 || i>=m || j<0 || j>=n || grid[i][j]!='1')
        return;
 
    grid[i][j]='0';
 
    join(grid, i-1, j); 
    join(grid, i+1, j);
    join(grid, i, j-1);
    join(grid, i, j+1);
}
        
    }