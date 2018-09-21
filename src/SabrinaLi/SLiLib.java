package SabrinaLi;

public class SLiLib {
    public static boolean isPalindrome(String word)
    {
        String a = "";

        //makes a equal to word spelled backwards
        for (int i = word.length() - 1; i > -1 ; i--)
        {
            a = a + word.charAt(i);
        }

        //returns whether a equals word or not (if it does, then str is a Palindrome)
        return a.equals(word);
    }

    public static String dateStr(String str)
    {
        //converts the string in the format mm/dd/yyyy to dd-mm-yyyy
        return str.substring(3, 5) + "-" + str.substring(0, 2) + "-" + str.substring(6);
    }

    public static void fooBarBaz(int num1)
    {
        for (int i = 1; i < num1 + 1; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) //checks if x is divisible by 3 and 5 and prints baz
            {
                System.out.println("baz");
            }
            else
            {
                if (i % 3 == 0) //checks if x is divisible by 3 and prints foo
                {
                    System.out.println("foo");
                }
                else
                {
                    if (i % 5 == 0) //checks if x is divisible by 5 and prints bar
                    {
                        System.out.println("bar");
                    }
                    else
                    {
                        System.out.println(i); //if x is not divisible by 3 or 5, print i
                    }
                }
            }
        }
    }

    public static int sumUpTo(int x)
    {
        int sum = 0;

        //adds each number up to x
        for (int i = 0; i < x + 1; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static boolean isFibonacci(int x)
    {
        //sets a and b to the first 2 numbers of the Fibonacci sequence
        int a = 0;
        int b = 1;

        //goes through the Fibonacci sequence until the number goes past x
        while (x > a + b)
        {
            if (x == a + b || x == a || x == b)
            {
                //exits the loop if x is part of the Fibonacci sequence
                return true;
            }
            else
            {
                //continues going through the Fibonacci sequence
                a += b;
                b += a;
            }
        }

        //checks if x is part of the Fibonnaci sequence
        if (x == a + b || x == a || x == b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
