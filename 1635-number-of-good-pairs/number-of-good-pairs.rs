use std::collections::HashMap;

impl Solution {
pub fn num_identical_pairs(nums: Vec<i32>) -> i32 {
    let mut res = 0;
    let mut counts = HashMap::new();

    for &num in &nums {
        let entry = counts.entry(num).or_insert(0);
        res += *entry;
        *entry += 1;
    }

    res

}
}