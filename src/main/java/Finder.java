public class Finder {
    public static int findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) return 0; //can't return null, because int

        int currentMax = intArray[0];
        for (int i : intArray) {
            if (i > currentMax) currentMax = i; //Math.Max?
        }
        return currentMax;
    }

    public static int findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) return 0; //can't return null, because int

        int currentMin = intArray[0];
        for (int i : intArray) {
            if (i < currentMin) currentMin = i; //Math.Min?
        }
        return currentMin;
    }
}
