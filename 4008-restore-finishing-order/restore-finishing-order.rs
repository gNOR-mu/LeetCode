impl Solution {
    pub fn recover_order(order: Vec<i32>, friends: Vec<i32>) -> Vec<i32> {
        order.into_iter().filter(|&x| friends.contains(&x)).collect()
    }
}