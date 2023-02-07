package 소수단어;

import java.util.Scanner;

public class primeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();
        int sum = 0;
        boolean isPrime = true;
        for (int i = 0; i < alphabet.length(); i++) {
            if (alphabet.charAt(i) >= 'a') {
                sum += alphabet.charAt(i) - 'a' + 1;
            }else{
                sum += alphabet.charAt(i) -'A' + 27;
            }
        }
        for(int i=2; i<(int)Math.sqrt(sum); i++){
            if(sum%i==0){
                isPrime = false;
            }else{
                isPrime = true;
            }
        }
        if(isPrime){
            System.out.println("It is a prime word.");
        }else{
            System.out.println("It is not a prime word.");
        }
    }
}
