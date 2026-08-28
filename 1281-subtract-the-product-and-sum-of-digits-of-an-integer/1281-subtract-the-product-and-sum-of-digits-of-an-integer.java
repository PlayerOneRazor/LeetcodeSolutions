class Solution {
    public int subtractProductAndSum(int n) {
        int sum,product,result;
        sum=0;
        int temp=0;
        product=1;
        result=0;
        while(n!=0)
        {
        temp=n%10;
        sum+=temp;
        product*=temp;
        n/=10;
        
        }
        result=product-sum;
        return result;
    }
}