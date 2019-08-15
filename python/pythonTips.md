+ 競プロ python に関するあれやこれや集
+ 解答はコチラ

# 目次

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

# 演算子
## 代数演算子
```

```

## 代入演算子
```

```

# 文字列
## 文字列切り出し
```
# 文字列Sの操配列操作
# S[頭のインデックス : 終わりのインデックス]
# インデックス無指定で最初/最後まで
# インデックスは0始まり

S = "ABCDE"
S[:] = "ABCDE"
S[1:] = "BCDE"
S[1:3] = "BCD"
S[:3] = "ABCD"
```

