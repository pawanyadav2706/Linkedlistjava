public class Happynum{
    public static void main(String[] args){
        int n = 19;
        Solution s = new Solution();
        boolean ans  = s.isHappy(n);
        System.out.println(ans);

    }
}
class Solution {
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }else{
            return false;
        }
    }

    private int findsquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans = ans + rem * rem;
            number = number / 10;
        }
        return ans;
    }
}