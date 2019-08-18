
s = input()

# パターン AABB ABAB ABBA
# 全部同じの場合もあるので一致しないことの条件も入れる
if s[0]==s[1] :
    if s[2]==s[3] and s[0]!=s[2]:
        print('Yes')
    else :
        print('No')
elif s[0]==s[2] and s[0]!=s[1]:
    if s[1]==s[3]:
        print('Yes')
    else :
        print('No')
elif s[2]==s[1] and s[0]!=s[2]:
    if s[0]==s[3]:
        print('Yes')
    else :
        print('No')
else :
    print('No')

# 賢い方法
# ソートして文字を寄せる
s = sorted(input())
if s[0] == s[1] and s[2] == s[3] and s[0] != s[2]:
    print("Yes")
else:
    print("No")