//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

import java.util.Arrays;
import junit.framework.TestSuite;
import org.junit.Test;

public class ChineseIDCardTest extends TestSuite {
    static String[] idNo = new String[]{"350321198506205308", "350127197308066565", "350127196404070519", "352226196807051516", "350211196702010033", "350627197505310018", "352203198509030017", "352122196301220510", "350321198310170035", "350181198508171928", "350127197412251218", "35032219780701251X", "350583198310057112", "350322197803252532", "350301199002182543", "352128197705310021", "350322198910123837", "350321198706055850", "350624197409021014", "35012219780129202X", "350128197101120022", "350623198107100014", "35222819690416251X", "350582197303072030", "350582197908072017", "350211196510150015", "350128196604130017", "350128197610130536", "35032119590104191X", "350321197305056479", "350102195905260212", "352202197108226317", "350481198102270527", "350583199006201014", "350702199103087420", "352624197401133769", "350783198209129514", "350203197601214031", "359001197006290018", "352601197706092510", "350525196704032521", "35052419790311101X", "350321197408046492", "352627196706290233", "350825199212290217", "350102196910290795", "350426198108157029", "350426197803040039", "350301199007102813", "352622196811131515", "35082119831106301X", "350821198312051512"};
    static String[] ERROR_ID_NO = new String[]{"3503211401016469"};

    public ChineseIDCardTest() {
    }

    @Test
    public void testValidIdCard() {
        assert Arrays.stream(idNo).allMatch(ChineseIDCard::valid);

        assert Arrays.stream(ERROR_ID_NO).noneMatch(ChineseIDCard::valid);

        assert !ChineseIDCard.valid("");

        assert !ChineseIDCard.valid((String)null);

    }
}
