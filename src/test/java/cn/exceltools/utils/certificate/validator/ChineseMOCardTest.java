//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

import java.util.Arrays;
import org.junit.Test;

public class ChineseMOCardTest {
    static String[] idNo = new String[]{"1228150(7)", "1000248(3)", "5215299(8)"};

    public ChineseMOCardTest() {
    }

    @Test
    public void testValidIdCard() {
        assert Arrays.stream(idNo).allMatch(ChineseMOCard::valid);

        assert !ChineseMOCard.valid("1000248");

        assert !ChineseMOCard.valid("20002487");

    }
}
