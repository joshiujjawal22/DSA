import java.util.Scanner;
class sort {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b_s_array[]=new int[n];

		for(int i=0;i<n;i++)
		{
			b_s_array[i]=sc.nextInt(); //for bubble sort
		}
		int s_s_array[]=b_s_array.clone(); //for selection sort
		int i_s_array[]=b_s_array.clone(); //for insertion sort
		sort all_sort=new sort();  //Object : all_sort
		System.out.println("Bubble Sort");
		all_sort.bubble_sort(b_s_array);
		System.out.println("\nSelection Sort");
		all_sort.selection_sort(s_s_array);
		System.out.println("\nInsertion Sort");
		all_sort.selection_sort(i_s_array);


		

	}
	// Bubble Sort
		void bubble_sort(int a[]){
			int n=a.length;
				for(int i=0;i<n-1;i++)
				{
					for(int j=0;j<n-i-1;j++)
					{
						if(a[j]>a[j+1]) {
							int temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
				for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
			}

		// Selection Sort

		void selection_sort(int a[]){
			int n=a.length;
			for(int i=0;i<n-1;i++)
			{	int index=i;
				for(int j=i+1;j<n;j++)
				{
					if(a[j]<a[index]) index=j;
				}
				
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				
				}
				for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
				
			}

		// Insertion Sort

		void insertion_sort(int a[])
		{
			int n=a.length;
			for(int i=1;i<n;i++)
			{  
				int val=a[i];
				int j=i-1;
				while(j>=0 && a[j]>val){
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=val;
			}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		}



		// Merge Sort


		}





	
