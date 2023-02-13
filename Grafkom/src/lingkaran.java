public class lingkaran {
    public static void main(String[] args) {
        String[][] array = new String[20][20];
        double pi = 3.14;
        int xcenter = 5;
        int ycenter = 5;
        int x; int y;
        int r = 3;
        double inct = 30;

        for (int i=0; i <  array.length; i++){
            for (int j=0; j <  array.length; j++){
                array[i][j] = " ";
            }
        }

        for (double i = 0; i < 2*pi; i+=pi/5){
            x = xcenter + (int)Math.round(r * Math.cos(i) + xcenter);
            y = ycenter + (int)Math.round(r * Math.sin(i) + ycenter);
            array[x][y] = "*";
        }

        for (int i=0; i <  array.length; i++){
            for (int j=0; j <  array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
