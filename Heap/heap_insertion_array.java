class heapusingarray_insertion
{
  static int heap[]=new int[100];
  static int heapSize = -1;
  static void insert(int val) 
  {
    heapSize++;
    heap[heapSize] = val; /*Insert in the last place*/
    int curr = heapSize;
    while (heap[(curr-1) / 2] > val) 
    {
      heap[curr] = heap[(curr-1) / 2];
      curr = (curr-1) / 2;
    }
    heap[curr] = val;
  }

   public static void main(String ab[]) 
  {
    int i;
    insert(10);
    insert(40);
    insert(15);

    System.out.println("Heap array after inserting 10, 50, 15 elements : ");
    for (i = 0; i < 3; i++)
      System.out.print(heap[i]+" ");
   System.out.println();
    insert(30);
    System.out.println("Heap array after inserting 10, 50, 15, 30 elements : ");
    for (i = 0; i < 4; i++)
      System.out.print(heap[i]+" ");
}
}