use std::collections::HashSet;

impl Solution {
    pub fn max_distinct(s: String) -> i32 {
        let mut total = 0;
        let mut freq = [0; 26];

        for c in s.bytes() {
            let idx = c - b'a';

            if freq[idx as usize] == 0 {
                freq[idx as usize] = 1;
                total += 1;

                if total == 26 {
                    break;
                }
            }
        }
        total
}
}