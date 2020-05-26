import java.util.*;

class heapsort{
	static int heap[]={80,11,25,79,8,32,41};
	static int heapSize=-1;

	public static void main(String args[]){

		for(int i=0;i<heap.length;i++)
		{
			build_maxHeap(heap[i]);
		}
		System.out.println(Arrays.toString(heap));

		// Heapify the heap until heapSize is greater than 0.
		while(heapSize>0)
		{
			heapify();
		}

		System.out.println(Arrays.toString(heap));
		
	}
		// Building of maxHeap
		// Convert array to max-heap
	static void build_maxHeap(int val){
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

	// Swap last element from first element and again convert array into max-heap again .
	// Until heapSize is greater than 0.

	static void heapify(){
		int temp=heap[0];
		heap[0]=heap[heapSize];
		heap[heapSize]=temp;
		heapSize--;
		int curr=0;

		while(curr*2+1<=heapSize || curr*2+2<=heapSize) 
    {
        if(curr*2+2<=heapSize){
                if(heap[curr*2+1]>=heap[curr*2+2] && heap[curr*2+1]>heap[curr]){
                    temp=heap[curr];
                    heap[curr] = heap[curr*2+1];
                    heap[curr*2+1]=temp;
                    curr=curr*2+1;
                    continue;
                }
        
                else if(heap[curr*2+2]>heap[curr*2+1] && heap[curr*2+2]>heap[curr]){
                    temp=heap[curr];
                    heap[curr] = heap[curr*2+2];
                    heap[curr*2+2]=temp;
                    curr=curr*2+2;
                    continue;
                }
                else break;
             
        } 

        else{
        	if(heap[curr*2+1]>heap[curr]){
                    temp=heap[curr];
                    heap[curr] = heap[curr*2+1];
                    heap[curr*2+1]=temp;
                    curr=curr*2+1;
                    continue;
                }
        
                
                else break;
        }

            }       
	}	
}