package Arrays;

public class TwoDiamentionalArrays {
	
	
	
	public static void main(String[] args) {
		
//	int [][] arr=new int [3][4];
//	
//	
//	arr[0][0]=5;
//	arr[0][1]=6;
//	arr[0][2]=9;
//	arr[0][3]=7;
//	
//	arr[1][0]=6;
//	arr[1][1]=4;
//	arr[1][2]=2;
//	arr[1][3]=1;
//	
//	arr[2][0]=56;
//	arr[2][1]=34;
//	arr[2][2]=12;
//	arr[2][3]=21;
//	
		
		
		
		int [][] arr= {{1,2,4,5},{3,5,7,8},{2,3,1,5}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0 ; j<arr[i].length ;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			
			System.out.println();
		}

	

}
}