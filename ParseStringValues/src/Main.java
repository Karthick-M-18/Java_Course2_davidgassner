public class Main {
    public static void main(String[] args) {
        var s1 = "Welcome to California!";
        System.out.println("Length of the String : " + s1.length());

        int ind = s1.indexOf("California");
        System.out.println("The position of California in " + ind);

        var sub = s1.substring(11);
        System.out.println(sub);

        var sub2 = s1.substring(11,15);
        System.out.println(sub2);

        String s2 = "  WELCOME          ";
        var lns2 = s2.length();
        System.out.println("Length of s2 : "+lns2);

        var trs2 = s2.trim();
        System.out.println("Trimmed version of s2 : "+trs2);
        System.out.println(trs2.length());
    }
}
