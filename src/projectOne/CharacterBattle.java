package projectOne;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static String name1;
    public static String name2;
    public static int hp1;
    public static int hp2;
    public static int win = 0;
    public static int playerAttack(int pc, String p1move, String p2move, int mp1, int mp2) {
        /* Returns 1 on round end, 0 on round continue */
        if (pc == 1) {
            System.out.println(CharacterBattle.name1 + " (Player 1) Attacks!");
            System.out.println(p1move + " does " + mp1 + " damage!");
            CharacterBattle.hp2 -= mp2;
            if (CharacterBattle.hp2 <= 0) {
                System.out.println("Player 1 Wins Round!");
                return 1;
            }
        } else {
            System.out.println(CharacterBattle.name2 + " (Player 2) Attacks!");
            System.out.println(p2move + " does " + mp2 + " damage!");
            CharacterBattle.hp1 -= mp2;
            if (CharacterBattle.hp1 <= 0) {
                System.out.println("Player 2 Wins Round!");
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Input an odd number of rounds:");
        int rounds = scn.nextInt();
        //I really don't like in Java how I can't just do if (num & 1) like I would be able to do in C
        int isOdd = rounds & 1;
        if (isOdd == 0) {
            System.out.println("Even number of rounds entered\n");
            return;
        }
        int p1wins = 0;
        int p2wins = 0;
        for (int i = 0; i < rounds; i++) {
            System.out.println("Player 1 Name:");
            CharacterBattle.name1 = scn.nextLine();
            // For some reason first is skipped ??? so i just ask again, bad code but works
            CharacterBattle.name1 = scn.nextLine();
            System.out.println("Player 1 Hit Points:");
            CharacterBattle.hp1 = scn.nextInt();
            System.out.println("Player 1 Move:");
            String move1 = scn.nextLine();
            //what
            move1 = scn.nextLine();
            System.out.println("Player 1 Move Power:");
            int mp1 = scn.nextInt();
            System.out.println("Player 1 Attack Speed:");
            int speed1 = scn.nextInt();
            System.out.println("Player 2 Name:");
            CharacterBattle.name2 = scn.nextLine();
            CharacterBattle.name2 = scn.nextLine();
            System.out.println("Player 2 Hit Points:");
            CharacterBattle.hp2 = scn.nextInt();
            System.out.println("Player 2 Move:");
            String move2 = scn.nextLine();
            move2 = scn.nextLine();
            System.out.println("Player 2 Move Power:");
            int mp2 = scn.nextInt();
            System.out.println("Player 2 Attack Speed:");
            int speed2 = scn.nextInt();
            if (speed1 > speed2) {
                int endRound = playerAttack(1, move1, move2, mp1, mp2);
                if (endRound == 1) {
                    p1wins++;
                }
            } else if (speed1 < speed2) {
                int endRound = playerAttack(2, move1, move2, mp1, mp2);
                if (endRound == 1) {
                    p2wins++;
                }
            } else {
                int player = (rand.nextInt(2) + 1);
                int endRound = playerAttack(player, move1, move2, mp1, mp2);
                if (endRound == 1) {
                    if (player == 1) {
                        p1wins++;
                    } else {
                        p2wins++;
                    }
                }
            }
        }
        if (p1wins > p2wins) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Player 2 Wins!");
        }
    }
}
