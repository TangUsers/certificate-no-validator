//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.exceltools.utils.certificate.validator;

public class ChineseIDCard {
    static int[] WEIGHTING = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    static int ID_LENGTH = 17;
    static int NUMBER_0 = 48;
    static char[] CHECK_CODE_LIST = new char[]{'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

    public ChineseIDCard() {
    }

    public static boolean valid(String id) {
        if (id != null && !id.isEmpty()) {
            id = id.trim();
            if (id.length() != 18) {
                return false;
            } else {
                char[] idCharts = id.toCharArray();
                char validChart = idCharts[ID_LENGTH];
                int sum = 0;

                for(int i = 0; i < 17; ++i) {
                    int value = idCharts[i] - NUMBER_0;
                    sum += WEIGHTING[i] * value;
                }

                return CHECK_CODE_LIST[sum % 11] == validChart;
            }
        } else {
            return false;
        }
    }
}
