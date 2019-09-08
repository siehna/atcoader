n = int(input())
aa = list(map(int, input().split()))

g = 0

# for 文書きたくねぇ せめてリスト内包表記で
for a in aa:
    g += 1 / a

print(1 / g)