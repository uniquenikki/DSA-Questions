You are given an array of integers, your task is to find the next closest element, whose value is smaller than the current element. If there is no such element, print -1. Print the output array.

For example:

Input :- 4 3 1 2

Outout :- 3 1 -1 -1

Since, there are no smaller elements available for 1, 2 output -1. For the other ones, print the next closest smaller element.

Input Format

Input n, the number of elements in the array

In the next line, input n space separated elements.

Constraints

1 <= n <= 100000

1 <= arr[i] <= 1000000000

Output Format

Output n space separated integers, which is the output array.

Sample Input 0

8
1 3 2 6 5 4 7 8
Sample Output 0

-1 2 -1 5 4 -1 -1 -1
