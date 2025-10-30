N = int(input("Introduce el numero de terminos "))
a = 0
b = 1

for x in range(N):
    print(a," ")
    siguiente = a + b
    a = b
    b = siguiente

