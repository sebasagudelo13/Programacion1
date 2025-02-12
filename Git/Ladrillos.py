def main():
    paquetes=ingresar_entero("ingrese la cantidad de paquetes en el pedido: ")
    ladrillos=ingresar_entero("ingrese la cantidad de ladrillos en cada paquete: ")
    total_ladrillos=calcular_ladrillos(paquetes, ladrillos)
    mensaje=generar_mensaje(paquetes, ladrillos, total_ladrillos)
    mostrar_mensaje(mensaje)

def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def calcular_ladrillos(paquetes, ladrillos):
    total_ladrillos=paquetes*ladrillos
    return total_ladrillos

def generar_mensaje(paquetes, ladrillos, total_ladrillos):
    mensaje=f" pedido\n paquetes: {paquetes}\n ladrillos por paquete: {ladrillos}\n total de ladrillos en el pedido: {total_ladrillos}"
    return mensaje

def mostrar_mensaje(mensaje):
    print(mensaje)

main()