fun condicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("saldo é positivo")
    } else if (saldo == 0.0) {
        println("saldo é zero")
    } else {
        println("saldo é negativo")
    }

    when {
        saldo > 0.0 -> println("saldo é positivo")
        saldo == 0.0 -> println("saldo é zero")
        else -> println("saldo é negativo")
    }
}