public class Main {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Mendapatkan jumlah core
         */

        int coreCount = Runtime.getRuntime().availableProcessors();

        /**
         * @
         *  Mencetak jumlah core
         */


        System.out.println("Jumlah core: " + coreCount);

    }
}
