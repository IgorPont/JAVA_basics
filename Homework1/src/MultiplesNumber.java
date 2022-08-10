public class MultiplesNumber {
    static int[] NumGreater(int split, int div) {  // максимальный диапазон == максимальное значение short
        int lenArr = 0;
        for (int i = div + 1; i <= 32767; i++) {
            if ((i % split) == 0)
                lenArr++;
        }
        int[] array = new int[lenArr];
        int index = 0;
        for (int i = div + 1; i <= 32767; i++) {
            if ((i % split) == 0) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    static int[] NumLess(int split, int div) {  // минимальный диапазон == минимальное значение short
        int lenArr = 0;
        for (int i = div - 1; i >= -32768; i--) {
            if ((i % split) != 0)
                lenArr++;
        }
        int[] array = new int[lenArr];
        int index = 0;
        for (int i = div - 1; i >= -32768; i--) {
            if ((i % split) != 0) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}
