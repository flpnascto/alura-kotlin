fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta("Alex", 1000)
    contaAlex.depositar(100.0)

    val contaFran = Conta(numeroConta = 1001, titular = "Fran")
    contaFran.depositar(50.0)

    println("Conta do ${contaAlex.titular}")
    println("Numero da conta ${contaAlex.numeroConta}")
    println("Saldo: ${contaAlex.saldo}")
    println()
    println("Conta do ${contaFran.titular}")
    println("Numero da conta ${contaFran.numeroConta}")
    println("Saldo: ${contaFran.saldo}")
    println()
    contaAlex.sacar(50.0)
    println("Saldo conta Alex após saque de 50.0: ${contaAlex.saldo}")
    println()
    contaFran.sacar(50.0)
    println("Saldo conta Alex após saque de 50.0: ${contaFran.saldo}")
    println()
    println("Transferir 30 de Alex para Fran")
    contaAlex.trasnferir(30.0, contaFran)
    println("Alex: ${contaAlex.saldo}")
    println("Fran: ${contaFran.saldo}")

}

class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun trasnferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

}


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