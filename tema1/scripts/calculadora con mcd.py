x = float(input("Introduce el primer numero "))
y = float(input("Introduce el segundo numero "))
op = input("Introducza la operacion que quiera realizar (suma,resta,mult,mcd o div) ")

if op == ("suma"):
    suma = x + y
    print("El resultado es ",suma)
    
elif op == ("resta"):
    resta = x - y
    print("El resultado es ",resta)

elif op == ("mult") or op == ("multiplicacion"):
    mult = x * y
    print("El resultado es ",mult)

elif op == ("div") or op == ("division"):
     if y == 0:
        print("No se puede dividir entre 0")
     else:
        div = x / y
        print("El resultado es ",div)
elif op == ("mcd"):
    while (x != 0) and (y != 0):
        if x > y:
            x = x - y
        else:
            y = y - x
            mcd = x if x != 0 else y

            print("El resultado es ", mcd)
      
else:
    print("Ha ocurrido un error (prueba a escribir bien la operacion)")
