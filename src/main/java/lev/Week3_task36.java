/*      Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр. */

public class Week3_task36 {
    public static void main(String[] args) {

        String strRandomBinaryNumber = randomStringOfOnesAndZeros( 16 );
        //strRandomBinaryNumber = "00011";

        System.out.println(strRandomBinaryNumber);
        System.out.println();

        char char2find = '1';
        int[] chain = findChain( strRandomBinaryNumber, char2find );
        System.out.println("Max " + char2find + "-chain starts at position " + chain[0] + " and counts " + chain[1] + " symbols");

        char2find = '0';
        chain = findChain( strRandomBinaryNumber, char2find );
        System.out.println("Max " + char2find + "-chain starts at position " + chain[0] + " and counts " + chain[1] + " symbols");

    }

    public static int[] findChain(String str, char char2find){

        int[] chain = new int[2];
        int maxChainStartIndex = 0;
        boolean chainFlag = false;
        int chainCount = 0;
        int maxChars = 0;

        if (str.charAt(0) == char2find){
            chainFlag = true;
            chainCount = 1;
        }

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == char2find){
                if (chainFlag){
                    chainCount++;
                }
                else{
                    chainFlag = true;
                    chainCount = 1;
                }
            }
            else{
                if (chainFlag){
                    chainCount = 0;
                }
                chainFlag = false;
            }
            if (chainCount > maxChars){
                maxChainStartIndex = i - chainCount + 1;
                maxChars = chainCount;
            }
        }
        chain[0] = maxChainStartIndex;
        chain[1] = maxChars;
        return chain;
    }


    public static String randomStringOfOnesAndZeros(int lengthOfOnesAndZeros){
        String strRandomBinaryNumber = "";
        for (int i = 0; i < lengthOfOnesAndZeros; i++){
            if (Math.random() > 0.5) strRandomBinaryNumber += "1";
            else strRandomBinaryNumber += "0";
        }
        return strRandomBinaryNumber;
    }
}
