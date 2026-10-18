use std::collections::HashSet;

impl Solution {
    pub fn max_distinct(s: String) -> i32 {
    let mut total = 0;
    let mut freq = [0; 26];

    for c in s.bytes() {
        let idx = c - b'a';
        let f = freq[idx as usize];
        if f == 0 {
            total += 1;
            freq[idx as usize] = 1;
            if total == 26 {
                return total;
            }
        }
    }
    total
}
}