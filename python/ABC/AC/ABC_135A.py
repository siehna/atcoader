a, b = map(int, input().split())

# 演算子%は余りを出す　//は小数切り捨てて整数値を出す
if (a + b) % 2 == 0:
    print((a+b)//2)
else:
    print('IMPOSSIBLE')