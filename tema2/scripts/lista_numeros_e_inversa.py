cant = int(input("Cuantos numeros desea introducir: "))
reves = cant - 1
lista = []
for i in range (cant):
        lista.append(input("Introduzca el numero "))
print("Los numeros en orden inverso son: ")
for i in range(cant):
        print(lista[reves])
        reves = reves - 1
        
             
