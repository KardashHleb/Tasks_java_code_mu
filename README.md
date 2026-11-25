# Java solutions for code.mu exercises

A solutions book for the Java practice tasks from [code.mu](https://code.mu): ten levels, ten
sub-levels each, about 420 small problems in total. Every task is solved in its own class and
covered by JUnit tests.

The solutions are one way to solve each task, not the only one. They are written to be read:
short methods, plain names, and loops written by hand where the loop is the point of the exercise.
If your own solution looks different but passes the same tests, it is just as valid.

## What is inside

| Levels | Topics |
|--------|--------|
| 1-2    | Conditions, loops, digits of a number, simple arrays, unit conversions |
| 3-4    | String and array manipulation, filters, number formats, case conversions |
| 5-6    | Matrices, text patterns and pyramids, digit tricks, dates with `java.time` |
| 7-8    | Randomness and shuffling, weekdays and zodiac signs, files and folders with `java.nio.file` |
| 9-10   | Primes, GCD/LCM, fractions, permutations, school-style arithmetic, matrix transforms |

## Project layout

```
src/main/java/org/example/
    common/FileUtils.java      shared UTF-8 file helpers used by the file tasks
    level1_1/ ... level10_10/  one package per sub-level, one class per task
src/test/java/org/example/
    level1_1/ ... level10_10/  <TaskClass>Test for every task class
```

Conventions used across all tasks:

- A task method computes and **returns** its result. Nothing is printed; the tests are the way to
  run and check a solution.
- Invalid input throws `IllegalArgumentException` with a message that names the problem.
- Code that depends on the current date or on randomness takes a `LocalDate` or `Random`
  parameter, so it can be tested deterministically. A no-argument overload uses the real clock or
  a fresh `Random`.
- File tasks take `java.nio.file.Path` and read and write text as UTF-8 through `FileUtils`.
- The standard library is used for incidental work (sorting, joining, date formatting, file IO).
  The algorithm that the exercise is about is written out by hand.

## Building and running the tests

Requires JDK 21 and Maven.

```
mvn test
```

To run a single level or a single task:

```
mvn test -Dtest='org.example.level10_*.*Test'
mvn test -Dtest=EratosthenesTest
```

## Notable solutions

Most tasks are short exercises, but some of them are classic algorithms or use a trick worth
knowing. Here they are with short explanations.

### Sieve of Eratosthenes
[`level10_8/Eratosthenes`](src/main/java/org/example/level10_8/Eratosthenes.java)

To find all primes up to `n`, keep a boolean array of "crossed out" numbers. For every number `i`
that is still not crossed out, cross out all its multiples, starting from `i * i`: smaller
multiples `k * i` with `k < i` were already crossed out when processing `k`'s prime factors. The
outer loop can stop once `i * i > n`. Whatever is left is prime. This runs in `O(n log log n)`
time, much faster than testing each number on its own, at the cost of `O(n)` memory.
Compare it with [`level10_2/RangePrimes`](src/main/java/org/example/level10_2/RangePrimes.java),
which checks every number by trial division.

### Period of a decimal fraction
[`level10_2/DecimalPeriod`](src/main/java/org/example/level10_2/DecimalPeriod.java)

Long division of `a / b` produces each next digit from the current remainder alone:
`digit = remainder * 10 / b`, `remainder = remainder * 10 % b`. So as soon as a remainder repeats,
the digits repeat too. The solution remembers the position where each remainder first appeared;
when one comes back, the period is the run of digits from that position to the end. A remainder of
zero means the fraction is finite. There are fewer than `b` possible remainders, so the loop takes
at most `O(b)` steps: `1/7` gives `142857`, `1/6` gives `6`.

### Euclid's algorithm and common divisors
[`level10_2/SchoolGcd`](src/main/java/org/example/level10_2/SchoolGcd.java),
[`level2_10/CommonDivisorsFinder`](src/main/java/org/example/level2_10/CommonDivisorsFinder.java)

`gcd(a, b) = gcd(b, a mod b)`, and `gcd(a, 0) = a`. Every two steps the larger number at
least halves, so the algorithm takes `O(log min(a, b))` steps. `SchoolGcd` returns every
step written as `a = b * q + r`, the way it is done on paper.

`CommonDivisorsFinder` uses the fact that every common divisor of `a` and `b` divides their GCD.
It finds the GCD first and then lists its divisors by checking only `i <= sqrt(gcd)`: each hit `i`
also gives its pair `gcd / i`. The total cost is `O(log min(a, b) + sqrt(gcd))` instead of
checking every number up to `min(a, b)`.

### Prime factorization by trial division
[`level10_2/PrimeFactors`](src/main/java/org/example/level10_2/PrimeFactors.java),
[`level10_5/SchoolFactorization`](src/main/java/org/example/level10_5/SchoolFactorization.java)

Divide by 2 as long as possible, then by 3, 4, 5 and so on. Composite divisors never fire, because
their prime factors were already divided out. Only divisors with `d * d <= n` need checking: once
the remaining value has no divisor up to its square root, it is itself prime and is the last
factor. The loop condition is written as `d <= n / d`, which avoids `int` overflow for large `n`.
Time is `O(sqrt n)`.

### Permutations with backtracking
[`level10_10/ArrayPermutations`](src/main/java/org/example/level10_10/ArrayPermutations.java),
[`level10_6/LetterPermutations`](src/main/java/org/example/level10_6/LetterPermutations.java)

Two classic ways to generate all orderings. `ArrayPermutations` swaps each remaining element into
the current position, recurses on the rest, and swaps back, so all `n!` orderings are produced in
place. `LetterPermutations` builds strings one letter at a time, marking used positions in a
`used[]` array, and skips duplicate results, so `"aab"` gives 3 permutations, not 6. Both run in
`O(n * n!)`, which is why the input is limited to 8 elements.

### Fisher-Yates shuffle
[`level7_10/ArrayShuffler`](src/main/java/org/example/level7_10/ArrayShuffler.java)

Walk the array from the last index down to 1 and swap element `i` with a random element at an
index from `0` to `i` inclusive. Every permutation is equally likely. The common mistake of
swapping each element with a random index anywhere in the array gives a biased result. Time is
`O(n)`.

### Picking distinct random elements without retries
[`level7_8/RandomElementsPicker`](src/main/java/org/example/level7_8/RandomElementsPicker.java)

To pick `k` elements from distinct positions, keep a pool and draw a random index from its unused
part. Then overwrite the picked slot with the last unused element and shrink the pool by one. Each
pick is `O(1)` and never needs a retry, unlike "draw again if already taken", which slows down as
the pool empties.

### Sorting the digits of a number with counting sort
[`level6_5/DigitsSorter`](src/main/java/org/example/level6_5/DigitsSorter.java)

There are only ten possible digits, so there is no need to compare them. One pass of `% 10` and
`/ 10` counts how many times each digit appears. A second pass rebuilds the number by appending
digit `d` `count[d]` times, from 0 up to 9. Leading zeros disappear on their own, because
`0 * 10 + 0` is still `0`. Time is `O(d)` for `d` digits, with a fixed array of ten counters.

### Can six digits form a lucky ticket?
[`level10_3/LuckyDigitTicket`](src/main/java/org/example/level10_3/LuckyDigitTicket.java)

A ticket is lucky when its first three digits add up to the same sum as the last three. Trying all
720 orderings of six digits works, but there is a shorter way. The digits can be arranged into a
lucky ticket exactly when some three of them add up to half of the total. So check that the total
is even and try the 20 ways to choose three positions.

### Shuffling words while keeping punctuation in place
[`level8_8/WordsShuffler`](src/main/java/org/example/level8_8/WordsShuffler.java)

A regular expression `[\p{L}\p{N}]+` finds the word slots in the text. The words are collected and
shuffled, and then `Matcher.appendReplacement` writes them back into the original slots in order.
Spaces, punctuation and line breaks stay exactly where they were. `Matcher.quoteReplacement` keeps
`$` and `\` inside words from being treated as special characters.

### Balanced brackets
[`level10_8/BracketsChecker`](src/main/java/org/example/level10_8/BracketsChecker.java)

With a single kind of bracket, a stack is not needed: a counter is enough. It goes up on `(` and
down on `)`. The text is balanced when the counter never drops below zero and ends at zero.
A negative counter means a `)` appeared before its matching `(`. Time is `O(n)`, memory `O(1)`.

### Long division the school way
[`level10_7/ColumnDivision`](src/main/java/org/example/level10_7/ColumnDivision.java)

Digits of the dividend are brought down one at a time. Each quotient digit is
`current / divisor`, and each step is recorded as `current - product = remainder`, which is exactly
the layout used on paper. The arithmetic is done in `long`, so even `Integer.MIN_VALUE / -1` works.
The number of steps equals the number of digits.
