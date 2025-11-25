num = []
orden = ["Primer", "Segundo", "Tercer", "Cuarto", "Quinto"]
for i in range(5):
   x = float(input("Introduzca un numero: "))
   num.append(x)
print("===========================================================================")
i = 0
for i in range(5):
    print(orden[i], "numero:",num[i])
