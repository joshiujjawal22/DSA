import java.util.*;

class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();	//Size of row
int n=sc.nextInt(); //Size of column
char a[][]=new char[m][n]; 

for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		a[i][j]=sc.next().charAt(0);
	}
}

Solution sol=new Solution();

System.out.println( sol.numIslands(a));
}
}

// To find number Island:
class Solution {
    public int numIslands(char grid[][]) {
    	
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
