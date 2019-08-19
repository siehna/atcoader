a, b, c = map(int, input().split())

# a-b 容器１の空き容量
# 容器2の余り量を求める
ans = c - (a-b)
if ans < 0 :
    print(0)
else :
    print(ans)