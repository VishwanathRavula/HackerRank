    // Add your code here
    Difference(int []a)
        {
        elements=a;
    }

    void computeDifference()
        {
        int max=elements[0];
        int min=elements[0];
        for(int i:elements)
            {
            if(i>max)
                {
                max=i;
            }
            if(i<min)
                {
                min=i;
            }
        }
        maximumDifference=(max-min);
    }