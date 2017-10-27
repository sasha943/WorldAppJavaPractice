/*      Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр. */

public class Week3_task36 {
    public static void main(String[] args) {

        String strRandomBinaryNumber = "";
        int lengthOfOnesAndZeros = 12;
        for (int i = 0; i < lengthOfOnesAndZeros; i++){
            if (Math.random() > 0.5) strRandomBinaryNumber += "1";
            else strRandomBinaryNumber += "0";
        }

        System.out.println(strRandomBinaryNumber);
        int maxOnesStartIndex = 0;
        int maxZerosStartIndex = 0;
        boolean onesFlag;
        int onesCount = 0;
        int zerosCount = 0;
        int maxOnes = 0;
        int maxZeros = 0;

        if (strRandomBinaryNumber.charAt(0) == '1'){
            onesFlag = true;
            onesCount = 1;
        }
        else
        {
            onesFlag = false;
            zerosCount = 1;
        }

        for (int i = 1; i < strRandomBinaryNumber.length(); i++){
            if (strRandomBinaryNumber.charAt(i) == '1'){
                if (!onesFlag){
                    if (zerosCount > maxZeros){
                        maxZerosStartIndex = i - zerosCount;
                        maxZeros = zerosCount;
                    }
                    zerosCount = 0;
                }
                onesCount++;
                onesFlag = true;
            }
            else{
                if (onesFlag){
                    if (onesCount > maxOnes){
                        maxOnesStartIndex = i - onesCount;
                        maxOnes = onesCount;
                    }
                    onesCount = 0;
                }
                zerosCount++;
                onesFlag = false;
            }
        }
        System.out.println("Max Ones chain starts at position " + maxOnesStartIndex + " and counts " + maxOnes + " ones");
        System.out.println("Max Zeros chain starts at position " + maxZerosStartIndex + " and counts " + maxZeros + " zeros");
    }
}
