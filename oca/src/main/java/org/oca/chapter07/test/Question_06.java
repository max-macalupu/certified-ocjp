package org.oca.chapter07.test;

import java.sql.SQLException;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class Question_06 {

    public static void main(String[] args) {
        try {
            BaseClass baseClass = new DerivClass();
            baseClass.foo();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

class CustomSqlException extends SQLException{
}

class BaseClass{
    void foo() throws SQLException{
        throw new SQLException();
    }
}

class DerivClass extends BaseClass{
    void foo() throws CustomSqlException{
       throw new CustomSqlException();
    }
}