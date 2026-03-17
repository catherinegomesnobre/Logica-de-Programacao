programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    real numArredondado, numA = 5.449

    numArredondado = mat.arredondar(numA, 2 )
    escreva("Digite o número " , numA , "\n")
    escreva("Número formatado: " , numArredondado)
  }
}
