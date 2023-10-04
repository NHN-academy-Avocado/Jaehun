package com.nhnacademy;

import com.nhnacademy.tribe.*;
import java.util.*;

public class Main {
    private static Tribe usr;
    private static Tribe com;
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        usr = tribeConUser(scanner);
        com = tribeCon(random.nextInt(3));
        run(usr, com, scanner);
        scanner.close();
    }

    private static Tribe tribeConUser(Scanner scanner) {
        while (true) {
            System.out.print("----------tribe list----------\n0: Terran, 1: Protoss, 2: Zerg\nEnter user's tribe >> ");
            int tribeNum = scanner.nextInt();
            if (tribeNum >= 0 && tribeNum <= 2) {
                return tribeCon(tribeNum);
            } else {
                System.out.println("Enter again");
            }
        }
    }

    private static Tribe tribeCon(int tribeNum) {
        if (tribeNum == 0) {
            return new Terran();
        } else if (tribeNum == 1) {
            return new Protos();
        } else if (tribeNum == 2) {
            return new Zerg();
        }
        return null;
    }

    private static void run(Tribe user, Tribe computer, Scanner scanner) {
        System.out.println("Game Start");
        boolean turnCheck = true;
        int attack = 0, defense = 0;
        while (true) {
            printTwoTribe(user, computer);

            if (turnCheck) {    // user턴
                System.out.print("아군의 공격차례입니다. \n공격할 아군의 유닛번호를 입력하세요 >> ");
                attack = scanner.nextInt();
                System.out.print("공격 대상의 적군 유닛 번호를 입력하세요 >> ");
                defense = scanner.nextInt();
                attackUnit(user, attack, defense);
            } else {          // computer 턴
                attack = random.nextInt(computer.getLeftUnit());
                defense = random.nextInt(user.getLeftUnit());
                attackUnit(computer, attack, defense);
            }

            turnCheck = !turnCheck;
            if (user.getLeftUnit() == 0) {
                System.out.println("User Lose");
                break;
            } else if (computer.getLeftUnit() == 0) {
                System.out.println("User Win");
                break;
            }
        }
    }

    private static void attackUnit(Tribe attacker, int attack, int defense) {
        if (attacker.equals(usr)) {
            System.out.println("아군 유닛 " + attack + ". " + usr.getUnit(attack) +
                    "이 적군 유닛 " + defense + ". " + com.getUnit(defense) + "를 공격합니다");
            usr.getUnit(attack).attack(com.getUnit(defense));

            if (com.getUnit(defense).getDefense() <= 0) {
                com.deleteUnit(defense);
                System.out.println("적군 유닛이 제거되었습니다.");
            }

        } else if (attacker.equals(com)) {
            System.out.println("적군 유닛 " + attack + ". " + com.getUnit(attack) +
                    "이 아군 유닛 " + defense + ". " + usr.getUnit(defense) + "를 공격합니다");
            com.getUnit(attack).attack(usr.getUnit(defense));

            if (usr.getUnit(defense).getDefense() <= 0) {
                usr.deleteUnit(defense);
                System.out.println("아군 유닛이 제거되었습니다.");
            }
        }
    }


    private static void printTwoTribe(Tribe user, Tribe computer) {
        System.out.println("아군: " + user.getClass().getSimpleName());
        user.printTribe();
        System.out.println("적군: " + computer.getClass().getSimpleName());
        computer.printTribe();
    }
}
