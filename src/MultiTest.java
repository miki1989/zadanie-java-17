public class MultiTest {
    public static void main(String[] args) {


        MultiArray multi = new MultiArray(3,3);
        multi.info();
        System.out.println();

        System.out.println(multi.findMin());
        System.out.println();
        System.out.println(multi.findMax());

    }
}
 /*   int [][] tab2 = new int [10][12]

for(int i = 0; i < tab2.length; i++){
    for(int j = 0; j < tab2[i].length; j++){
        tab2[i][j] = random.nextInt;
        }
}*/