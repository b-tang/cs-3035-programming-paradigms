import sys

# function user_inputs
def menu(min, max, string):
    while(True):
        try:
            userInput = int(input("Please enter the " + string + " of an integer between " +  str(min) + " and " + str(max) + ": "))
            if (not min <= userInput <= max):
                raise ValueError()
            return userInput
        except ValueError:
            print("Invalid input, please try again.")

# function converts to fahrenheit
def conversion(c):
    return c * (9.0 / 5.0) + 32

# calls min and max values
minValue = menu(-500, 500, "minimum value")
maxValue = menu(minValue, 500, "maximum value")

# loops between the range and prints the values in the formatted table
for i in range(minValue, maxValue + 1):
    print("{:3} celsius to{:8.2f} fahrenheit".format(i, conversion(i)))

# main
if __name__ == "__main__":
    sys.exit()