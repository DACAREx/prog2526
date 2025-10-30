nombre = input("Introduzca nombre: ")
clave = input("Introduzca contraseña: ")
while True:
   if (len(clave) > 7):
       print("Bienvenido", nombre)
       break
   else:
       clave = input("Introduzca una contraseña valida: ")






###   nombre = input("Introduzca nombre: ")
###   clave = input("Introduzca contraseña: ")   
###   while (len(clave) < 8):
###      clave = input("Introduzca una contraseña valida: ")
###   print("Bienvenido", nombre)
