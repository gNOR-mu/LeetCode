class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> r = new HashMap<>();
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] rank = new int[arr.length];
        int ranking = 1;
        quickSort(arr2, 0, arr.length - 1);
        for (int i = 0; i < arr2.length; i++) {
            if (!r.containsKey(arr2[i])) {
                r.put(arr2[i], ranking++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            rank[i] = r.get(arr[i]);
        }
        return rank;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}