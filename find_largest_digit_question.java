public class find_largest_digit_question{
    public static void main(String[] args) {
        int n = 583927;
        int large = 0;

        while(n>0){
            int digit = n%10;
            if(digit>large){
                large = digit;
            }
            n = n/10;
        }
        System.out.println("The largest digit is "+large);
    }
}