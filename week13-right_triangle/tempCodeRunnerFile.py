def hypotenuse(s1, s2):
    hyp = (((s1*s1) + (s2*s2))**(1/2))
    return hyp


s1 = float(input("Enter side 1 : "))
s2 = float(input("Enter side 2 : "))
print(hypotenuse(s1, s2))