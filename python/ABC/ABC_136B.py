n = int(input())

#5桁 3桁 1桁な n 以下の数をカウント

if n < 10:
    print(n)
elif 10 <= n < 100:
    print(9)
elif 100 <= n < 1000:
    print(n-99 + 9)
elif 1000 <= n < 10000:
    print(909)
elif 10000 <= n < 100000:
    print(n-999 + 909)
else :
    print(90909)