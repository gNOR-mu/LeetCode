class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> r = new HashMap<>();
        int[] arr2 = new int[arr.length];
        int[] rank = new int[arr.length];
        int ranking = 1;
        for(int i=0;i<arr2.length;i++){
            arr2[i] =arr[i];
        }
        Arrays.sort(arr2);
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
}