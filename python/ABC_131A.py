
code = input()
# 隣に同じ数値（今回は文字でも問題ない）ならBad
print('Bad' if code[0]==code[1] or code[1]==code[2] or code[2]==code[3] else 'Good')