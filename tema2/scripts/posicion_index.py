num = int(input("Introduce el numero del que desee saber su posicion: "))
desorden = [3, 2, 5, 6, 9, 12, -8, 0, 21, 7]
if num in desorden:
    x = desorden.index(num)
    print(x)
else:
    print(-1)
