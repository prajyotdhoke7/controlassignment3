/*2. Write a program to print the first 100 whole numbers.
Output: 0,1,2,34,5...100*/
class Code2{
	public static void main(String[] args){
		for(int i=0;i<=100;i++){
			System.out.print(i);
			if(i<100){
				System.out.print(",");
			}
		}
	}
}
