class Solution {
    public int mySqrt(int x) {
       if(x==0||x==1) return x;
int i=0,j=x;
while(j-i>1)
{
int middle=(j+i)/2;
if(middle==x/middle) return middle;
else if (middle<x/middle) i=middle;
else j=middle;
}
return i;


    }
}