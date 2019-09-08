# Aの長さ
N = int(input())
# Bは長さ N-1
B = list(map(int, input().split()))
A=[]

if N == 2:
    print(2*B[0])
else :
    B.append(100001)
    ans = 0
    for i in range(N):
        A.append(min([B[i-1], B[i]]))
        ans += A[i]
    print(ans)