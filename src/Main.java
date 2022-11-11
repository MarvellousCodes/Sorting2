//Take in a list of words and sort them by how many points they would earn in the game of Scrabble, with the lowest scoring words being outputted first. If two words have the same Scrabble score, then they should be sorted in alphabetical order. Letters in Scrabble earn the following points:
//
//
//
//        1 point – A   E   I   O   U   L   N   S   T   R
//        2 points – D   G
//        3 points – B   C   M   P
//        4 points – F   H   V   W   Y
//        5 points – K
//        8 points – J  X
//        10 points – Q  Z

//        Input Format
//
//        The first line is an int n indicating the quantity of strings that follow
//
//        This is followed by n words to be sorted, each on a separate line
//
//
//
//        Output Format
//
//        Output each of the words on a separate line, sorted by their Scrabble scores, with the lowest scoring words coming first
//
//
//
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String[] words = new String[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++)

        {

            words[i] = sc.nextLine();

        }
        String tally = "";
        for (int i = 0; i < n; i++)

        {
            for (int j = 0; j < words[i].length(); j++)

            {

                tally = words[i].substring(j,j+1);

                if (tally.matches("(?i)[aeioulnstr]"))

                {

                    score[i]++;

                }

                if (tally.matches("(?i)[dg]"))

                {

                    score[i] += 2;

                }

                if (tally.matches("(?i)[bcmp]"))

                {

                    score[i] += 3;

                }

                if (tally.matches("(?i)[fhvwy]"))

                {

                    score[i] += 4;

                }

                if (tally.matches("(?i)[k]"))

                {

                    score[i] += 5;

                }

                if (tally.matches("(?i)[jx]"))

                {

                    score[i] += 8;

                }

                if (tally.matches("(?i)[qz]"))

                {

                    score[i] += 10;

                }

            }

        }

        for (int i = 1; i < n; i++)

        {

            for (int j = 0; j < n-1; j++)

            {

                if (score[j] > score[j+1])

                {

                    String tempWord = words[j];

                    words[j] = words[j+1];

                    words[j+1] = tempWord;



                    int tempInt = score[j];

                    score[j] = score[j+1];

                    score[j+1] = tempInt;

                }

            }

        }

        for (int i = 1; i < n; i++)

        {

            for (int j = 0; j < n-1; j++)

            {

                if (score[j] == score[j+1])

                {

                    if (words[j].compareTo(words[j+1]) > 0)

                    {

                        String tempWord = words[j];

                        words[j] = words[j+1];

                        words[j+1] = tempWord;

                    }

                }

            }

        }

        for (int i = 0; i < n; i++)

        {

            System.out.println(words[i]);

        }



    }

}