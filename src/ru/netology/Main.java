package ru.netology;

public class Main {

    public static void main(String[] args) {
        int ticketPrice = 12_108;
        int sumForMile = 20;
        int miles;
        miles = ticketPrice / sumForMile;
        System.out.println("Количество миль, полученных за покупку билета = " + miles);
    }
}
