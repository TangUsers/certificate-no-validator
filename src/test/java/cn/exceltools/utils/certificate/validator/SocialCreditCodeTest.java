//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

import java.util.Arrays;
import org.junit.Test;

public class SocialCreditCodeTest {
    static String[] validId = new String[]{"91110117669127513U", "91110105685764037M", "9111000066840462XM", "911101066675018826", "91110106668404267T", "911101086691245311", "91110108721473473E", "911101066675000897", "91110105669137949K", "91110108667544137A", "911101056691254115", "91110108669149376W", "911101057629539917", "91110000710935134P"};

    public SocialCreditCodeTest() {
    }

    @Test
    public void valid() {
        assert !SocialCreditCode.valid("");

        assert !SocialCreditCode.valid((String)null);

        assert !SocialCreditCode.valid("91110000710935134");

        assert !SocialCreditCode.valid("91110000710935134X");

        assert !SocialCreditCode.valid("f1110000710935134P");

        assert !SocialCreditCode.valid("94110000710935134P");

        assert !SocialCreditCode.valid("9410000字0935134P");

        assert !SocialCreditCode.valid("911100/0710935134P");

        assert Arrays.stream(validId).allMatch(SocialCreditCode::valid);

    }
}
