# n, k: 数値　s: 文字列　が与えられる
# k文字目を入れ替えよ

n, k = map(int, input().split())
s = input()

# dic = {"A":"a", "B":"b", "C":"c"}

# キーとなる文字　文字列のインデックスは0から
# s[k-1]


# 小文字にする表現がある 下記なら1発
print(s[:k-1] + s[k-1].lower() + s[k:])

# [開始インデックス:終了インデックス] 数値は　より大　と　未満
# print(s[:k-1] + dic.get(s[k-1]) + s[k-1:])