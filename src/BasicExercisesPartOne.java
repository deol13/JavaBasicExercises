import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class BasicExercisesPartOne
{
    Scanner myInputObj;

    public BasicExercisesPartOne()
    {
        myInputObj = new Scanner(System.in);
    }

    public void RunExercises()
    {
        //ExerciseOne();
        //ExerciseTwo();
        //ExerciseThree();
        //ExerciseFour();
        //ExerciseFive();
        //ExerciseSix();
        //ExcerciseSeven();
        //ExerciseEight();
        //ExerciseNine();
        //ExerciseTen();
        //ExerciseEleven();
        //ExerciseTwelve();
        //ExerciseThirteen();
        ExerciseFifteen();

    }

    private int TakeAnInput()
    {
        System.out.println("Input a number:");
        return myInputObj.nextInt();
    }

    public void ExerciseOne()
    {
        System.out.println("Hello \n  Dennis D");
    }
    public void ExerciseTwo()
    {
        int result = 74 + 36;
        System.out.println("Exercise 2:" + result);
    }
    public void ExerciseThree()
    {
        int result = 50 / 3;
        System.out.println("Exercise 3:" + result);
    }
    public void ExerciseFour()
    {
        int num1 = -5 +8 * 6;
        int num2 = (55+9) % 9;
        int num3 = 20 + (-3) * 5 / 9;
        int num4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Exercise 4:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
    public void ExerciseFive()
    {
        int num1 = TakeAnInput();
        int num2 = TakeAnInput();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    public void ExerciseSix()
    {
        int num1 = TakeAnInput();
        int num2 = TakeAnInput();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
    public void ExcerciseSeven()
    {
        int num1 = TakeAnInput();
        System.out.println(num1 + " * 1 = " + num1);
        System.out.println(num1 + " * 2 = " + (num1 * 2));
        System.out.println(num1 + " * 3 = " + (num1 * 3));
        System.out.println(num1 + " * 4 = " + (num1 * 4));
        System.out.println(num1 + " * 5 = " + (num1 * 5));
        System.out.println(num1 + " * 6 = " + (num1 * 6));
        System.out.println(num1 + " * 7 = " + (num1 * 7));
        System.out.println(num1 + " * 8 = " + (num1 * 8));
        System.out.println(num1 + " * 9 = " + (num1 * 9));
        System.out.println(num1 + " * 10 = " + (num1 * 10));
    }
    public void ExerciseEight()
    {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
    public void ExerciseNine()
    {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
    public void ExerciseTen()
    {
        System.out.println((4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7)+ (1.0/9) - (1.0/11))));
    }
    public void ExerciseEleven()
    {
        double radius = 7.5;
        System.out.println("Parimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (radius * radius * Math.PI));
    }
    public void ExerciseTwelve()
    {
        int num1 = TakeAnInput();
        int num2 = TakeAnInput();
        int num3 = TakeAnInput();
        System.out.println("The average of the three numbers is : " + (num1 + num2 + num3) / 3);
    }
    public void ExerciseThirteen()
    {
        double width = 5.5, height = 8.5;
         System.out.println("Area is " + width + " * " + height + " = " + width * height);
         System.out.println("Parimeter is 2 * (" + width + " + " + height + ") = " + 2 * (width + height));
    }
    public void ExerciseFifteen()
    {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd, yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Current date and time: " + formattedDate);
    }
}
