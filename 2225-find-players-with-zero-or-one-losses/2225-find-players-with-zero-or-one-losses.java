class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList<>();
        
        Map<Integer, Integer> lostCntMap = new HashMap<>();
        
        List<Integer> neverLostGrp = new ArrayList<>();
        List<Integer> oneLostGrp = new ArrayList<>();
        
        for(int[] match : matches) {
            int win = match[0];
            int lose = match[1];
            lostCntMap.putIfAbsent(win, 0);
            lostCntMap.put(lose, lostCntMap.getOrDefault(lose,0)+1);
        }
        
        for(Map.Entry<Integer, Integer> lostCnt : lostCntMap.entrySet()){
            if(lostCnt.getValue() == 0) neverLostGrp.add(lostCnt.getKey());
            if(lostCnt.getValue() == 1) oneLostGrp.add(lostCnt.getKey());
        }
        
        Collections.sort(neverLostGrp);
        Collections.sort(oneLostGrp);
        answer.add(neverLostGrp);
        answer.add(oneLostGrp);
        
        return answer;              
    }
    
}