# 数値の取得
meter = int(input())

#データの整形 float で小数部分を切り捨てずにデータを持てる
kilometer = float(meter) / 1000

#分岐により出力
if kilometer <=0.1:
    printf("00")
elif 0.1 <= kilometer <5: