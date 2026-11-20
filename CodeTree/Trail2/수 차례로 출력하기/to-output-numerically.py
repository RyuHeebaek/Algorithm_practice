n = int(input())

# Please write your code here.
answer=[]
result=[]
def solution1(n):
    if n==0:
        return

    result.append(n)
    solution1(n-1)

def solution2(k, n):
    if k==n+1:
        return
    
    answer.append(k)
    solution2(k+1,n)

solution1(n)
solution2(1, n)
print(*answer)
print(*result)
