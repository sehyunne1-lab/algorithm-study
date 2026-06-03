class Solution {
    public int solution(int a, int b) {
        String s1 = a + "" + b;
        String s2 = b + "" + a;
        
        if(Long.parseLong(s1) >= Long.parseLong(s2)){
            return Integer.parseInt(s1);
        } else {
            return Integer.parseInt(s2);
        }
    }
}
