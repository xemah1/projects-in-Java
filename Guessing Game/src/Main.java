import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Grid obj = new Grid();
    Random rand = new Random();
    int width = (rand.nextInt(10))+1; //creates arrays <= 10x10
    obj.setWidth(width);
    int [][] choices = {{-1,-1,-1} , {-1,-1,-1}}; //array for player's choices
    int [] random = obj.createGrid(choices);
    int tries = 3;
    Scanner scanner = new Scanner(System.in);
        System.out.println("You will only get 3 tries.");
    System.out.println("Guess the coords of the secret dot.\nExample Input:"+(rand.nextInt(width-1)+1)+" "+(rand.nextInt(width-1)+1));
    while (tries != 0) { //game's loop
        tries -= 1;
        int guessX = (scanner.nextInt()) - 1;
        int guessY = (scanner.nextInt()) - 1;
        while ((guessX > width) || (guessX < 0) || (guessY > width) || (guessY < 0)){ //checks if guesses are appropriate
            System.out.println("Please make guesses that are 0 < x < width.");
            guessX = (scanner.nextInt()) - 1;
            guessY = (scanner.nextInt()) - 1;
        }
        choices[0][Math.abs(tries - 2)] = guessX;   //fills choices array with your guesses
        choices[1][Math.abs(tries - 2)] = guessY;

        int distanceX = Math.abs(guessX - random[0]); //math stuff to give you distance value
        int distanceY = Math.abs(guessY - random[1]);

        if ((distanceX + distanceY) == 0){
            System.out.println("YOU FOUND THE SECRET!");
            break;
        }
        System.out.println("Your distance to the secret dot is: " + (distanceX + distanceY));
        if (tries != 1) {
            System.out.println("You have " + tries + " tries left.");
        }else {
            System.out.println("Last chance. Be careful!");
        }
        obj.createGrid(choices); //re-prints the grid and puts 0 for your failed guesses
    }
        System.out.println("The secret was X: "+(random[0]+1)+" , Y:"+(random[1]+1));
    }
}
