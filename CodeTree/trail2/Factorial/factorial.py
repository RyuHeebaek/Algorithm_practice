N = int(input())

# Please write your code here.

def solution(n):
    if n==1:
        return n
    
    return solution(n-1)*n

print(solution(N))