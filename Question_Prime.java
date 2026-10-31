/* 
Write a Java program to check whether the number 7 is prime
*/


class Questions_practice{
    public static void main(String args[]){
        int n = 7;
        boolean isPrime = true;

        for(int i=2; i<n; i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
        } 

        if(isPrime){
            System.out.println(n+"is a Prime Number");
        }
        else{
            System.out.println(n+"is not a Prime Number");
        }
    }
}