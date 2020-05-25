class minheap_deletion
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
    while (heap[(curr-1) / 2] > val) 
    {

      // Swapping

      int temp=heap[curr];
      heap[curr] = heap[(curr-1) / 2];
      heap[(curr-1) / 2]=temp;

      curr = (curr-1) / 2;
    }

  }

  static void delete(){
    heap[0]=heap[heapSize--];
    int curr=0;

    // Swapping of value according to greater value
    // Below process is called heapify
    while(curr*2+1<=heapSize || curr*2+2<=heapSize) 
    {
        
        if(heap[curr*2+1]<=heap[curr*2+2] && heap[curr*2+1]<heap[curr]){
            int temp=heap[curr];
            heap[curr] = heap[curr*2+1];
            heap[curr*2+1]=temp;
            curr=curr*2+1;
            continue;
        }

        else if(heap[curr*2+2]<heap[curr*2+1] && heap[curr*2+2]<heap[curr]){
            int temp=heap[curr];
            heap[curr] = heap[curr*2+2];
            heap[curr*2+2]=temp;
            curr=curr*2+2;
            continue;
        }
        else break;
     
     }       
  }

  // To get minimum value in min-heap
  static int getmin(){
    return heap[0];
  }


   public static void main(String ab[]) 
  {
    int i;
    insert(10);
    insert(5);
    insert(15);
    System.out.println("Heap array after inserting 10, 5, 15 elements : ");
    for (i = 0; i < heapSize+1; i++)
      System.out.print(heap[i]+" ");
   System.out.println();

   System.out.println("Maximum value in min Heap is : "+ getmin());


    delete();
    System.out.println("Heap array after deletion :");
    for (i = 0; i < heapSize+1; i++)
      System.out.print(heap[i]+" ");
   System.out.println();

    
    insert(4);
    System.out.println("Heap array after inserting 4 : ");
    for (i = 0; i < heapSize+1; i++)
      System.out.print(heap[i]+" ");
    System.out.println();

    System.out.println("Maximum value in min Heap is : "+ getmin());
}

}