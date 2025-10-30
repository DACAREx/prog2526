a = int(input("Introducir primer numero "))
b = int(input("Introducir segundo numero "))
while (a != 0) and (b!= 0):
    if a > b:
        a = a - b
    else:
        b = b - a
mcd = a if a != 0 else b

print("El maximo comun divisor es: ", mcd)
