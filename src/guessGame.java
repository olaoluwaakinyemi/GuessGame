import javax.swing.*;
public class guessGame {
    public static void main(String args[]){
        int Gnumber = (int)(Math.random()*100 + 1);
        int userAns = 0;
        System.out.println("The correct guess is" +Gnumber);
        int count = 1;

        while (userAns != Gnumber)
        {
            String response = JOptionPane.showInputDialog(
                    null,
                    "enter a number between 1 and 100","Guessing Game", 3);
            userAns = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null,""+evaluateGuess(userAns, Gnumber, count));
            count++;
        }
    }
    public static String evaluateGuess(int userAns, int Gnumber, int count){
        if (userAns <=0 || userAns > 100){
            return "Your guess is invalid";
        }
        else if (userAns == Gnumber) {
            return "Correct!\nTotal Guesses: "+count;
        }
        else if (userAns > Gnumber){
            return "Your guess is too high. \nTry again: " +count;
        }
        else if (userAns < Gnumber){
            return "Your guess is too low. \nTry again: " +count;
        }
        else {
            return "Your guess is invalid\nTry again: " +count;
        }
    }
}
