n = int(input("Introduce el numero "))
x = 0
condicion = True
if n > 0:
   while condicion:
      x = 1 + x
      if x < n:
          print(x, end=(", "))
      else:
          print(x) #asi salgo del bucle al ser mayor que el numero pedido y no pone coma al final
          condicion = False
else:
   print("Escribe un numero mayor que cero")
