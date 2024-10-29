import sys

# 1
num = [1, 2, 3]
list_num = [(i**3) for i in num]

# 2 
def fv(principal, rate, time):
    curr = principal * ((1 + rate) ** time)
    return curr
tuple1 = [(100, 0.05, 1), (100, 0.05, 2), (100, 0.05, 3)]
tuple1_value = [fv(principal, rate, time) for principal, rate, time in tuple1]

# 3
tuple2 = [(1, 0.05, years) for years in range(1, 101)]
tuple2_value = [fv(principal, rate, time) for principal, rate, time in tuple2]

# 4
def letters(string):
    letterList = [letter for letter in string if letter >= 'a' and letter <= 'z']
    stringTemp = ''
    for letter in letterList:
        stringTemp += letter
    return stringTemp

def main():
    print("#1")
    print(list_num)
    print("")

    print("#2")
    print(tuple1_value)
    print("")

    print("#3")
    print(tuple2_value)
    print("")

    print("#4")
    print(letters("ABCefGhiJkLMNoP"))
    print("")

if __name__ == "__main__":
    sys.exit(main())