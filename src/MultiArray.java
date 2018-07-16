import java.util.Random;

public class MultiArray {

    Random rand = new Random();

    public int [][] tablica;


    public MultiArray(int n, int m){
        this.tablica = new int[n][m];
        randomize();
    }

    public int[][] getTablica() {
        return tablica;
    }

    public void setTablica(int[][] tablica) {
        this.tablica = tablica;
    }

    public void randomize(){
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length;j ++){
                tablica[i][j] = rand.nextInt(100);
            }
        }

    }

    public int findMin(){
        int minValue = tablica[0][0];
        for (int i = 1; i < tablica.length; i++) {
            for(int j = 1; j < tablica[i].length; j++){
                if (tablica[i][j] < minValue) {
                minValue = tablica[i][j];
                }
            }
        }

        return minValue;
    }


    public int findMax(){
            int maxValue = tablica[0][0];
            for (int i = 1; i < tablica.length; i++) {
                for (int j = 1; j < tablica[i].length; j++) {
                    if (tablica[i][j] > maxValue) {
                        maxValue = tablica[i][j];
                    }
                }
            }
            return maxValue;
    }


    public void info(){
        for(int i = 0; i< tablica.length;i++){
            for (int j = 0; j < tablica[i].length; j++){
                System.out.print(tablica[i][j] + " ");
            }
        }
    }

}
