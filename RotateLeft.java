
/**
 * Write a description of class RotateLeft here.
 *
 * @author (Rachit Jha)
 * @version (1/9/24)
 */
public class RotateLeft
{
    public static void rotateLeft(int []data){
        int temp=data[0];
        data[0]=data[1];
        data[1]=data[2];
        data[2]=temp;
        //System.out.println(data);
    }
    public static void printArray(int[] data){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int[] a={5, 9, 3};
        printArray(a);
        rotateLeft(a);
        printArray(a);
        rotateLeft(a);
        printArray(a);
    }
}