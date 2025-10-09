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
     if y == 0:
        print("No se puede dividir entre 0")
     else:
        resultado = x / y
        print("El resultado es ",resultado)
        
def raiz(x):
    if x < 0:
        print("No se puede calcular la raíz de un número negativo")
    else:
        resultado = x ** (1/2)
        print("La raíz cuadrada es", resultado)

#Programa Principal        
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Raíz cuadrada")

opcion = int(input("Elige una opcion (1-5) "))

if opcion == 5:
    x = float(input("Introduce un numero "))
    raiz(x)
elif opcion == 1:
    x = float(input("Introduce un numero "))
    y = float(input("Introduce un numero "))
    suma(x,y)
    
elif opcion == 2:
    x = float(input("Introduce un numero "))
    y = float(input("Introduce un numero "))
    resta(x,y)
    
elif opcion == 3:
    x = float(input("Introduce un numero "))
    y = float(input("Introduce un numero "))
    mult(x,y)
    
elif opcion == 4:
    x = float(input("Introduce un numero "))
    y = float(input("Introduce un numero "))
    div(x,y)
else:
    print("Ha ocurrido un error inesperado")
