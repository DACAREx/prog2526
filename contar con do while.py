n = int(input("Introduce el numero "))
x = 0
while True:
   x = 1 + x
   if x < n:
       print(x, end=(", "))
   else:
       print(x) #asi salgo del bucle al ser mayor que el numero pedido y no pone coma al final
       break 
