# Biblioteca Calculadora_202421250030

## 1. Informações do Ambiente

| Informação              | Detalhes                               |
| ----------------------- | -------------------------------------- |
| **Compilador Java**     | Java 25                                |
| **IDE**                 | OnlineGDB                              |
| **Versão da IDE**       | Ambiente online (versão não informada) |
| **Sistema Operacional** | Windows 10                             |
| **Tipo da biblioteca**  | `.jar`                                 |

---

## 2. Descrição da Biblioteca

A biblioteca **Calculadora_202421250030** foi desenvolvida em Java com o objetivo de fornecer operações matemáticas básicas por meio de métodos estáticos.

A classe não permite a criação de instâncias, sendo suas operações acessadas diretamente por meio do nome da classe.

---

## 3. Métodos Disponíveis

### 3.1 `somar(int... args)`

Recebe uma quantidade variável de valores inteiros e retorna a soma dos valores fornecidos.

**Exemplo:**

```java
Calculadora_202421250030.somar(1, 2, 3);
```

**Retorno:**

```text
6
```

---

### 3.2 `somar(double... args)`

Recebe uma quantidade variável de valores de ponto flutuante e retorna a soma dos valores fornecidos.

**Exemplo:**

```java
Calculadora_202421250030.somar(1.5, 2.5, 3.0);
```

**Retorno:**

```text
7.0
```

---

### 3.3 `subtrair(int... args)`

Recebe uma quantidade variável de valores inteiros. O primeiro valor é utilizado como base e os valores seguintes são subtraídos sequencialmente.

**Exemplo:**

```java
Calculadora_202421250030.subtrair(10, 2, 3);
```

**Retorno:**

```text
5
```

---

### 3.4 `subtrair(double... args)`

Recebe uma quantidade variável de valores de ponto flutuante. O primeiro valor é utilizado como base e os valores seguintes são subtraídos sequencialmente.

**Exemplo:**

```java
Calculadora_202421250030.subtrair(10.5, 2.5, 3.0);
```

**Retorno:**

```text
5.0
```

---

### 3.5 `multiplicar(int... args)`

Recebe uma quantidade variável de valores inteiros e retorna o produto dos valores fornecidos.

**Exemplo:**

```java
Calculadora_202421250030.multiplicar(2, 3, 4);
```

**Retorno:**

```text
24
```

---

### 3.6 `multiplicar(double... args)`

Recebe uma quantidade variável de valores de ponto flutuante e retorna o produto dos valores fornecidos.

**Exemplo:**

```java
Calculadora_202421250030.multiplicar(2.5, 2.0);
```

**Retorno:**

```text
5.0
```

---

### 3.7 `dividir(double... args)`

Recebe uma quantidade variável de valores de ponto flutuante.

O primeiro valor é utilizado como dividendo e os valores seguintes são utilizados como divisores, realizando a divisão sequencialmente.

**Exemplo:**

```java
Calculadora_202421250030.dividir(100.0, 2.0, 5.0);
```

**Retorno:**

```text
10.0
```

Caso algum dos valores utilizados como divisor seja zero, o método lança uma exceção `ArithmeticException` com a mensagem:

```text
Divisão por zero.
```

---

## 4. Observações

* Os métodos da classe são **estáticos**, portanto não é necessário criar uma instância da classe `Calculadora_202421250030` para utilizá-los.
* A biblioteca utiliza argumentos de quantidade variável (**varargs**), permitindo que múltiplos valores sejam fornecidos em uma única chamada.
