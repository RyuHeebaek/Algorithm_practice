n = int(input())

# Please write your code here.
def solution(k):
    if k==0:
        return

    print("* "*k)
    solution(k-1)

def solution2(q):
    if q==n+1:
        return
    
    print("* "*q)
    solution2(q+1)

solution(n)
solution2(1)