# 2
def slapStooges(stooges, num):
    return ["Slap " + stooges[i % 3] for i in range(num)]


num = int(input("Enter the number of slaps: "))
print(slapStooges(["Moe", "Larry", "Shemp"], num))
