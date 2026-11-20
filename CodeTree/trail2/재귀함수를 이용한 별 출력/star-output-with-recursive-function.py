n = int(input())

# Please write your code here.

def solution(k, n):
    if k == n+1:
        return

    print("*"*k)
    solution(k+1, n)

solution(1, n)