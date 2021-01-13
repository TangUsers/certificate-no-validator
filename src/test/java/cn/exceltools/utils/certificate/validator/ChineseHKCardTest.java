//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

import org.junit.Test;

import java.util.Arrays;

public class ChineseHKCardTest {
    String[] VALIDE_ID = new String[]{"G2156651", "W8159257", "C344353A", "G7356233", "H8860302", "D7976799", "Y8412853", "Y4056440", "Y4395660", "P9963883", "X9166934", "E7492840", "K9164146", "L6427300", "A0038701", "U8953446", "F6270448", "K7164947", "Y3403171", "U4567371"};

    public ChineseHKCardTest() {
    }

    @Test
    public void valid() {

        assert Arrays.stream(VALIDE_ID).allMatch(ChineseHKCard::valid);


        assert ChineseHKCard.valid("U456737(1)");

        assert ChineseHKCard.valid("U456737（1)");

        assert !ChineseHKCard.valid("U456737");

        assert !ChineseHKCard.valid((String) null);

    }
}
