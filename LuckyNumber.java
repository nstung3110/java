import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
    //khai bao bien toan cuc
    static int totalGame = 0;
    static int bestGame=0;
    static int guessTotal=0;
    static int guessNumb=0;
    static int bingoNumb=0;
    static float avgGame;
    public static void report(){
            System.out.println("So lan da choi la: " + totalGame );
            System.out.println("So lan du doan cua game tot nhat la " + bestGame);
            System.out.println("So du doan trung binh moi game la " + avgGame);
            System.out.println("Tong so lan du doan la "+guessTotal);
        }
    public static void play(){
        String again;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            int count = 0; // Khai bao so dem du doan va so lan choi
            bingoNumb = rd.nextInt(100);
            System.out.println("Nhap so du doan tu 0-100");
            do {
                System.out.println("So du doan cua toi la:");
                guessNumb = sc.nextInt(); // Nhap so du doan
                count++;
                // So sanh so du doan voi so bingo
                if (bingoNumb > guessNumb) {
                    System.out.println("So du doan nho hon so may man");
                } else if (bingoNumb < guessNumb) {
                    System.out.println("So du doan lon hon so may man");
                } else {
                    // Neu doan dung in ra so lan da choi
                    System.out.println("Chuc mung ban da doan dung so may man sau so lan la " + count); 
                }
                
                
                } while (guessNumb != bingoNumb); // vong lap se dung sau khi so du doan = so may man
            guessTotal += count; // tong so lan du doan
            totalGame++;
            avgGame = (float) guessTotal / totalGame;
            if(bestGame<count||bestGame==0){
                bestGame=count;
            }
            again = sc.next();
        } while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("Yes") || again.equalsIgnoreCase("Y")
                || again.equalsIgnoreCase("y"));
    }
    public static void main(String[] args) throws Exception {
        //choi thu
        play();
         /// In ra thong tin sau khi dung choi
        report();
    }

}
