
public class NumberOfIslands {

	public static void main(String[] args) {
		
		
  int [][]input=new int [][]{{1,1,0},
	                         {1,1,0},
	                         {0,0,1},
	                         {0,1,0}
	                       };
	                int sum=0;       
	                      for(int i=0;i<input.length;i++) {
	                    	  for(int j=0;j<input[0].length;j++) {
	                    		  
	                    		  
	                    		  if(input[i][j]==1) {
	                    			  
	                    			 sum++;
	                    			 
	                    			 
	                    			  
	                    			  numOfIslands(input, i, j);
	                    			  
	                    			  
	                    		  }
	                    		  
	                    		  
	                    		  
	                    	  }
	                    	  
	                    	
	                    	  
	                    	  
	                      } 
	                       
	                       

  
	                      System.out.println(sum);
  
}
	
	
private static void numOfIslands(int [][]input,int i , int j) {
	
	if(i<0||i>input.length-1||j<0||j>input[i].length-1||input[i][j]==0) {
		return;
		
		
		
	}
	input[i][j]=0;
	
	
	numOfIslands(input, i, j-1);
	numOfIslands(input, i-1, j);
	numOfIslands(input, i, j+1);
	numOfIslands(input, i+1, j);
}
	
}