public class StringCopy {
    public static void main(String[] args) {
        char[] str1 = {'w','e','l','c','o','m','e',' ','t','o',' ','j','a','v','a',' ','P','r','o','g','r','a','m','m',};
        String str2 = "";
        str2 = str2.copyValueOf(str1);
        System.out.println("Returned String "+str2);
    }
}