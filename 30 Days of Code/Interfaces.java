//Write your code here
class Calculator implements AdvancedArithmetic
    {
    public int divisorSum(int n)
        {
        int s=0;
        for(int i=1;i<=n/2;i++)
            {
            if(n%i==0)
                s=s+i;
        }
        s=s+n;
        return s;
        
    }    
}