impl Solution {
    pub fn roman_to_int(s: String) -> i32 {
    let mut sum = 0;
    let mut prev = 0;

    for c in s.chars().rev() {
        let num = match &c {
            'I' => 1,
            'V' => 5,
            'X' => 10,
            'L' => 50,
            'C' => 100,
            'D' => 500,
            'M' => 1000,
            _ => 0,
        };
        sum += if num < prev {-num} else {num};
        prev = num;
    }

    sum
    }
}