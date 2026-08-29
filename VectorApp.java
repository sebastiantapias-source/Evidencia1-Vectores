import java.util.Scanner;

public class VectorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[15];
        
        // 1️⃣ Llenar el vector con 15 números (10-100)
        System.out.println("=== PASO 1: Llenar el vector ===");
        for (int i = 0; i < vector.length; i++) {
            int numero;
            do {
                System.out.print("Ingresa el número " + (i+1) + " (entre 10 y 100): ");
                numero = scanner.nextInt();
                if (numero < 10 || numero > 100) {
                    System.out.println("❌ Número fuera de rango. ¡Intenta otra vez!");
                }
            } while (numero < 10 || numero > 100);
            vector[i] = numero;
        }
        
        // Mostrar el vector
        System.out.println("\n✅ Vector completo:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // 2️⃣ Buscar un número
        System.out.println("=== PASO 2: Buscar un número ===");
        System.out.print("Ingresa el número a buscar: ");
        int buscar = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("✅ El número " + buscar + " está en la posición: " + (i+1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("❌ El número " + buscar + " NO está en el vector.");
        }
        System.out.println();
        
        // 3️⃣ Mayor y Menor
        System.out.println("=== PASO 3: Mayor y Menor ===");
        int mayor = vector[0];
        int menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) mayor = vector[i];
            if (vector[i] < menor) menor = vector[i];
        }
        System.out.println("🔹 Número mayor: " + mayor);
        System.out.println("🔹 Número menor: " + menor);
        System.out.println();
        
        // 4️⃣ Múltiplos de X
        System.out.println("=== PASO 4: Múltiplos de un número ===");
        System.out.print("Ingresa el número X para buscar sus múltiplos: ");
        int x = scanner.nextInt();
        boolean hayMultiplos = false;
        System.out.print("Múltiplos de " + x + ": ");
        for (int num : vector) {
            if (num % x == 0) {
                System.out.print(num + " ");
                hayMultiplos = true;
            }
        }
        if (!hayMultiplos) {
            System.out.println("\n❌ No hay múltiplos de " + x + " en el vector.");
        }
        System.out.println();
        
        // 5️⃣ Suma total
        System.out.println("=== PASO 5: Suma total ===");
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        System.out.println("🔹 La suma total es: " + suma);
        System.out.println();
        
        // 6️⃣ Valores por encima del promedio
        System.out.println("=== PASO 6: Por encima del promedio ===");
        double promedio = (double) suma / vector.length;
        System.out.println("🔹 El promedio es: " + promedio);
        
        int contador = 0;
        System.out.print("✅ Números por encima del promedio: ");
        for (int num : vector) {
            if (num > promedio) {
                System.out.print(num + " ");
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("\n❌ No hay números por encima del promedio.");
        } else {
            System.out.println("\n🔹 Cantidad: " + contador);
        }
        
        scanner.close();
        System.out.println("\n🎉 ¡Tarea completada con éxito!");
    }
}