a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b = []
i = 0
print("La lista original:", a)
while i < len(a):
    num = a[i]
    if num == 1:
        i = i + 1
        a.pop(i - 1)  
        continue    
    es_primo = True
    for e in range(2, num):
        if num % e == 0:
            es_primo = False
            break    
    if es_primo:
        b.append(num)   
    if not es_primo:
        a.pop(i)  
    else:
        i = i + 1
b.append(2)
print("La lista original modificada:", a)
print("La lista de los primos:", b)
