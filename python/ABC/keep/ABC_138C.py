n = int(input())
vs = list(map(int, input().split()))

vv = vs.sort()
ans = vv[0]

for i in range(1,n):
    ans = (ans + vv[i]) / 2

print(ans)