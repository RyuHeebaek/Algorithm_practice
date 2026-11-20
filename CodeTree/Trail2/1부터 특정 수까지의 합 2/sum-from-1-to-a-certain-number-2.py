N = int(input())

# Please write your code here.
def solution(n):
    if n==N:
        return n
    
    return solution(n+1)+n

print(solution(1))