a = float(input("Introduzca un numero "))
b = float(input("Introduzca un numero "))
suma = a + b
if (a != 0) and (b != 0):
    while True:
       c = float(input("Introduzca otro numero "))
       if (c != 0):
          suma = suma + c
       else:
          print("El resultado es ", suma)
    
else:
    print(suma)
