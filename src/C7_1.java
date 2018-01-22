import java.util.Scanner;
public class C7_1 {
   	public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
            double best = 0;
            int[] scores;
            int x, newest;
            System.out.println("Enter the number of students: ");
            x = input.nextInt();
            scores = new int[x];
            System.out.printf("Enter %d scores: ", x);
            
            for(int i = 0; i <= x; i++){
                scores[i] = input.nextInt();
                newest = scores[i];
                if(newest > best){
                    best = newest;
                }
                if (i == x - 1){
                    break;
                }
            }
           
            for (int i = 0; i <= x; i++){
                if (scores[i] >= best - 10){
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
                }
                else if (scores[i] >= best - 20){
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
                }
                else if (scores[i] >= best - 30){
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
                }
                else if (scores[i] >= best - 40){
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
                }
                else {
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
                }
                if (i == x - 1){
                    break;
                }
            }
        }
}
