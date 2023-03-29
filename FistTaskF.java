public class FistTaskF {
    int fac = 1;
    public int factorial (int number){
        for (int i = 1; i <= number ; i++) {
            fac*=i;
        }
        return fac;
    } 
}
