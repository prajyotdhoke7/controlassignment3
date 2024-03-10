/*10. Write a program to print the product of the first 10 natural numbers.
Output: 3628800*/
class Code10{
	public static void main(String[] args){
		int pro=1;
                for(int i=1;i<=10;i++){
                         pro*=i;
                }
                System.out.println(pro);
        }
}
