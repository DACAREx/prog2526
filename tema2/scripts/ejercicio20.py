original = [1,2,3,4,5]
copia1 = original.copy()
copia2 = original[:]
copia3 = [0,0,0,0,0]
copia4 = original
copia4.remove(5)
copia3.pop(0)

for i in range(len(original)):
    copia3[i] = original[i]
    
print("la original:" ,original)
print("la copia 1:" ,copia1)
print("la copia 2:" ,copia2)
print("la copia 3:" ,copia3)
print("la copia 4:" , copia4)