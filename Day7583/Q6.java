package Day7583;

class Q6{
public int Q6 (int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int Ar1=(ax2-ax1)*(ay2-ay1);
        int Ar2=(bx2-bx1)*(by2-by1);
        int cx1=Math.max(ax1,bx1),cy1=Math.max(ay1,by1);
         int cx2=Math.min(ax2,bx2),cy2=Math.min(ay2,by2);
        int cl=(cx2-cx1),ch=(cy2-cy1);// find the cordinates of overlaped rectangle
        int ac=0;
        if(cl>0&&ch>0)
        {
            ac=cl*ch;//if rectangle is possible then find the area
        }
        return Ar1+Ar2-ac;
    }
}
