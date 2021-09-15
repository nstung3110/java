import java.util.Scanner;

public class GradeStuden {
    // Khai bao bien toan cuc
    static int weight, scoreEarn, totalScore, maxTotalScore, scoreShift, weightHome = 100;
    static float weightScoreMid, weightScoreFinal, weightScoreHome, gradeScore;
    static Scanner sc = new Scanner(System.in);

    public static void begin() {
        System.out.println("This program reads exam homework scores and reports your overall course grade:");
    }
    static float totalGrScore(float gradeScore){
        gradeScore = weightScoreMid + weightScoreFinal + weightScoreHome;
        return gradeScore;
    }
    public static void midterm() {
        String wereShifted;
        System.out.println("Midterm: ");
        System.out.print("Weight (0-100): ");
        weight = sc.nextInt();
        // kiem tra weight phu hop
        if (weight < 0 || weight > 98) {
            System.out.println("Wrong input do it again !");
            System.out.print("Weight (0-100): ");
            weight = sc.nextInt();
        }
        weightHome = weightHome - weight; // Gan de kiem tra dieu kien weightHome ton tai
        System.out.print("Score earned: ");
        scoreEarn = sc.nextInt();
        // Kiem tra xem co nhan duoc diem thuong khong
        System.out.print("Were scores shifted (1 = yes, 2=no): ");
        wereShifted = sc.next();
        if (wereShifted.equals("1")) {
            System.out.print("Shift amount: ");
            scoreShift = sc.nextInt();
        } else {
            scoreShift = 0;
        }
        totalScore = scoreEarn + scoreShift;
        // Kiem tra neu Tong diem lon hon 100 thi se dc gan = 100
        if (totalScore > 100) {
            totalScore = 100;
        }
        weightScoreMid = (float) totalScore * weight / 100;
        System.out.println("Total score: " + totalScore + "/100");
        System.out.println("Weighted score: " + weightScoreMid + "/" + weight);

    }

    public static void finalterm() {
        int a;
        String wereShifted;
        System.out.println("Final: ");
        System.out.print("Weight (0-100): ");

        // Tong so weight khong vuot qua 100, Va weightHome ton tai
        do {
            weight = sc.nextInt();
            if ((a = weightHome - weight) <= 1) {
                System.out.println("Wrong input try again !");
                System.out.print("Weight (0-100): ");
            } else {
                weightHome = a;
            }
        } while (a <= 1);

        System.out.print("Score earned: ");
        scoreEarn = sc.nextInt();

        // Kiem tra xem co nhan duoc diem thuong khong
        System.out.print("Were scores shifted (1 = yes, 2=no): ");
        wereShifted = sc.next();
        if (wereShifted.equals("1")) {
            System.out.print("Shift amount: ");
            scoreShift = sc.nextInt();
        } else {
            scoreShift = 0;
        }
        totalScore = scoreEarn + scoreShift;
        // Kiem tra neu Tong diem lon hon 100 thi se dc gan = 100
        if (totalScore > 100) {
            totalScore = 100;
        }
        weightScoreFinal = (float) totalScore * weight / 100;
        System.out.println("Total score: " + totalScore + "/100");
        System.out.println("Weighted score: " + weightScoreFinal + "/" + weight);
    }

    public static void homework() {
        // Khai bao bien cuc bo
        int numAsm, attendPoint;
        int asmScore = 0, asmMax = 150, attend = 0, asmScoreMax = 0;
        int[] asm = new int[2];
        System.out.println("Homework: ");
        // Nhap Weight Home va kiem tra em bang 100 chua
        System.out.print("Weight: ");
        do {
            weight = sc.nextInt();
            if (weight != weightHome) {
                System.out.println("***tip: weight= " + weightHome);
                System.out.println("Weight total is 100 please use tip try again !!");
                System.out.print("Weight: ");
            }
        } while (weight != weightHome);

        // So bai tap ve nha diem vaf diem max
        System.out.print("Number of assignments: ");
        numAsm = sc.nextInt();
        for (int j = 1; j <= numAsm; j++) {
            System.out.print("Assignment " + j + " score and max: ");
            for (int i = 0; i <= 1; i++) {
                asm[i] = sc.nextInt();
            }
            // Kiem tra neu nhap so diem lon hon diem max thi so diem duoc gan = diem max
            if (asm[0] > asm[1]) {
                System.out.println(" Wrong in put now Score = max Score ");
                asm[0] = asm[1];
            }
            // gan diem asm va kiem tra voi diem max la 150
            asmScore += asm[0];
            asmScoreMax += asm[1];
            if (asmScore > asmMax) {
                asmScore = asmMax;
            }
        }

        System.out.print("How many sections did you attend: ");
        attend = sc.nextInt();
        attendPoint = attend * 5;
        // kiem tra diem toi da la 30
        if (attendPoint > 30) {
            attendPoint = 30;
        }

        System.out.println("Section points: " + attendPoint);
        totalScore = asmScore + attendPoint;
        maxTotalScore = asmScoreMax + 30;
        System.out.println("Total point: " + totalScore + "/" + maxTotalScore);
        weightScoreHome = (float) totalScore / maxTotalScore * weight;
        System.out.println("Weighted score: " + weightScoreHome + "/" + weight);
    }

    public static void report() {
        gradeScore= totalGrScore(gradeScore);
        System.out.println("Overall percentage: " + gradeScore);
        if(gradeScore>=85){
            System.out.println("Your grade will be at least: 3.0 ");
            System.out.println("Degree classification: Very Good ");
        }else
        if (gradeScore<85&&gradeScore>75){
            System.out.println("Your grade will be at least: 2.0 ");
            System.out.println("Degree classification: Good ");
        }else
        if (gradeScore<75&&gradeScore>60){
            System.out.println("Your grade will be at least: 0.7 ");
            System.out.println("Degree classification: Ordinary ");
        }
        else{
            System.out.println("Your grade will be at least: 0.0 ");
            System.out.println("Degree classification: Not pass ");
        }

    }

    public static void main(String[] args) {
        begin();
        midterm();
        finalterm();
        homework();
        report();
    }
}
