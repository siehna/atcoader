# ABC126
## A- Changing a Character
>指定された文字（k文字目）を小文字にする
```ABC126A.py
n, k = map(int, input().split)
s = input()

# 文字オブジェクト.lower() で小文字にできる
print(s[:k-1] + s[k-1].lower() + s[k-1:])
```

# ABC127
## A- Ferris Wheel
>年齢による運賃の変化

```ABC127A.py
a, b = map(int, input().split())

# pythonの演算子はちょっと変なので注意！
if a < 6:
    print(0)
# ↓のように書ける　&&を書かなくてもいい
elif 6 <= a <= 12:
    print(b // 2)
else :
    print(b)
```

# ABC128
## A- ApplePie
>リンゴの欠片と玉を使っていくつのリンゴパイが作れる？
```ABC128A.py
a, p = map(int, input().split())

piece = 3*a + p
# // は切り捨て除算
print(piece // 2)
```

# ABC129
## A- Airplane
>空港間の最短経路
```
# 3空港間の距離
p, q, r = map(int, input().split())

# 全ての空港に行く場合の最短距離
print(min([p+q, q+r, r+p]))
```

# ABC130
## A-Rounding
>数値の丸め
```
x, a = map(int, input().split())

# xがa未満の時0, その他の時10を表示する
if x < a :
    print(0)
else :
    print(10)
```

# ABC131
## A- Security
>連続した数値が存在したらBad
```
code = input()

# 隣に同じ数値（今回は文字でも問題ない）ならBad
print('Bad' if code[0]==code[1] or code[1]==code[2] or code[2]==code[3] else 'Good')
```

# ABC132
## A- Fifty-Fifty
>2種類の文字が2つずつあるかのチェック
```
# ソートして文字を寄せる
s = sorted(input())
# 寄せた文字で条件をかける
if s[0] == s[1] and s[2] == s[3] and s[0] != s[2]:
    print("Yes")
else:
    print("No")
```

# ABC133
## A- T or T
>2つの最小値
```
n, a, b = map(int, input().split())
# ２つの最小値
print(min(b,a*n))
```

# ABC134
## A- Dodecagon
>公式に従った求積
```
r = int(input())
# 公式に従った求積
print(3*r**2)
```

# ABC135
## A- Harmony
>中間値Kを求める。不可能ならIMPOSSIBLE
```
a, b = map(int, input().split())

# 演算子 %は余りを出す //は小数切り捨てて整数値を出す
if (a + b) % 2 == 0:
    print((a+b)//2)
else:
    print('IMPOSSIBLE')
```

# ABC136
## A- Transfer
>水を移し替えた時の余り
```
a, b, c = map(int, input().split())

# a-b 容器１の空き容量
# 容器2の余り量を求める
ans = c - (a-b)
if ans < 0 :
    print(0)
else :
    print(ans)
```

# ABC137
## A- +-x
>計算値の最大を求める
```
a, b = map(int, input().split())

# 最大を求める
print(max(a+b, a-b, a*b))
```
## B- One Clue
>上限・下限のある範囲計算
```
# 2,000,001 個の石が並べられている（座標 -1,000,000 ~ 1,000,000）
# K個の連続した石が黒、他は白
# 座標Xが黒の時、黒の存在範囲を全て小さい順に表示する

k, x = map(int, input().split())

first = max(-1000000, x-k+1)
end = min(1000000, x+k-1)

for i in range(first, end+1):
    print(i)
```

# ABC138
## A- Red or Not
>aが特定値以下の時Redと表示
```
a = int(input())
s = input()

if a < 3200:
    print('red')
else :
    print(s)
```
## B- Resistors in Parallel
>逆数の和の逆数計算
```
n = int(input())
aa = list(map(int, input().split()))

g = 0

# for 文書きたくねぇ せめてリスト内包表記で
for a in aa:
    g += 1 / a

print(1 / g)
```