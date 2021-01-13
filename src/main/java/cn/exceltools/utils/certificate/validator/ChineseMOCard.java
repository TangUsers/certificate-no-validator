//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

public class ChineseMOCard {
    public ChineseMOCard() {
    }

    public static boolean valid(String id) {
        if (id != null && !id.isEmpty()) {
            int[] cAscii = id.chars().filter((s) -> {
                return s >= 48 && s <= 57;
            }).toArray();
            if (cAscii.length != 8) {
                return false;
            } else {
                return cAscii[0] == 49 || cAscii[0] == 53 || cAscii[0] == 55;
            }
        } else {
            return false;
        }
    }
}
