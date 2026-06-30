# 82. Remove Duplicates from Sorted List II

* Medium
[view question on leetcode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) 
---
* Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:
Input: head = [1,1,1,2,3]
Output: [2,3]
 


<!---LeetCode Topics Start-->
# LeetCode Topics
## Math
|  |
| ------- |
| [0263-ugly-number](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0263-ugly-number) |
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0001-two-sum) |
| [0209-minimum-size-subarray-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0209-minimum-size-subarray-sum) |
| [0713-subarray-product-less-than-k](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0713-subarray-product-less-than-k) |
| [0904-fruit-into-baskets](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0904-fruit-into-baskets) |
| [0930-binary-subarrays-with-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0930-binary-subarrays-with-sum) |
| [1004-max-consecutive-ones-iii](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1004-max-consecutive-ones-iii) |
| [1493-longest-subarray-of-1s-after-deleting-one-element](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1493-longest-subarray-of-1s-after-deleting-one-element) |
| [1658-minimum-operations-to-reduce-x-to-zero](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1658-minimum-operations-to-reduce-x-to-zero) |
| [2958-length-of-longest-subarray-with-at-most-k-frequency](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/2958-length-of-longest-subarray-with-at-most-k-frequency) |
## Binary Search
|  |
| ------- |
| [0209-minimum-size-subarray-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0209-minimum-size-subarray-sum) |
| [0713-subarray-product-less-than-k](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0713-subarray-product-less-than-k) |
| [1004-max-consecutive-ones-iii](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1004-max-consecutive-ones-iii) |
| [1208-get-equal-substrings-within-budget](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1208-get-equal-substrings-within-budget) |
| [1658-minimum-operations-to-reduce-x-to-zero](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1658-minimum-operations-to-reduce-x-to-zero) |
## Sliding Window
|  |
| ------- |
| [0209-minimum-size-subarray-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0209-minimum-size-subarray-sum) |
| [0395-longest-substring-with-at-least-k-repeating-characters](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0395-longest-substring-with-at-least-k-repeating-characters) |
| [0424-longest-repeating-character-replacement](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0424-longest-repeating-character-replacement) |
| [0438-find-all-anagrams-in-a-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0438-find-all-anagrams-in-a-string) |
| [0567-permutation-in-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0567-permutation-in-string) |
| [0713-subarray-product-less-than-k](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0713-subarray-product-less-than-k) |
| [0904-fruit-into-baskets](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0904-fruit-into-baskets) |
| [0930-binary-subarrays-with-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0930-binary-subarrays-with-sum) |
| [1004-max-consecutive-ones-iii](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1004-max-consecutive-ones-iii) |
| [1208-get-equal-substrings-within-budget](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1208-get-equal-substrings-within-budget) |
| [1493-longest-subarray-of-1s-after-deleting-one-element](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1493-longest-subarray-of-1s-after-deleting-one-element) |
| [1658-minimum-operations-to-reduce-x-to-zero](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1658-minimum-operations-to-reduce-x-to-zero) |
| [2958-length-of-longest-subarray-with-at-most-k-frequency](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/2958-length-of-longest-subarray-with-at-most-k-frequency) |
## Prefix Sum
|  |
| ------- |
| [0209-minimum-size-subarray-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0209-minimum-size-subarray-sum) |
| [0713-subarray-product-less-than-k](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0713-subarray-product-less-than-k) |
| [0930-binary-subarrays-with-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0930-binary-subarrays-with-sum) |
| [1004-max-consecutive-ones-iii](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1004-max-consecutive-ones-iii) |
| [1208-get-equal-substrings-within-budget](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1208-get-equal-substrings-within-budget) |
| [1658-minimum-operations-to-reduce-x-to-zero](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1658-minimum-operations-to-reduce-x-to-zero) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0001-two-sum) |
| [0242-valid-anagram](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0242-valid-anagram) |
| [0395-longest-substring-with-at-least-k-repeating-characters](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0395-longest-substring-with-at-least-k-repeating-characters) |
| [0424-longest-repeating-character-replacement](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0424-longest-repeating-character-replacement) |
| [0438-find-all-anagrams-in-a-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0438-find-all-anagrams-in-a-string) |
| [0567-permutation-in-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0567-permutation-in-string) |
| [0904-fruit-into-baskets](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0904-fruit-into-baskets) |
| [0930-binary-subarrays-with-sum](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0930-binary-subarrays-with-sum) |
| [1658-minimum-operations-to-reduce-x-to-zero](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1658-minimum-operations-to-reduce-x-to-zero) |
| [2958-length-of-longest-subarray-with-at-most-k-frequency](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/2958-length-of-longest-subarray-with-at-most-k-frequency) |
## String
|  |
| ------- |
| [0242-valid-anagram](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0242-valid-anagram) |
| [0395-longest-substring-with-at-least-k-repeating-characters](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0395-longest-substring-with-at-least-k-repeating-characters) |
| [0424-longest-repeating-character-replacement](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0424-longest-repeating-character-replacement) |
| [0438-find-all-anagrams-in-a-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0438-find-all-anagrams-in-a-string) |
| [0567-permutation-in-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0567-permutation-in-string) |
| [1208-get-equal-substrings-within-budget](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1208-get-equal-substrings-within-budget) |
## Sorting
|  |
| ------- |
| [0242-valid-anagram](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0242-valid-anagram) |
## Database
|  |
| ------- |
| [1164-product-price-at-a-given-date](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1164-product-price-at-a-given-date) |
| [1693-daily-leads-and-partners](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1693-daily-leads-and-partners) |
| [1731-the-number-of-employees-which-report-to-each-employee](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1731-the-number-of-employees-which-report-to-each-employee) |
| [1789-primary-department-for-each-employee](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1789-primary-department-for-each-employee) |
## Divide and Conquer
|  |
| ------- |
| [0395-longest-substring-with-at-least-k-repeating-characters](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0395-longest-substring-with-at-least-k-repeating-characters) |
## Two Pointers
|  |
| ------- |
| [0567-permutation-in-string](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/0567-permutation-in-string) |
## Dynamic Programming
|  |
| ------- |
| [1493-longest-subarray-of-1s-after-deleting-one-element](https://github.com/adityasakarkar59/Leet-code-patternwise/tree/master/1493-longest-subarray-of-1s-after-deleting-one-element) |
<!---LeetCode Topics End-->