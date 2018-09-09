/**
 * The count say sequence starts with the string "1". Each following string is determined by reading out the count of
 * each repeating character and then the character itself. The following list shows the first 7 terms of the count say
 * sequence:
 *
 * 1: 1
 * 2: 11
 * 3: 21
 * 4: 1211
 * 5: 111221
 * 6: 312211
 * 7: 13112221
 *
 */

class CountSay
{

    /**
     * This method generates the next term of the sequence given based on the supplied string.
     */
    static String getNextTerm(String input)
    {
        // your code here
        return "";
    }

    /**
     * This method returns the nth term of the sequence
     */
    static String getNthTerm(int n)
    {
        // your code here
        return "";
    }

    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.err.println("missing arguments");
            return;
        }
        int n = Integer.parseInt(args[0]);
        String result = getNthTerm(n);
        System.out.println(result);
    }
}