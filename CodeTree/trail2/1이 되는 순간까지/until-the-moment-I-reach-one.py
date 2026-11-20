N = int(input())

# Please write your code here.

def solution(n, cnt):

    if n==1:
        return cnt

    if n%2==0:
        return solution(n//2, cnt+1)
    else: 
        return solution(n//3, cnt+1)

print(solution(N,0))