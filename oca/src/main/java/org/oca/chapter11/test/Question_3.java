package org.oca.chapter11.test;

/**
 * Created by mx on 19/2/2017.
 */
public class Question_3 {
}
class Sync{
    public synchronized void foo(){}
}
abstract class Sync2{
    public synchronized void foo(){};
}
interface Sync3{
    public void foo();
}