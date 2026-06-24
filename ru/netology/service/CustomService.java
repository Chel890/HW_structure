package ru.netology.service;

public class CustomService {
    public static final int CALCULATE_CASTOM(int price, int weight) {
        int result = (price/100) + (weight*100);
        return result;
    }
}
