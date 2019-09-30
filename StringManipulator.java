public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        return a.trim().concat(b.trim());
    }

    public Integer getIndexOrNull(String a, char b) {
        Integer c = a.indexOf(b);
        if(c == -1) {
            c = null;
        }
        return c;
    }

    public Integer getIndexOrNull(String a, String b) {
        Integer c = a.indexOf(b);
        if(c == -1) {
            c = null;
        }
        return c;
    }

    public String concatSubstring(String a, int b, int c, String d) {
        String str = a.substring(b, c);
        str += d;
        return str;
    }
}