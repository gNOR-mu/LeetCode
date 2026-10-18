impl Solution {
    pub fn recover_order(order: Vec<i32>, friends: Vec<i32>) -> Vec<i32> {
    let mut res = Vec::<i32>::new();

    for item in order{
        if friends.contains(&item) && !res.contains(&item){
            res.push(item);
        }
    }
    res
    }
}