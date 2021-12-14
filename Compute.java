// To find the Max and Min of an Array
//comment
class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

class Compute
{
    static pair getMinMax(long a[], long n)
    {
        //Write your code here
        long min = a[0];
        long max = a[0];

        for(int i = 0; i<n; i++)
        {
            if(a[i] < min)
                min = a[i];

            if(a[i] > max)
                max = a[i];
        }

        pair p = new pair(min,max);
        return p;
    }
}
