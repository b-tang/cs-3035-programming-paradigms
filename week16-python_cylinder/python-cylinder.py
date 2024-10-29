import math


class cylinder:
    _radius = 0.0
    _height = 0.0
    _volume = 0.0

    def __init__(self, radius, height = 1):
        try:
            if radius < 0:
                raise Exception("Radius may not be less than 0")
            elif height < 0:
                raise Exception("Height may not be less than 0")
            else:
                self._radius = float(radius)
                self._height = float(height)
                self._volume = 3.14159 * \
                    math.pow(self._radius, 2) * self._height
        except:
            print("Input error.")

    def __eq__(self, other):
        if other == None:
            return False
        elif ((other._volume - self._volume) < 0.001):
            return True
        else:
            return False

    def __str__(self, other):
        if (self.__eq__(other)):
            return "Volume of both cylinders are equal"
        else:
            return "Volumes of both cylinders are not equal"


while (True):
    try:
        print("Cylinder 1")
        radius1 = float(input("Enter the radius: "))
        height1 = float(input("Enter the height: "))
        if radius1 < 0:
            raise Exception("Radius may not be less than 0")
        elif height1 < 0:
            raise Exception("Height may not be less than 0")
        else:
            c1 = cylinder(radius1, height1)
            break
    except:
        print("Input error! Please try again. ")

while (True):
    try:
        print("\nCylinder 2")
        radius2 = float(input("Enter the radius: "))
        height2 = float(input("Enter the height: "))
        if radius2 < 0:
            raise Exception("Radius may not be less than 0")
        elif height2 < 0:
            raise Exception("Height may not be less than 0")
        else:
            c2 = cylinder(radius2, height2)
            break
    except:
        print("Input error ! Try again. ")

print("\nOutput:")
print(c1 == c1)
print(c1.__eq__(c2))
print(c1.__str__(c1))
print(c1.__str__(c2), "\n")