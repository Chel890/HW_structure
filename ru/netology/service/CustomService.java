package ru.netology.service;

public class CustomService {
    public static final int WEIGHT_RATE = 100;
    public static final int calculateCastom(int price, int weight) {
        int result = (price/100) + (WEIGHT_RATE*weight);
        return result;
    }
}
