import java.util.Random;
public class ranArryandSearch {
static int values;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random generator= new Random();
        int [] rand= new int [50];

       

 for(int i=0; i<rand.length; i++) {
     rand[i]= 1+ generator.nextInt(25);

     System.out.print(rand[i]+",");
 }

 double largest = rand[0];
 double smallest = rand[0];
 for (int i = 1; i < rand.length; i++) {
        if (rand[i] > largest)
           largest = rand[i];
        if (rand[i] < smallest)
               smallest = rand[i];
 }
         System.out.println("\nThe largest element in the array: " + largest);
         System.out.println("The smallest element in the array: " + smallest);
System.out.println("This is the Product of the smallest and largest:"+ largest*smallest);
     }

}