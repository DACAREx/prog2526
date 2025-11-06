def busqueda(y,x):
    i = 0
    solucion = 0
    while i < len(x):
        if x[i] == y:
            solucion = i           
        i = i + 1
    if solucion == 0:
        solucion = -1       
    return solucion

num = int(input("Introduce el numero del que desee saber su posicion: "))
desorden = [3, 2, 5, 6, 9, 12, -8, 0, 21, 7]
print(busqueda(num,desorden))

