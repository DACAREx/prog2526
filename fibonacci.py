N = int(input("Introduce el numero de terminos "))
a = 0
b = 1
x = 0

while x < N:
    print(a," ")
    siguiente = a + b
    a = b
    b = siguiente
    x += 1

