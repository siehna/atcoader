
# 3空港間の距離
p, q, r = map(int, input().split())

# 最短時間の表示
print(min([p+q, q+r, r+p]))