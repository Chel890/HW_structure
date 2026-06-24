package ru.netology.service;

public class CustomService {
    public static int calculateCustoms(int price, int weight) {
        int result = (price/100) + (weight*100);
        return result;
    }
}
