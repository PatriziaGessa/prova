package academy.boostprogramme.java.week3.reflaction.exercise1;

import java.util.List;

public class DoubleListSumCalculator {

    public double calculate (List<Double> numbs) {

        double sum = 0;

        for(int i = 0; i < numbs.size(); i++) {
            double numb = numbs.get(i);
            if(numb < 0){
                numb = numb * -1;
            }
            sum = sum+numb;
        }

        return sum;
    }
}
