impl Solution {
    pub fn mirror_distance(n: i32) -> i32 {
    let mut res = 0;
    let mut n2 = n;
    while n2 > 0{
        res *= 10;
        res += n2 % 10;
        n2 /= 10;
    }
    (res - n).abs()
    }
}