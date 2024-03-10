/*8. Write a program to print a table of 14 in reverse order from 140.
Output:140,126,112,..14*/
class Code8{
	public static void main(String[] args){
		for(int i=140;i>=14;i--){
			if(i%14==0){
				System.out.print(i);
				if(i>14){
					System.out.print(",");
				}
			}
		}
	}
}
				
