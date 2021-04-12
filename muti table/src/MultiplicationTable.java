
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] mult= new int [10][10];


for(int row = 0; row< mult.length; row++) {
	for(int col=0; col<mult.length; col++) {
		mult[row][col]=(row+1)	*(col+1);}
}
	
	for(int row = 0; row< mult.length; row++) {
		for(int col=0; col<mult.length; col++) {
			System.out.print(mult[row][col]+"\t");
		}
		System.out.println("");
	}
}}
