public class Main {
    public static void main(String[] args) {
        double[] nombers={1.4, 3.5, -8.8,2.7,3.4,1.4,-9.7, 5.6,3.7,-8.9,1.3,-9.1,1.5,1.6 };
        double symma=0;
        int kolichestvo=0;
        boolean proverka=false;
        for (double nums: nombers) {
            if (nums < 0){
                proverka = true;
            }else if (nums >0 && proverka){
                symma += nums;
                kolichestvo++;
                System.out.println(nums);
            }
        }
        System.out.println("Среднее арифметическое: "+ symma/kolichestvo);
    }
}