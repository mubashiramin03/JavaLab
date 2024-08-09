
// Biggest number in array
class Biggest{
    public static void main(String[] args) {
        int x[]={2,5,10,1,0};
        int max=0;
        for(int i: x)
        {
           if(i>max)
                max=i;
        }
        System.out.println("Biggest number in array is: "+max);
    }
}
