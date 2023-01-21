	/*Question 2*/
	private static int f (int[]a, int low, int high)
	{
		int res = 0;
		for (int i=low; i<=high; i++)
			res += a[i];
		return res;
	}
	
	/***************************************
	 * A. What does the what method do?
	 * The method goes cell by cell and calculates the value of the cells if the array is divisible by 2 without a remainder.
	 * 
	 * B. Time and place complications
	 * O(n^2) time complexity
	 * Complications where the code is long and inefficient
	 ***************************************/
	public static int what (int []a)
	{
		int temp = 0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i; j<a.length; j++)
			{
				int c = f(a, i, j);
				if (c%2 == 0)
				{
					if (j-i+1 > temp)
						temp = j-i+1;
				}
			}
		}
		return temp;
	}
	
	
	/***************************************
	 * C. Writing code that suits efficiency
	 * As you noticed I dropped the (F) function to optimize the code as much as possible
	 * 
	 * D.Now what are the complications?
	 * The time complexity is O(n)
	 ***************************************/
	public static int what(int[] a) {
	    int maxLength = 0; // Maximum array
	    int currentSum = 0; // current amount
	    int start = 0; // start
	    
	    //A loop that ran from position 0 to the end of the array
	    for (int i = 0; i < a.length; i++) {
	        currentSum += a[i]; // Calculates the sum of the entire array one after the other
	        //If the array is divisible by 2 without a remainder
	        if (currentSum % 2 == 0) {
	            maxLength = Math.max(maxLength, i + 1 - start); //Get me the maximum in an array divisible by 2 without a remainder
	        }else {
	        	 maxLength = Math.max(maxLength, i + start); // Otherwise return me the maximum array that is not divisible by 2 without a remainder
	        }
	    }
	    
	    return maxLength; 
	}
