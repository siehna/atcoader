N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
C = list(map(int, input().split()))

sat = 0
i = 0

for a in A:
    sat += B[a-1]
    print("hoge")
    if A[i-1]+1 == A[i]:
        sat += C[a-3]
        print(i)
        print(A[i-1])
        print(A[i])
    i += 1

print(sat)