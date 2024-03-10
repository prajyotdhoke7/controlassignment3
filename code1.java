/*Write a program to print the first 10 numbers.
Output: 1, 2, 3,4...10*/
class Code1{
	public static void main(String [] args){
		for(int i=1;i<=10;i++){
			System.out.print(i);
			if(i<10){
				System.out.print(",");
			}
		}
	}
}
