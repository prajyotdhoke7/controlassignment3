/*7. Write a program to print a table of 17 up to 170.
Output: 17,34,51,68,...170*/
class Code7{
	public static void main(String[] args){
		for(int i=17;i<=170;i++){
			if(i%17==0){
				System.out.print(i);
			if(i<170){
				System.out.print(",");
			}
			}
		}
	}
}
