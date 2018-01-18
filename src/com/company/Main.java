package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner welcome = new Scanner(System.in);
        System.out.println("This program is designed to help solve the 'Tower of Hanoi' game. Please say how many disks your game is using.");
        int disks = welcome.nextInt();
    }
}
