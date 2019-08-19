a, b = map(int, input().split())

# 最大を求める
print(max(a+b, a-b, a*b))