public class find_large_array{
    public static void main(String[] args) {
       int[] numbers = {12, 45, 7, 89, 23};
       int largest = numbers[0];

       for(int i = 0; i<numbers.length; i++){
        if(largest<numbers[i]){
            largest = numbers[i];
        }
        
       }
       System.out.println("The Largest number is "+ largest);
 }
}