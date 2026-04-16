public class twonumber {
    public static void main(String[] args){
        int c = 8;
        int d = 16;
        int s1 = 0;
        int s2 = 0;
        for(int i = 1; i<c; i++){
            if(c%i == 0){
                s1 = s1 + 1;
            }
        }
        for(int i = 1; i < d; i++){
            if(d%1 == 0){
                s2 = s2 + 1;
            }
        }
        if(c == s1 && d == s2){
            System.out.println("Yes, they are friendly paired");
        }
        else{
            System.out.println("Not");
        }
    }
}
