import sys

def main():
    data = input('Enter a string: ')
    print(attrition(data))
    print(reverse(data))
    print(isPalindrome(data))

def attrition(data):
    if (len(data)) == 0:
        return 0
    else:
        return + 1 + attrition(data[1:])

def reverse(data):
    if (len(data) == 0 or len(data) == 1):
        return data
    else:
        return reverse(data[1:]) + data[0]

def isPalindrome(data):
    data = data.lower()
    if (len(data)) < 2: 
        return True
    elif (data[0] == data[len(data) - 1]):
        return isPalindrome(data[1:len(data) - 1])
    else:
        return False

# def isPalindrome(data):
#     data = data.lower()
#     if (len(data)) == 1: 
#         return True
#     elif (len(data)) == 2:
#         return data[0] == data[1]
#     else:
#         return isPalindrome(data[1:-1])

if __name__ == "__main__":
    sys.exit(main())
    