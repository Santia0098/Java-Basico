public class Arrays {
    public static void main(String[] args) {

         String[] androidVersions = new String[17];
         String  days[] =  new  String[7];

         String[][] cities = new String[4][2];

         int [][][] numbers = new int[2][2][2];
         int [][][][] numbers4 = new int[1][1][1][1];

         androidVersions[0] = "Apple";
         androidVersions[1] = "Banana";
         androidVersions[2] = "Cupcake";
         androidVersions[3] = "Donut";

         for (int i = 0; i < androidVersions.length - 13; i++){
             System.out.println(androidVersions[i]);
         }

        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion);
        }


        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        System.out.println("\n");

        //Two
        cities[0][0] = "colombia";
        cities[0][1] = "medellin";
        cities[1][0] = "colombia";
        cities[1][1] = "bogota";

        cities[2][0] = "mexico";
        cities[2][1] = "gdl";
        cities[3][0] = "mexico";
        cities[3][1] = "cdmx";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] pair: cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }
        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        //four
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }

        }

        System.out.println("\n");
        //System.out.println(animals[1][0][0][1]);

    }
}
