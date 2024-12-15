# Trabalho Prático - Teste de Software - Equilibra

## **Nome dos Integrantes**
- Willian Douglas Brito Braga

## **Sobre o Sistema**
- Trata-se de uma feramenta de conversão de unidades, operado pela linha de comando
- O usuário interage com o sistema oferecendo como entrada:
    - Um valor
    - Sua unidade original
    - A unidade a qual deseja convertê-lo (da mesma categoria da unidade original)
- O usuário recebe como saída um valor equivalente ao da entrada, na nova unidade especificada

- Comando para construir um arquivo JAR executável
```
$ mvn package
```
- Exemplo de execução:
```
$ java -jar target/equilibra-0.2.0.jar 11111111 --binary --decimal
```
- Saida da execução do exemplo anterior:
```
> Equilibra 0.4.0
> 11111111 base 2 is equivalent to 255 base 10
```
- A execução do programa sem parâmetros adicionais (no exemplo: 11111111 --binary --decimal) resulta na listagem de todos os parâmetros disponiveis para uma chamada do equilibra
- O programa tem suporte pros seguintes tipos de unidades:
    - Energias
        - Caloria
        - Joule
    - Numéricas
        - Binário
        - Decimal
        - Hexadecimal
        - Octal
    - Temperaturas
        - Celsius
        - Fahrenheit
        - Kelvin
    - Velocidades
        - Metros / Segundo
        - Quilometros / Hora
## **Tecnologias Utilizadas**
- Java (OpenJDK 21)
- Apache Maven 3.8.7
- JUnit 5.11.0
- Jacoco 0.8.12
