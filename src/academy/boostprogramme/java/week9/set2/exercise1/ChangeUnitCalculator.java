package academy.boostprogramme.java.week9.set2.exercise1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ChangeUnitCalculator {

    private List<MoneyUnit> units = EuroUnit.get();

    public List<MoneyUnit> calculate(double change) {
        List<MoneyUnit> notes = new ArrayList<>();
        while (change > 0) {
            Optional<MoneyUnit> oUnit = getUnit(change);
            MoneyUnit unit = oUnit.get();
            notes.add(unit);
            change = subtract(change, unit);
        }
        return notes;
    }

    private double subtract(double change, MoneyUnit unit) {
        return BigDecimal.valueOf(change)
                .subtract(BigDecimal.valueOf(unit.getValue()))
                .doubleValue();
    }

    private Optional<MoneyUnit> getUnit(double change) {
        return units.stream()
                .filter(getMoneyChange(change))
                .findFirst();
    }

    private Predicate<MoneyUnit> getMoneyChange(double change) {
        return unit -> unit.getValue() <= change;
    }
}
