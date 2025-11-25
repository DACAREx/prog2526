def iguales(a, b):
    n = len(a)
    m = len(b)
    if n != m:
        return False
    else:
        for i in range(n):
            if a[i] != b[i]:
                return False
        return True
    
a = [1,2,3,4,5]
b = [1,2,3,4,5]
solucion = iguales(a,b)
if solucion == True:
    print("Si, estas dos listas son iguales")
elif solucion == False:
    print("No, estas dos listas no son iguales")
else:
    print("Ha ocurrido un error")