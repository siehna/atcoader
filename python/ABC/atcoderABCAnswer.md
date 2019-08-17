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
