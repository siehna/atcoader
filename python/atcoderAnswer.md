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