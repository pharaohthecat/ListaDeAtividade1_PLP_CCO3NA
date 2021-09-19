import math

while (True):
    print('---------------------------')
    print("## Atividade PLP CCO3NA - Clecio e Deyvid ##")
    print("1 - Primeira Questao")
    print("2 - Segunda Questao")
    print("3 - Terceira Questao")
    print("4 - Quarta Questao")
    print("5 - Quinta Questao")
    print("0 - Encerrar")

    opcao = int(input('\nDigite sua opcao: '))

    if (opcao == 0):
        print('Feito por Clecio Jose (202004116) e Deyvid Santos (202001277)')
        break

    if (opcao == 1):
        print('Dados da primeira pessoa:')
        nome1 = input('Nome:')
        idade1 = input('Idade:')

        print('Dados da segunda pessoa:')
        nome2 = input('Nome:')
        idade2 = input('Idade:')

        if (idade1 > idade2):
             print('\nPessoa mais velha:'+nome1)
        elif(idade1 == idade2):
             print('\nMesma idade...')
        else:
             print('\nPessoa mais velha:'+nome2)
    
    # opcao 2 - clecinho
    if (opcao == 2):
        print('Dados do primeiro Funcionario:')
        funcionario1 = input('Funcionario:')
        salario1 = float(input('Salario:'))
        
        print('Dados do Segundo Funcionario:')
        funcionario2 = input('Funcionario:')
        salario2 = float (input('Salario:'))
        
        salariomédio = (salario1 + salario2) / 2
        print('Tirando {:.1f} e {:.1f}, O salario médio é {:.1f}'.format(salario1, salario2, salariomédio))

    if (opcao == 3):
        print('Entre a largura e a altura do retangulo:')
        largura = float(input(''))
        altura = float(input(''))

        area = largura*altura
        perimetro = 2*(largura+altura)
        diagonal = math.sqrt((largura*largura)+(altura*altura))

## % é usado para indicar a variável, o .2 é para pular as casas decimais, f é usado para identificar o tipo da variável
        print('\nAREA = %.2f \n'%area)
        print('PERIMETRO = %.2f \n'%perimetro)
        print('DIAGONAL = %.2f \n'%diagonal)
        print('-----------------------')
    
    if (opcao == 4):
        nome = input('Nome:')
        salarioBruto = float(input('Salario Bruto:'))
        imposto = float(input('Imposto:'))

        salarioLiquido = salarioBruto - imposto

        print('\nFuncionario: '+nome+', R$ %.2f'%salarioLiquido)

        porcentagem = int(input('\nDigite a porcetagem para aumentar o salario:'))

        salarioFinal = salarioLiquido + (salarioLiquido * porcentagem / 100.0)

        print('\nDados atualizados: '+nome+', R$ %.2f \n'%salarioFinal)

        print('--------------------------')
 
    if (opcao == 5):
        nome = input('Nome do Aluno:')
        print('Digite as três notas do aluno:')
        nota1 = float(input(''))
        nota2 = float(input(''))
        nota3 = float(input(''))
        notafinal = (nota1 + nota2 + nota3)
        
        print('NOTA FINAL = {:.1f}'.format(notafinal))
        if notafinal < 50:
            print('REPROVADO!')
            restante = (60-notafinal)
            print('FALTARAM {:.1f} PONTOS'.format(restante))
        else:
            print('APROVADO!')