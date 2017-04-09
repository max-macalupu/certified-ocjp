package org.oca.mocks.whizlabs.test_II;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_44 {
    public static void main(String[] args) {
        run_this_awesome_question_for_you();
    }

    private static void run_this_awesome_question_for_you(){
        Map<Double, Account_Q44> data = new HashMap<>();
        data.put(1d, new Account_Q44(1, "mx"));
        data.put(2d, new Account_Q44(2000, "lo"));
        data.compute(2d, getBiFunction());
//        data.compute(3d, getBiFunction());
        System.out.println(data);
    }

    private static BiFunction<Double, Account_Q44, Account_Q44> getBiFunction(){
        BiFunction<Double, Account_Q44, Account_Q44> biFunction = (x,y) -> {
            if(y.getBalance()>100) return new Account_Q44(y.getBalance()+100, "mx");
                    else return  y;
        };
        return biFunction;
    }
}

class Account_Q44{
    private double balance;
    private String holder;

    public Account_Q44(double balance, String holder) {
        this.balance = balance;
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Account_Q44{" +
                "balance=" + balance +
                ", holder='" + holder + '\'' +
                '}';
    }
}
