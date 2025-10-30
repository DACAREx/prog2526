import math
#Definir Funciones
def suma(x,y):
    resultado = x + y
    print("El resultado es ",resultado)   
def resta(x,y):
    resultado = x - y
    print("El resultado es ",resultado)
def mult(x,y):
    resultado = x * y
    print("El resultado es ",resultado)
def div(x,y):
     if y == 0: #Verificacion
        print("No se puede dividir entre 0")
     else:
        resultado = x / y
        print("El resultado es ",resultado)        
def raiz(x):
    if x < 0: #Verificacion
        print("No se puede calcular la raíz de un número negativo")
    else:
        resultado = (math.sqrt(x)) #Calculo Raiz cuadrada
        print("La raíz cuadrada es", resultado)
def potencia(x,y):
    resultado = pow(x,y)
    print("El resultado es ",resultado)
#Menu para elegir las opciones       
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Raíz cuadrada")
print("6. Potencia")
opcion = int(input("Elige una opcion (1-6) "))
#Programa principal
match opcion:
  case 1:
      x = float(input("Introduce un numero "))
      y = float(input("Introduce un numero "))
      suma(x,y)   
  case 2:
      x = float(input("Introduce un numero "))
      y = float(input("Introduce un numero "))
      resta(x,y)    
  case 3:
      x = float(input("Introduce un numero "))
      y = float(input("Introduce un numero "))
      mult(x,y)    
  case 4:
      x = float(input("Introduce un numero "))
      y = float(input("Introduce un divisor "))
      div(x,y)
  case 5:
      x = float(input("Introduce un numero "))
      raiz(x)  
  case 6:
      x = float(input("Introduce una base "))
      y = float(input("Introduce un exponente "))
      potencia(x,y)    
  case _: #Verificacion
      print("Ha ocurrido un error inesperado")
