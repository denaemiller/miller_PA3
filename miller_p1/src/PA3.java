import java.security.SecureRandom;
import java.lang.Object;
import java.util.Random;
import java.util.Scanner;

public class PA3{
    private int numGen; //setting all the none user friendly variables
    private int numGen2;

    //generates a random number level 1
    public void genRandom1() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(10);
    }

    //generates a random number level 2
    public void genRandom2() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(100);
    }

    //generates a random number level 3
    public void genRandom3() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(1000);
    }

    //generates a random number level 4
    public void genRandom4() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(10000);
    }

    //generates a random number level 1
    public void genRandomDiv1() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(10) + 1;
    }

    //generates a random number level 2
    public void genRandomDiv2() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(100) + 1;
    }

    //generates a random number level 3
    public void genRandomDiv3() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(1000) + 1;
    }

    //generates a random number level 4
    public void genRandomDiv4() {
        SecureRandom rand = new SecureRandom(); //not too sure if its ok here

        numGen = rand.nextInt(10000) + 1;
    }

    //generates a random number for the responses
    public void genRandomAnswer(){
        SecureRandom rand = new SecureRandom();

        numGen2 = rand.nextInt(4);

    }


    //prints the random number
    public int getNum() {
        return numGen;
    }

    public int getNum2() {
        return numGen2;
    }



    //---------------------------------------------------------------------





}
