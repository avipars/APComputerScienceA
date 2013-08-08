public class test{
public static void main(String[] args){

 int[] myArray = new int[5];
int product = 1;

for(int i = 0 ; i < myArray.length; i++)
{
        myArray[i] = (i+1)*2;        
}


for (int i : myArray)
{
        product *= i;
}

System.out.println("The product of all the elements in the array: " + product);

}
}