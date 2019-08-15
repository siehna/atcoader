+ 競プロ python に関するあれやこれや集
+ 解答はコチラ

# Standard I/O

参考　はじめてのあっとこーだー


`input`
```
a
b c
String
```

> a+b+c と String を空白区切りで表示する

`python answer`
``` answer.py
# 数値入力
a = int(input())

# スペース区切りの数値入力
b, c = map(int, input().split())

# 文字列の入力
s = input()

# 出力
print("{} {}".format(a+b+c s))
```

# 文字列
## 文字区切り
```

```

# ABC126
## A- Changing a Character
指定された文字（k文字目）を小文字にする
```ABC126A.py
n, k = map(int, input().split)
s = input()

# 文字オブジェクト.lower() で小文字にできる
print(s[:k-1] + s[k-1].lower() + s[k-1:])
```

