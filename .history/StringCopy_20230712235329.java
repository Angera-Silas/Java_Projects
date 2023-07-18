public class StringCopy {
    public static void main(String[] args) {
        char[] str1 = {'w','e','l','c','o','m','e',' ','t','o',' ','j','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
        String str2 = "";
        str2 = str2.copyValueOf(str1);
        System.out.println("Returned String "+str2);
        /*We can also copy just a specified section by using index */
        str2 = str2.copyValueOf(str1, 11,24);
        System.out.println("Returned String "+str2);
    }
}
