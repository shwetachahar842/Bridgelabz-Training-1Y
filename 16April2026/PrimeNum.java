public class PrimeNum {
    public static void main(String[] args){
        
        for(int i = 2; i < 101; i++){
            int count = 0;
            for(int j = i;j< 101; i++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
               System.out.println(i);
            }
        }
    }
}
