import java.util.Random;
import java.util.Scanner;

class game {
 int guess,no_of_guess;
 int rand;
 game(){
     Random ra = new Random();
     rand=ra.nextInt(10);

}
public void takeuserinput(int a){
     guess=a;
     
}
public int getNo_of_guess(){
     return no_of_guess;
}
public void setNo_of_guess(int no_of_guess){
     no_of_guess=no_of_guess;
}
public boolean isCorrect(){
     if(rand>guess){
         System.out.println("number is greater than as expected");
         no_of_guess=no_of_guess + 1;
         return false;
     }
     else if(guess>rand){
         System.out.println("number is less than as expected");
         no_of_guess=no_of_guess + 1;
         return false;
     }else {
         System.out.println("BINGO||| YOU WON");
         no_of_guess=no_of_guess +1;
         System.out.println("number of guess = " + no_of_guess);
         return true;
     }}
}
    public class practice {
     public static void main(String[] args){
         Scanner R=new Scanner(System.in);
         game nas=new game();
         System.out.println(" enter your number below to play game");
         nas.takeuserinput(R.nextInt());
         while(! nas.isCorrect()){
             System.out.println("enter your number below to play game");
             nas.takeuserinput(R.nextInt());

         }

     }
    }

