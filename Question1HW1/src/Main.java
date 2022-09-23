public class Main {
    public static void main(String[] args) {
        CUV obj1 = new CUV();
        String str1 = "aa_";
        System.out.println(CUV.isitaValidUsername(str1));
        String str3 = "u_hello_world123";
        System.out.println(CUV.isitaValidUsername(str3));
    }
}