object Conversiones {
    fun menuDivisa() {
        print(
            "===== CONVERSOR DE DIVISAS =====\n" +
                    "      1. Euros a dólares.\n" +
                    "      2. Euros a libras esterlinas.\n" +
                    "      3. Euros a yenes.\n" +
                    "      4. Euros a francos suizos.\n" +
                    "      5. Salir\n" +
                    "Selecione una opción: "
        )
    }

    fun menuDistancias() {
        print(
            "===== CONVERSOR DE DISTANCIA =====\n" +
                    "      1. Kilómetros a metros.\n" +
                    "      2. Metros a kilómetros.\n" +
                    "      3. Kilómetros a millas.\n" +
                    "      4. Millas a kilómetros.\n" +
                    "      5. Centímetros a metros.\n" +
                    "      6. Salir\n" +
                    "Selecione una opción: "
        )
    }

    fun menuTemperatura() {
        print(
            "===== CONVERSOR DE DIVISAS =====\n" +
                    "      1. Celsius a Fahrenheit.\n" +
                    "      2. Fahrenheit a Celsius.\n" +
                    "      3. Celsius a Kelvin.\n" +
                    "      4. Kelvin a Celsius.\n" +
                    "      5. Salir\n" +
                    "Selecione una opción: "
        )
    }

    fun divisa() {
        var salir: Boolean = false;
        var input: String;
        val valDolar: Double = 1.08
        val valLibras: Double = 0.86
        val valYenes: Double = 163.0
        val valFrancoSuizo: Double = 0.95
        do {
            menuDivisa()
            input = readln()
            if (!Excepciones.enteros(input)) {
                System.err.println("Error: Tienes que introducir un número entero.")
            } else {
                when (input.toInt()) {
                    1 -> {
                        while (true) {
                            println("Euros a dólares")
                            println("Escribe una cantidad en Euros: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var dolar: Double = input.toDouble() * valDolar
                                println("${input.toDouble()} € son $dolar \$")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal")
                            }
                        }
                    }

                    2 -> {
                        while (true) {
                            println("Euros a libras esterlinas.")
                            println("Escribe una cantidad en Euros: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var libras: Double = input.toDouble() * valLibras
                                println("${input.toDouble()} € son $libras £")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal")
                            }
                        }
                    }

                    3 -> {
                        while (true) {
                            println("Euros a yenes.")
                            println("Escribe una cantidad en Euros: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var yenes: Double = input.toDouble() * valYenes
                                println("${input.toDouble()} € son $yenes ¥")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal")
                            }
                        }
                    }

                    4 -> {
                        while (true) {
                            println("Euros a Francos Suizos.")
                            println("Escribe una cantidad en Euros: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var francoSuizo: Double = input.toDouble() * valFrancoSuizo
                                println("${input.toDouble()} € son $francoSuizo SFr")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    5 -> {
                        salir = true
                    }

                    else -> {
                        System.err.println("Error: Tienes que introducir una opción comprendida entre 1 y 5.")
                    }
                }
            }
        } while (!salir)
    }

    fun distancia() {
        var salir: Boolean = false;
        var input: String;
        do {
            menuDistancias()
            input = readln()
            if (!Excepciones.enteros(input)) {
                System.err.println("Error: Tienes que introducir un número entero.")
            } else {
                when (input.toInt()) {
                    1 -> {
                        while (true) {
                            println("Kilometros a metros.")
                            println("Escribe una cantidad en Kilometros: ")
                            input = readln()
                            if (Excepciones.decimales(input) && input.toDouble() >= 0) {
                                var metros: Double = input.toDouble() * 1000
                                println("${input.toDouble()} km son $metros m")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    2 -> {
                        while (true) {
                            println("metros a kilometros.")
                            println("Escribe una cantidad en metros: ")
                            input = readln()
                            if (Excepciones.decimales(input) && input.toDouble() >= 0) {
                                var kilometros: Double = input.toDouble() / 1000
                                println("${input.toDouble()} m son $kilometros km")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    3 -> {
                        while (true) {
                            println("Kilometros a millas.")
                            println("Escribe una cantidad en Kilometros: ")
                            input = readln()
                            if (Excepciones.decimales(input) && input.toDouble() >= 0) {
                                var millas: Double = input.toDouble() * 0.621371
                                println("${input.toDouble()} km son $millas M")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    4 -> {
                        while (true) {
                            println("millas a kilometros.")
                            println("Escribe una cantidad en millas: ")
                            input = readln()
                            if (Excepciones.decimales(input) && input.toDouble() >= 0) {
                                var kilometros: Double = input.toDouble() * 1.60934
                                println("${input.toDouble()} M son $kilometros km")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    5 -> {
                        while (true) {
                            println("centimetros a metros.")
                            println("Escribe una cantidad en centimetros: ")
                            input = readln()
                            if (Excepciones.decimales(input) && input.toDouble() >= 0) {
                                var centimetros: Double = input.toDouble() / 100
                                println("${input.toDouble()} cm son $centimetros m")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    6 -> {
                        salir =  true
                    }

                    else -> {
                        System.err.println("Error: Tienes que introducir una opción comprendida entre 1 y 6.")
                    }
                }
            }
        } while (!salir)
    }

    fun temperatura() {
        var salir: Boolean = false;
        var input: String;
        do {
            menuTemperatura()
            input = readln()
            if (!Excepciones.enteros(input)) {
                System.err.println("Error: Tienes que introducir un número entero.")
            } else {
                when (input.toInt()) {
                    1 -> {
                        while (true) {
                            println("Celsius a fahrenheit.")
                            println("Escribe una cantidad en celsius: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var fahrenheit: Double = input.toDouble() * 9 / 5 + 32
                                println("${input.toDouble()} ºC son $fahrenheit ºF")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal")
                            }
                        }
                    }

                    2 -> {
                        while (true) {
                            println("fahrenheit a celsius.")
                            println("Escribe una cantidad en fahrenheit: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var celsius: Double = (input.toDouble()-32) * 5 / 9
                                println("${input.toDouble()} ºF son $celsius ºC")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal")
                            }
                        }
                    }

                    3 -> {
                        while (true) {
                            println("Celsius a Kelvin.")
                            println("Escribe una cantidad en Celsius: ")
                            input = readln()
                            if (Excepciones.decimales(input)) {
                                var kelvin: Double = input.toDouble() + 273.15
                                println("${input.toDouble()} ºC son $kelvin ºK")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal")
                            }
                        }
                    }

                    4 -> {
                        while (true) {
                            println("Kelvin a celsius")
                            println("Escribe una cantidad en Kelvin: ")
                            input = readln()
                            if (Excepciones.decimales(input) && input.toDouble() >= 0) {
                                var kelvin: Double = input.toDouble() - 273.15
                                println("${input.toDouble()} ºK son $kelvin ºC")
                                break
                            }else{
                                System.err.println("Error: Tienes que escribir una cantidad decimal positiva")
                            }
                        }
                    }

                    5 -> {
                        salir = true
                    }

                    else -> {
                        System.err.println("Error: Tienes que introducir una opción comprendida entre 1 y 6.")
                    }
                }
            }
        } while (!salir)
    }
}