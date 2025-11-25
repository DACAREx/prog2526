# Variables del producto
producto = "Expreso Doble"
precio_unitario = 3.50

#Variables de la Transaccion
cantidad = 3
tasa_iva = 0.16 #16% de IVA

#Variables del Cliente
cliente_nombre = "Ana María López"
id_transaccion = "CAF-2025-472"

print("               RECIBO VENTA                   ")
print("           Cafeteria Tentaciones              ")
print("           C/San Francisco Nº141              ")
print("              Tel :123 456 789                   ")
print("                                                  ")
print("CAJERO/A: Supervisor     Fecha:19/11/2025")
print("                                                  ")
print("==========================================")  
print("  QTY  Descripcion      Precio    Total")
print("------------------------------------------")         
print(f"   {cantidad}  {producto }      {precio_unitario}€     {cantidad * precio_unitario}€ ")
print("==========================================")
print(f"  SUBTOTAL                        {cantidad * precio_unitario}€")
print(f"  IVA                             {(cantidad * precio_unitario) * tasa_iva}€" )
print(f"  TOTAL                           {(cantidad * precio_unitario)+(cantidad * precio_unitario) * tasa_iva}€" )
print("==========================================")
print("    ")
print(f"                           {id_transaccion}")