public class BreakStatement {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50,60};
        for(int num : numbers)/*an enhanced for loop that*/
        {
            if(num==50){
                break;
            }
        }
    }
}
