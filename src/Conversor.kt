class Conversor {
    fun menu () {
        print("===== CONVERSOR DE UNIDADES =====\n" +
                "      1. Conversor de divisas\n" +
                "      2. Conversor de distancias\n" +
                "      3. Conversor de temperaturas\n" +
                "      4. Salir\n" +
                "Selecione una opción: ")
    }

    fun menuConversor (){
        var salir: Boolean = false;
        var input: String;
        do {
            menu()
            input = readln()
            if (!Excepciones.enteros(input)){
                System.err.println("Error: Tienes que introducir un número entero.")
            }else{
                when (input.toInt()){
                    1 ->{
                        Conversiones.divisa()
                    }
                    2 ->{
                        Conversiones.distancia()
                    }
                    3 ->{
                        Conversiones.temperatura()
                    }
                    4 ->{
                        salir = true
                    }
                    else ->{
                        System.err.println("Error: Tienes que introducir una opción comprendida entre 1 y 4.")
                    }
                }
            }
        } while (!salir)
    }
}