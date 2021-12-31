public class ArrayJava {
    public static void main(String[] args) {
        String[] driver = {"Max Verstappen", "Lewis Hamilton", "Lando Norris", "Carlo Sainz", "Daniel Ricciardo"};
        System.out.println(driver[0]);

        driver[2] = "Sebastian Vettel";
        System.out.println(driver[2]);

        System.out.println(driver.length);

        for (int i = 0; i < driver.length; i++) {
            System.out.println(driver[i]);
        }


        for (String d:
             driver) {
            System.out.println(d);
        }


//        Multidimensial Array

        int[][] myNum = {{2, 4, 6, 7,}, {8, 9, 7, 9}};

        for (int j = 0; j < myNum.length; j++) {
            for ( int k = 0; k < myNum[j].length; k++) {
                System.out.println(myNum[j][k]);
            }
        }
    }
}
