public class PerfectSqr {

    public static void main(String[] args) {
        System.out.println(sqrchk(36));
    }

    public static boolean sqrchk(int num){
        int sqr=(int)Math.sqrt(num);
        return(sqr*sqr==num);
    }
}