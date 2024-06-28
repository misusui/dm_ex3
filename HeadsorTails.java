import java.util.Random;

class HeadsorTails{
    public static void main(String[] args){
        Random random = new Random();
        int hnum = 0;
        int tnum = 0;

        System.out.println("Tossing a coin...");

        for(int i = 1 ; i <= 3 ; i++){
            int r = random.nextInt(2);
            System.out.print("Round " + i + ": ");
            if(r == 0){
                System.out.println("Tails");
                tnum++;
            } else if(r == 1){
                System.out.println("Heads");
                hnum++;
            }
        }

        System.out.println("Heads: " + hnum + ", Tails: " + tnum);
    }
}