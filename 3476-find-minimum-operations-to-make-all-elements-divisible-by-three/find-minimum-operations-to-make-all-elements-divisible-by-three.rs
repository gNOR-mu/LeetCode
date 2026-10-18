impl Solution {
    pub fn minimum_operations(nums: Vec<i32>) -> i32 {
        let mut res = 0;
        for i in nums{
            res += if i % 3 != 0 {1} else {0};
        }
        res
    }
}