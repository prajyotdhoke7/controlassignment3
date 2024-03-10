/*5. Write a program to print the odd numbers from 1 - 70.
Output:1,3,5,7,...69*/
class Code5{
	public static void main(String[] args){
		for(int i=1;i<=69;i++){
			if(i%2!=0){
				System.out.print(i);
				if(i<69){
					System.out.print(",");
				}
			}
		}
	}
}
