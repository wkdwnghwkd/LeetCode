class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int deductX = 0;
        int deductY = 0;
        
        deductX = Math.min(bx2, ax2) - Math.max(bx1, ax1) > 0 ? Math.max(bx1, ax1) - Math.min(bx2, ax2) : 0;
        deductY = Math.min(by2, ay2) - Math.max(by1, ay1) > 0 ? Math.max(by1, ay1) - Math.min(by2, ay2) : 0;
        
        int sum = (ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1) - deductX*deductY;
        
        return sum;
        
    }
}