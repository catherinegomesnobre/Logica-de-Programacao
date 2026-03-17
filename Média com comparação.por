programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
       real nota1, nota2, nota3, notaFinal, notaArredondada 

       escreva("Digite a primeira nota: ")
       leia(nota1)

       escreva("Digite a segunda nota: ")
       leia(nota2)

       escreva("Digite a terceira nota: ")
       leia(nota3)

       notaFinal = (nota1+nota2+nota3)/3
       notaArredondada = mat.arredondar(notaFinal,2)

       se(notaArredondada>=7){
       	escreva("O aluno foi aprovado com a média ", notaArredondada)
       }senao{
       	escreva("O aluno foi reprovado com a média ", notaArredondada)
       }

     
      }
}