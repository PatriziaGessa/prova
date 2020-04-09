package academy.boostprogramme.java.week5.reflaction.exercise2;

import java.util.ArrayList;
import java.util.List;


public class LinesCalculator {

    public List<String> calculate (List<String> strings) {
        int size = strings.size();
        if(size == 1) {
           return List.of();
        }
        if(strings.isEmpty()) {
            return List.of();
        }

        List<String> quaqua = ff(strings);
        List<Integer> integers = transformToInteger(quaqua);
        int number = calculatorSum(integers);

        return transformToString(number);

    }

    private List<String> ff (List<String> strings) {

        List<String> output = new ArrayList<>();
        for(String string : strings){
            List<String> split = List.of(string.split(","));

            output.addAll(split);
        }
        return output;
    }

    private List<Integer> transformToInteger (List<String> strings) {

        List<Integer> integers = new ArrayList<>();
        for(String string : strings) {
            int numb = Integer.parseInt(string);
            integers.add(numb);
        }
        return integers;
    }

    private int calculatorSum (List<Integer> integers) {

        int sum = 0;
        for(Integer integer : integers) {
            sum +=integer;
        }
        return sum;
    }

    private List<String> transformToString (int numb) {

        List<String> strings = new ArrayList<>();
        String string = String.valueOf(numb);
        strings.add(string);

        return strings;
    }

    public static void main(String[] args) {

        LinesCalculator calculator = new LinesCalculator();

        List<String> input = List.of("1");

        List<String> result = calculator.calculate(input);
        System.out.println(result);
    }
}
