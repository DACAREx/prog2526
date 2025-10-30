a = int(input("Introduce un número: "))
if a <= 1:
    print("No es primo")
else:
    for i in range(2, a-1):
        if a % i == 0:
            print("No es primo")
            break
    else:
        print("Es primo")
