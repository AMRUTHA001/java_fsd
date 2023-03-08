package array;

public class count {

	public static void main(String[] args) {
		int arr[]= {4,-4,6,8,-9,0,4,-7,56};
		int p=0;
		int n=0;
	
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			if(arr[i]>0) {
				p=p+1;
			}
				else
				{
					n=n+1;
				}
			
		}
			System.out.println("positive"+p);
			System.out.println("negative"+n);
			
				
			
			
		}
		
		// TODO Auto-generated method stub

	}


