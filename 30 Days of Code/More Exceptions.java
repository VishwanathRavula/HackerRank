//Write your code here

class Calculator 
    {
    int power(int n,int p) throws Exception
        {
        if(n<0 || p<0)
            {
            throw new newEx();
        }
        else
            {
           int result = 1;
    for (int i = 0; i < p; i++) {
        result *= n;
    }
            return result;
        }
    }
}
class newEx extends Exception
    {
    public String getMessage()
        {
        return "n and p should be non-negative";
    }
    
}