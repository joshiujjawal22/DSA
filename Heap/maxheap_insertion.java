class maxheapusing_insertion
{
  // Declaration of Heap
  static int heap[]=new int[100];
  static int heapSize = -1;
  
  // Insertion 
  static void insert(int val) 
  {
    heapSize++;
    heap[heapSize] = val; /*Insert in the last place*/
    int curr = heapSize;
    while (heap[(curr-1) / 2] < val) 
    {
      // Swapping

      int temp=heap[curr];
      heap[curr] = heap[(curr-1) / 2];
      heap[(curr-1) / 2]=temp;

      curr = (curr-1) / 2;
    }
    
  }

   public static void main(String args[]) 
  {

    int i;
    insert(10);
    insert(40);
    insert(15);

    System.out.println("Heap array after inserting 10, 40, 15 elements : ");
    for (i = 0; i < 3; i++)
      System.out.print(heap[i]+" ");
   System.out.println();
    insert(20);
    System.out.println("Heap array after inserting 10, 40, 15, 20 elements : ");
    for (i = 0; i < 4; i++)
      System.out.print(heap[i]+" ");
}
}