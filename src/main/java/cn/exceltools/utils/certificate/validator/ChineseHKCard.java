//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

public class ChineseHKCard {
    static int NUMBER_0 = 48;

    public ChineseHKCard() {
    }

    private static int fistLetter(int c) {
        if (c >= 48 && c <= 57) {
            return c - NUMBER_0;
        } else {
            return c >= 65 && c <= 90 ? c - 65 + 1 : -1;
        }
    }

    public static boolean valid(String id) {
        if (id != null && !id.isEmpty()) {
            int[] cAscii = id.toUpperCase().chars().filter((s) -> {
                return s >= 48 && s <= 57 || s >= 65 && s <= 90;
            }).toArray();
            if (cAscii.length != 8) {
                return false;
            } else {
                int sum = 0;

                int reulst;
                for(reulst = 0; reulst < 7; ++reulst) {
                    sum += fistLetter(cAscii[reulst]) * (8 - reulst);
                }

                reulst = sum % 11;
                if (reulst == 1) {
                    return cAscii[7] == 65;
                } else if (reulst == 0) {
                    return cAscii[7] == 48;
                } else {
                    return (11 - reulst) % 10 == fistLetter(cAscii[7]);
                }
            }
        } else {
            return false;
        }
    }
}
