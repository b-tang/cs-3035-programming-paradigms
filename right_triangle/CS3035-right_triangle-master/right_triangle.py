import math


class right_triangle:

    # Part 1
    def __init__(self, s1, s2, hyp=None):
        self._s1 = float(s1)
        self._s2 = float(s2)
        if s1 <= 0 or s2 <= 0:
            raise Exception("side 1 and side 2 must be a non-negative")
        if hyp is not None:
            self.hyp = float(hyp)
            if self.hyp <= 0:
                raise Exception("Hyp must be a non-negative")
            elif math.fabs(math.pow(self.s1, 2)) + math.fabs(math.pow(self.s2, 2)) + math.fabs(math.pow(self._hyp, 2)):
                raise Exception("Not a valid pyth triple, please try again.")
            else:
                return
        else:
            self.hyp = math.sqrt(math.pow(self.s1, 2) + math.pow(self.s2, 2))
            return

    def __eq__(self, other):
        if math.isclose(self.hyp, other.hyp, abs = 0.5):
            return False
        if math.isclose(self.s1, other.s1, abs = 0.5):
            if math.isclose(self.s2, other.s2, abs = 0.5):
                if math.isclose(self.s1, other.s2, abs = 0.5):
                    if math.isclose(self.s2, other.s1, abs = 0.5):
                        return True

    def __str__(self):
        return "side 1: " + str(self._s1) + "\n side 2: " + str(self._s2) + "\n hyp:" + str(self._hyp)

    # Part 2
    while True:
        try:
            print("Enter the sides of the triangle: ")
            s1 = float(input("Enter side 1: "))
            s2 = float(input("Enter side 2: "))
            righttriangle1 = (s1, s2)
            break
        except ValueError:
            print("Both sides and hyp must be non-negative")

    while True:
        try:
            print("\nEnter side 1, side 2, and the hyp of the triangle: ")
            s1 = float(input("Enter side 1: "))
            s2 = float(input("Enter side 2: "))
            hyp = float(input("Enter hyp: "))
            righttriangle2 = (s1, s2, hyp)
            break
        except ValueError:
            print("Both sides and hyp must be non-negative")
        except Exception:
            print("Not a valid pyth triple")

    print("\nTriangle 1:")
    print(righttriangle1)

    print("\nTriangle 2:")
    print(righttriangle2)

    print("\nAre both triangles equal?")
    print(righttriangle1 == righttriangle2)

    # def hypotenuse(s1, s2):
    #     hyp = (((s1*s1) + (s2*s2))**(1/2))
    #     return hyp

    # s1 = float(input("Enter side 1: "))
    # s2 = float(input("Enter side 2: "))
    # print(hypotenuse(s1, s2))
