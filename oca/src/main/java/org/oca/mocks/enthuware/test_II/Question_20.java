package org.oca.mocks.enthuware.test_II;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_20 {

    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        PlaceHolder_Q20<Integer, Integer> placeHolderQ20 = PlaceHolder_Q20.getDuplicate(Integer.parseInt("3"), Integer.parseInt("5"));
        System.out.println(placeHolderQ20.getK());
        System.out.println(placeHolderQ20.getV());
    }
}

class PlaceHolder_Q20<K,V>{
    private K k;
    private V v;

    public PlaceHolder_Q20(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public static <X,Y>PlaceHolder_Q20<X, Y> getDuplicate(X x, Y y){
        return new PlaceHolder_Q20<X, Y>(x,y);
    }
}
