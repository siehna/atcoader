# 2,000,001 個の石が並べられている（座標 -1,000,000 ~ 1,000,000）
# K個の連続した石が黒、他は白
# 座標Xが黒の時、黒の存在範囲を全て小さい順に表示する

k, x = map(int, input().split())

first = max(-1000000, x-k+1)
end = min(1000000, x+k-1)

for i in range(first, end+1):
    print(i)