impl Solution {
    pub fn difference_of_sums(n: i32, m: i32) -> i32 {
           let mut num1 = 0;
    let mut num2 = 0;

    for i in 1..=n{
        num1 += if i%m == 0 {0} else { i };
        num2 += if i%m == 0 {i} else { 0 };
    }
  
    num1 - num2 
    }
}