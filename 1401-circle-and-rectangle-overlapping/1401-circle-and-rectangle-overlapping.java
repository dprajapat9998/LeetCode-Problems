class Solution {
    public boolean checkOverlap(int radius, int xC, int yC, int x1, int y1, int x2, int y2) {
        int xi=0;
        int yi=0;
        if(xC<x1){
            xi=x1;
        }else if(xC>x2){
            xi=x2;
        }else{
            xi=xC;
        }
        if(yC<y1){
            yi=y1;
        }else if(yC>y2){
            yi=y2;
        }else{
            yi=yC;
        }
        int d = (int)Math.sqrt((xi-xC)*(xi-xC) + (yi-yC)*(yi-yC));
        return d<=radius;
    }
}