class Gen{
	public static <any_type> void printArr(any_type[] input){
		
		
		for(any_type element : input){
			System.out.println(element);
		}
		
		System.out.println();
	}
	
	public static void main(String args[]){
		
		Integer[] intArr ={1,2,3,4,5};
		Double[] dubArray={1.22,2.22,3.5,6.7,8.7,7.2};
		Character[] charArray={'h','e','l','l','o'};
		
		           printArr(intArr);
				   printArr(dubArray);
				   printArr(charArray);
				   
		}
	}
	
	
	
		
		
		
			
			