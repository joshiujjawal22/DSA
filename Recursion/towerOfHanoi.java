

class towerOfHanoi 
{ 
    static int c=0;
    // Recursive function to solve Hanoi 
    static void towOfHan(int n, char from_rod, char to_rod, char aux_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        c++;
        towOfHan(n-1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towOfHan(n-1, aux_rod, to_rod, from_rod); 
    } 
      
    public static void main(String args[]) 
    { 
        int n = 10; // Number of disks 
        towOfHan(n, 'A', 'B', 'C');

        // Number of steps to move the disk
        System.out.println(c);
    } 
} 