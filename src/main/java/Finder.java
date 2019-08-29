public class Finder {

    public static Integer findMax(int[] intArray) {
        if(!checkCondition(intArray)) {
            return null;
        }

        int max = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }

        return max;

    }

    public static Integer findMin(int[] intArray) {
        if(!checkCondition(intArray)) {
            return null;
        }

        int min = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] < min) {
                min = intArray[i];
            }
        }

        return min;

    }

    public static boolean checkCondition(int[] a) {
        if(a == null || a.length == 0) {
            return false;
        }
         return true;
    }




}
