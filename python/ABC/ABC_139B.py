a, b = map(int, input().split())
# 切り上げ処理のやり方
# 
if b == 0:
    print(0)
elif 0 < b <= a:
    print(1)
elif b > a :
    print(1 - ( -(b-a)//(a-1) ))