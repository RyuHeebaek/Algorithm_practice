n = int(input())

# Please write your code here.
arr = [i for i in range(n, 0, -1)]
# arr = [5, 4, 3, 2, 1]

def solution(arr, k):
    if k == n:
        return 

    print(arr[k], end=' ')
    solution(arr, k+1)
    print(arr[k], end=' ')

solution(arr, 0)