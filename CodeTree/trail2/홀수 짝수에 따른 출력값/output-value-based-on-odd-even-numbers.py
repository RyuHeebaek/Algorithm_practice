N = int(input())

# Please write your code here.

def solution(n):
    if n==N:
        return n
    
    return solution(n+2)+n

if N%2==0:
    print(solution(2))
else:
    print(solution(1))