//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

import java.util.Arrays;
import org.junit.Test;

public class ChineseTaiWanICardTest {
    static String[] TEST_ID = new String[]{"B143784338", "P191343620", "F103228551", "E291385097", "I202472885", "Y186643003", "S197109947", "T287188493", "B199170084", "M215435081", "K197343425", "W165115765", "I166085188", "O212634110", "V190040028", "E179121140", "H293698072", "Y194352646", "U191254687", "F213028814"};

    public ChineseTaiWanICardTest() {
    }

    @Test
    public void valid() {
        assert Arrays.stream(TEST_ID).allMatch(ChineseTaiWanICard::valid);

        assert !ChineseTaiWanICard.valid("F213028813");

        assert !ChineseTaiWanICard.valid("");

        assert !ChineseTaiWanICard.valid("F313028813");

        assert !ChineseTaiWanICard.valid("1213028813");

        assert !ChineseTaiWanICard.valid("F213028W13");

        assert !ChineseTaiWanICard.valid("F313028W1");

    }
}
