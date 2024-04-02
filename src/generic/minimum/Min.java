package generic.minimum;

public class Min <T extends Comparable<T>> implements MinimumFunc<T>{

    @Override
    public void findMin(T a, T b, T c) {

        T min = a;

        if( b.compareTo(a) < 0){
            min = b;

        }

        if(c.compareTo(b) < 0){
            min = c;
        }

        System.out.println(min);
    }


}

