import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomInt;
        //Declare an array to hold 10 test scores
        int scores [] = new int[10];

        //initialize elements of an array
        for(int i=0; i<10; i++){
            randomInt = 1 + rnd.nextInt(100);//creates a random number between 1 and 100
            scores[i] = randomInt;

        }
        //print the elements of an array
        for(int i= 0; i< scores.length; i++){
            System.out.println("Element at index " +i + " is: " + scores[i]);
        }
        //print the fifth element
        System.out.println("The fifth element is: " + scores[4]);

        //print every other element
        for(int i=0; i<scores.length; i=i+2){
            System.out.println("Score at " + i + " is: " + scores[i]);
        }
        //print the number of elements
        System.out.println("The array length is " + scores.length);

        //Change an element
        scores[0] = 100;
        System.out.println("The first element is now " + scores[0]);

    }
}
