package main;

public class Mymain {
    public static void main(String[] args){
        System.out.println(factorial(6));
    }
    public static long factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
