package task4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RandomAlgoritm {
    private int  c;
    private long a, m;

    public RandomAlgoritm(int c, long m) {
        this.c = c;
        this.m = m;
    }

    public RandomAlgoritm a(long a) {
        this.a = a;
        return this;
    }

    public long next() {
        //int n = 0;
        long x = a;
        Long y = 1 * (a * x + c) % m;

        return y;
//        List<Long> num = new ArrayList<>();
//        int i = 0;
//        num(i) =  a;
//
//        for (; ; i++) {
//            long z = 1 * (a * num[i] + c) % m;// x[n + 1] = 1 (a x[n] + c) % m
//
//            num[i] = z;
//
//            return z;

        }
    }

//    public int next() {
//        int i = a * c * m;
//
//        a += 1;
//        m += 3;
//
//        return (i + 800) % 670;