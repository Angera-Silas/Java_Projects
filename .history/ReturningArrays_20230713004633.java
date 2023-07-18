public class ReturningArrays {
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i = 0,j = result.length-1;i<list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse(new int[] {10,2,3,6,8,9,4,5}));
    }
}
