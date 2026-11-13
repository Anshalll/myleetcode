class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth =0;
        for(int i=0; i < accounts.length; i++){
            int money =0;
            for(int j=0;j < accounts[i].length;j++){
               money= money + accounts[i][j];
            }
             if(money>max_wealth){
                max_wealth=money;
             } 
        }
            return max_wealth;
    }
}