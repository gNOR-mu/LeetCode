use std::collections::HashSet;

impl Solution {
    pub fn max_distinct(s: String) -> i32 {
        HashSet::<char>::from_iter(s.chars()).len() as i32
    }
}