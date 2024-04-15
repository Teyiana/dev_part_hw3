public class SumCalculator {
    int sum(int n){
        if(n <= 0){
           throw new IllegalArgumentException();
        }
        return n * (n + 1) / 2;
    }
}
