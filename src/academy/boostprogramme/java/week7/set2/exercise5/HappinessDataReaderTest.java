package academy.boostprogramme.java.week7.set2.exercise5;

import academy.boostprogramme.java.week5.set2.exercise4.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HappinessDataReaderTest {

    HappinessDataReader dataReader = new HappinessDataReader();

    @Test
    void readReturnsCorrectData() {
        List<HappinessRecord> result = dataReader.read();

        int expectedSize = 155;
        Assertions.assertEquals(expectedSize,result.size());
        HappinessRecord expectedFirst = new HappinessRecord("Lesotho",139, 3.80800008773804);
        HappinessRecord resultFirst = result.get(0);
        assertRecordEquals(expectedFirst, resultFirst);

        HappinessRecord expectedLast = new HappinessRecord("Ireland",15,6.97700023651123);
        HappinessRecord resultLast = result.get(result.size()-1);
        assertRecordEquals(expectedLast,resultLast);

    }

    private void assertRecordEquals(HappinessRecord expected, HappinessRecord actual) {
        assertEquals(expected.getCountry(), actual.getCountry());
        assertEquals(expected.getRank(), actual.getRank());
        assertEquals(expected.getScore(), actual.getScore());
    }
}