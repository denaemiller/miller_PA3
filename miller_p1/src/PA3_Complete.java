import java.lang.Object;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class PA3_Complete {
    //Difficulty level
    public static int howHard(){
        Scanner scnr = new Scanner (System.in);
        int diffLevel;

        System.out.println("Enter the difficulty level you would like (Enter 1 for level 1, 2 for level 2, 3 for level 3, 4 for level 4):");
        diffLevel = scnr.nextInt();
        System.out.println();


        return diffLevel;

    }

    //The option of arithmetic
    public static int option(){
        Scanner scnr = new Scanner (System.in);
        int arithmeticOption;

        System.out.println("What arithmetic would you like to study (Type 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, and 5 for a random mixture of each):");
        arithmeticOption = scnr.nextInt();
        System.out.println();

        return arithmeticOption;
    }

    //Replies right answer
    public static String wrong(){
        PA3 gen = new PA3();
        String phrase = "";

        gen.genRandomAnswer();
        switch(gen.getNum2())
        {
            case 0:
                phrase = phrase.concat("Don’t give up!");
                System.out.println();
                break;

            case 1:
                phrase = phrase.concat("No. Please try again.");
                System.out.println();
                break;

            case 2:
                phrase = phrase.concat("Wrong. Try once more.");
                System.out.println();
                break;

            case 3:
                phrase = phrase.concat("No. Keep trying.");
                System.out.println();
                break;

        }
        return phrase;
    }

    //Replies wrong answer
    public static String right(){
        PA3 gen = new PA3();
        String phrase = "";

        gen.genRandomAnswer();
        switch(gen.getNum2())
        {
            case 0:
                phrase = phrase.concat("Very good!");
                break;

            case 1:
                phrase = phrase.concat("Excellent!");
                break;

            case 2:
                phrase = phrase.concat("Nice work!");
                break;

            case 3:
                phrase = phrase.concat("Keep up the good work!");
                break;
        }
        return phrase;
    }


    //method to obtain multiplication problems
    public static void multiplicationGen(int diffLevel){
        Scanner scnr = new Scanner (System.in);
        PA3 gen = new PA3();
        int continueOr = 0;
        int answer = 0; //must initialize for the while loop
        int num1, num2; //haven't set a class rand to it yet
        int count = 0; //counter for the while loop
        double amountCorrect = 0.0, amountIncorrect = 0.0;
        double percent = 0.0; //initializing the amount of questions the child got correct

        if (diffLevel == 1)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom1();
                num1 = gen.getNum();

                gen.genRandom1();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 * num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 2)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom2();
                num1 = gen.getNum();

                gen.genRandom2();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 * num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 3)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom3();
                num1 = gen.getNum();

                gen.genRandom3();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 * num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if(diffLevel == 4)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom4();
                num1 = gen.getNum();

                gen.genRandom4();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 * num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        amountIncorrect = 10 - amountCorrect;

        //states the amount correct and incorrect
        System.out.println("The amount of questions you got correct: " + amountCorrect);
        System.out.println();
        System.out.println("The amount of questions you got incorrect: " + amountIncorrect);
        System.out.println();

        //Gets the percent
        percent = (double) amountCorrect / 10;
        System.out.println("Your Grade: " + (percent * 100) + "%");
        System.out.println();
        if (percent < 0.75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }


    }






    //---------------------------------------------------------------------------------------------------------------
    //method to obtain addition problems
    public static void additionGen(int diffLevel){
        Scanner scnr = new Scanner (System.in);
        PA3 gen = new PA3();
        int continueOr = 0;
        int answer = 0; //must initialize for the while loop
        int num1, num2; //haven't set a class rand to it yet
        int count = 0; //counter for the while loop
        double amountCorrect = 0.0, amountIncorrect = 0.0;
        double percent = 0.0; //initializing the amount of questions the child got correct

        if (diffLevel == 1)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom1();
                num1 = gen.getNum();

                gen.genRandom1();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 + num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 2)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom2();
                num1 = gen.getNum();

                gen.genRandom2();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 + num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 3)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom3();
                num1 = gen.getNum();

                gen.genRandom3();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 + num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if(diffLevel == 4)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom4();
                num1 = gen.getNum();

                gen.genRandom4();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 + num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        amountIncorrect = 10 - amountCorrect;

        //states the amount correct and incorrect
        System.out.println("The amount of questions you got correct: " + amountCorrect);
        System.out.println();
        System.out.println("The amount of questions you got incorrect: " + amountIncorrect);
        System.out.println();

        //Gets the percent
        percent = (double) amountCorrect / 10;
        System.out.println("Your Grade: " + (percent * 100) + "%");
        System.out.println();
        if (percent < 0.75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }
    }






    //---------------------------------------------------------------------------------------------------------------
    //Generates problems for subtraction
    public static void subtractionGen(int diffLevel){
        Scanner scnr = new Scanner (System.in);
        PA3 gen = new PA3();
        int continueOr = 0;
        int answer = 0; //must initialize for the while loop
        int num1, num2; //haven't set a class rand to it yet
        int count = 0; //counter for the while loop
        double amountCorrect = 0.0, amountIncorrect = 0.0;
        double percent = 0.0; //initializing the amount of questions the child got correct

        if (diffLevel == 1)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom1();
                num1 = gen.getNum();

                gen.genRandom1();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 - num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 2)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom2();
                num1 = gen.getNum();

                gen.genRandom2();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 - num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 3)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom3();
                num1 = gen.getNum();

                gen.genRandom3();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 - num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if(diffLevel == 4)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom4();
                num1 = gen.getNum();

                gen.genRandom4();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 - num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        amountIncorrect = 10 - amountCorrect;

        //states the amount correct and incorrect
        System.out.println("The amount of questions you got correct: " + amountCorrect);
        System.out.println();
        System.out.println("The amount of questions you got incorrect: " + amountIncorrect);
        System.out.println();

        //Gets the percent
        percent = (double) amountCorrect / 10;
        System.out.println("Your Grade: " + (percent * 100) + "%");
        System.out.println();
        if (percent < 0.75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }
    }






    //----------------------------------------------------------------------------------------------------------------
    //Generates problems for division
    public static void divisionGen(int diffLevel){
        Scanner scnr = new Scanner (System.in);
        PA3 gen = new PA3();
        int continueOr = 0;
        int answer = 0; //must initialize for the while loop
        int num1, num2; //haven't set a class rand to it yet
        int count = 0; //counter for the while loop
        double amountCorrect = 0.0, amountIncorrect = 0.0;
        double percent = 0.0; //initializing the amount of questions the child got correct

        if (diffLevel == 1)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom1();
                num1 = gen.getNum();

                gen.genRandomDiv1();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 / num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 2)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom2();
                num1 = gen.getNum();

                gen.genRandomDiv2();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 / num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if (diffLevel == 3)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom3();
                num1 = gen.getNum();

                gen.genRandomDiv3();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 / num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        else if(diffLevel == 4)
        {
            //creates the question
            while (count < 10)
            {
                //gets the two random numbers  for the problem
                gen.genRandom4();
                num1 = gen.getNum();

                gen.genRandomDiv4();
                num2 = gen.getNum();

                //asks the question
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                continueOr = scnr.nextInt();
                System.out.println();

                answer = num1 / num2;

                //gets the amount correct
                if (continueOr == answer)
                {
                    amountCorrect++;
                    System.out.println(right());
                    System.out.println();
                }
                if (continueOr != answer)
                {
                    System.out.println(wrong());
                    System.out.println();
                }

                count++; //increments the count variable, so the loops isn't infinite
            }
        }

        amountIncorrect = 10 - amountCorrect;

        //states the amount correct and incorrect
        System.out.println("The amount of questions you got correct: " + amountCorrect);
        System.out.println();
        System.out.println("The amount of questions you got incorrect: " + amountIncorrect);
        System.out.println();

        //Gets the percent
        percent = (double) amountCorrect / 10;
        System.out.println("Your Grade: " + (percent * 100) + "%");
        System.out.println();
        if (percent < 0.75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }


    }







    //---------------------------------------------------------------------------------------------------------------
    //Generates random problems from all types
    public static void randomGen(int diffLevel) {
        Scanner scnr = new Scanner (System.in);
        PA3 gen = new PA3();
        int continueOr = 0;
        int answer = 0; //must initialize for the while loop
        int num1, num2; //haven't set a class rand to it yet
        int count = 0; //counter for the while loop
        double amountCorrect = 0.0, amountIncorrect = 0.0;
        int cases;
        double percent = 0.0; //initializing the amount of questions the child got correct


        while(count < 10)
        {
            gen.genRandomAnswer();
            cases = gen.getNum();
            switch(cases)
            {
                case 0:
                    if (diffLevel == 1)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom1();
                        num1 = gen.getNum();

                        gen.genRandom1();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 + num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 2)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom2();
                        num1 = gen.getNum();

                        gen.genRandom2();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 + num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 3)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom3();
                        num1 = gen.getNum();

                        gen.genRandom3();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 + num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    else if (diffLevel == 4)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom4();
                        num1 = gen.getNum();

                        gen.genRandom4();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 + num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    break;

                case 1:
                    if (diffLevel == 1)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom1();
                        num1 = gen.getNum();

                        gen.genRandom1();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " times " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 * num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 2)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom2();
                        num1 = gen.getNum();

                        gen.genRandom2();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " times " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 * num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 3)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom3();
                        num1 = gen.getNum();

                        gen.genRandom3();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " times " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 * num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    else if (diffLevel == 4)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom4();
                        num1 = gen.getNum();

                        gen.genRandom4();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " times " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 * num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    if (diffLevel == 1)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom1();
                        num1 = gen.getNum();

                        gen.genRandom1();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 - num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 2)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom2();
                        num1 = gen.getNum();

                        gen.genRandom2();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 - num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 3)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom3();
                        num1 = gen.getNum();

                        gen.genRandom3();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 - num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    else if (diffLevel == 4)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom4();
                        num1 = gen.getNum();

                        gen.genRandom4();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 - num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if (diffLevel == 1)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom1();
                        num1 = gen.getNum();

                        gen.genRandomDiv1();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 / num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 2)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom2();
                        num1 = gen.getNum();

                        gen.genRandomDiv2();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 / num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }

                    }
                    else if (diffLevel == 3)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom3();
                        num1 = gen.getNum();

                        gen.genRandomDiv3();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 / num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    else if (diffLevel == 4)
                    {
                        //gets the two random numbers  for the problem
                        gen.genRandom4();
                        num1 = gen.getNum();

                        gen.genRandomDiv4();
                        num2 = gen.getNum();

                        //asks the question
                        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                        continueOr = scnr.nextInt();
                        System.out.println();

                        answer = num1 + num2;

                        //gets the amount correct
                        if (continueOr == answer)
                        {
                            amountCorrect++;
                            System.out.println(right());
                            System.out.println();
                        }
                        if (continueOr != answer)
                        {
                            System.out.println(wrong());
                            System.out.println();
                        }
                    }
                    break;

            }

            count++;
        }

        amountIncorrect = 10 - amountCorrect;

        //states the amount correct and incorrect
        System.out.println("The amount of questions you got correct: " + amountCorrect);
        System.out.println();
        System.out.println("The amount of questions you got incorrect: " + amountIncorrect);
        System.out.println();

        //Gets the percent
        percent = (double) amountCorrect / 10;
        System.out.println("Your Grade: " + (percent * 100) + "%");
        System.out.println();
        if (percent < 0.75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }

    }


    public static void questionGen() {
        Scanner scnr = new Scanner (System.in);
        int diffLevel, arithmeticOption;
        int continueOr = 1;

        while (continueOr != -1)
        {
            //Establishes the difficulty level
            diffLevel = howHard();


            //Gets the arithmetic
            arithmeticOption = option();


            //for addition
            if(arithmeticOption == 1)
            {
                additionGen(diffLevel);
            }
            else if (arithmeticOption == 2)
            {
                multiplicationGen(diffLevel);
            }
            else if (arithmeticOption == 3)
            {
                subtractionGen(diffLevel);
            }
            else if (arithmeticOption == 4)
            {
                divisionGen(diffLevel);
            }
            else if (arithmeticOption == 5)
            {
                randomGen(diffLevel);
            }

            System.out.println("Type -1 if you don't wish to continue, if you wish to continue type any number:");
            continueOr = scnr.nextInt();
            System.out.println();
        }

    }



    //---------------------------------------------------------------------------------------------------------------------
    public static void main (String[] args){
        questionGen();
    }

}


