//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

public class ChineseTaiWanICard {
    static int[] WEIGHTING = new int[]{1, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    static String CODE_VALUE = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

    public ChineseTaiWanICard() {
    }

    public static int alphaToInt(char c) {
        int i = CODE_VALUE.indexOf(c);
        return i == -1 ? i : CODE_VALUE.indexOf(c) + 10;
    }

    public static boolean valid(String id) {
        if (id != null && !id.isEmpty()) {
            if (id.length() != 10) {
                return false;
            } else {
                char[] charSeq = id.toCharArray();
                int sumValue = 0;

                int i;
                for(i = 0; i < 9; ++i) {
                    char testc = charSeq[i];
                    if (i == 0) {
                        int val = alphaToInt(testc);
                        if (val == -1) {
                            return false;
                        }

                        sumValue += val / 10 * WEIGHTING[0];
                        sumValue += val % 10 * WEIGHTING[1];
                    } else {
                        if (testc < '0' || testc > '9') {
                            return false;
                        }

                        if (i == 1 && testc != '1' && testc != '2') {
                            return false;
                        }

                        sumValue += (testc - 48) * WEIGHTING[i + 1];
                    }
                }

                i = charSeq[9] - 48;
                return (10 - sumValue % 10) % 10 == i;
            }
        } else {
            return false;
        }
    }
}
