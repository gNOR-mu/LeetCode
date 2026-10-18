impl Solution {
    pub fn mirror_distance(n: i32) -> i32 {
    let mut inv = 0;
    let mut n2 = n;
    while n2 > 0{
        inv = inv*10 + n2 % 10;
        n2 /= 10;
    }
    (inv - n).abs()
    }
}