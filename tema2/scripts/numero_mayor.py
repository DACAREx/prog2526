def maximo(t):
    num2 = t[0]
    for i in range(len(t)):
        if t[i] > num2:
            num2 = t[i]
    return num2

t = [900, 8, 4, 30, 10]
mayor = maximo(t)
print("El número mayor es", mayor)
