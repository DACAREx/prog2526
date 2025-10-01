x = float(input("Introduce el primer numero "))
y = float(input("Introduce el segundo numero "))
op = input("Introducza la operacion que quiera realizar (suma,resta,mult o div) ")

if op == ("suma"):
    suma = x + y
    print("El resultado es ",suma)
    
elif op == ("resta"):
    resta = x - y
    print("El resultado es ",resta)

elif op == ("mult"):
    mult = x * y
    print("El resultado es ",mult)

else:
    div = x / y
    print("El resultado es ",div)
