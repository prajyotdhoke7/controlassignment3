/*3. Write a program to print the first ten 3-digit numbers.
Output:100,101,102,103,..,109*/
class Code3{
	public static void main(String[] args){
		for(int i=100;i<=109;i++){
			System.out.print(i);
			if(i<109){
				System.out.print(",");
			}
		}
	}
}
