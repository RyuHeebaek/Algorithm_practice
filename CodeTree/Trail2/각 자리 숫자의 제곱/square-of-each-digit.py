# inpt = input()
# result=0
# for k in inpt:
#     result+=int(k)**2

# print(result)

n = int(input())


def solution(n, answer):
    if n<10:
        answer += n**2
        return answer
        
    answer += (n%10)**2
    return solution(n//10, answer)
    
print(solution(n, 0))