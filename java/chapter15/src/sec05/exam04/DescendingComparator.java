package sec05.exam04;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit>{
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return 1; //가격이 적을 경우 뒤로(내림차순)
        else if(o1.price == o2.price) return 0;
        else return -1;
    }
}
