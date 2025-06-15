class Solution {
    public int maxDiff(int num) {
        String s = "";
        s += num;
        char a = '0';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                a = s.charAt(i);
                break;
            }
        }

        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                ss.append('9');
            } else {
                ss.append(s.charAt(i));
            }
        }
        System.out.println(ss.toString());

        String s2 = "";
        s2 += num;
        char b = '0';

        StringBuilder ss2 = new StringBuilder();
        if (s2.charAt(0) != '1') {
            b = s2.charAt(0);
           
            ss2.append('1');
            for (int i = 1; i < s2.length(); i++) {
                if (s2.charAt(i) == b) {
                    ss2.append('1');
                } else {
                    ss2.append(s2.charAt(i));
                }
            }
        } else {
            for (int i = 1; i < s2.length(); i++) {
                if (s2.charAt(i) != '0' && s2.charAt(i) != '1') {
                    b = s2.charAt(i);
                    break;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == b) {
                    ss2.append('0');
                } else {
                    ss2.append(s2.charAt(i));
                }
            }
        }

        System.out.print(ss2.toString());

        String ans1 = ss.toString();
        String ans2 = ss2.toString();
        int t1 = Integer.parseInt(ans1);
        int t2 = Integer.parseInt(ans2);

        return t1 - t2;
    }
}
