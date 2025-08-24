class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     List<Integer> list = new ArrayList<>();
        int index = arr.length-1;
        // cambiar por busqueda binaria
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                index = i;
                break;
            }
        }
        int left = index - 1;
        int right = index;
        while (list.size() != k) {
            if (left >= 0 && right < arr.length) {
                int l = arr[left];
                int r = arr[right];
                int diff = Math.abs(x - l) - Math.abs(x - r);
                if ((l == r) || (diff < 0) || (diff == 0 && l < r)) {
                    list.add(l);
                    left--;
                } else {
                    list.add(r);
                    right++;
                }
            } else if (left < 0) {
                list.add(arr[right]);
                right++;
            } else if (right >= arr.length) {
                list.add(arr[left]);
                left--;
            }

        }
        list.sort((a, b) -> a - b);
        return list;
    }
}