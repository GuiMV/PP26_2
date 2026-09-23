# Diagrama de Classes 

● Reflete a Estrutura do Código 
- `Classes` com atributos e métodos
- `Relacionamentos` entre Classes

---

## ● Estrutura

- Nome da Classe
- Conjunto de Atributos (Normalmente protegidos #)
- Conjunto de Métodos  (+ Publicos, - Privados ou # Protegidos)

---

## ● Classe Abstrata

- Pelo menos um método abstrato, considerar relacionamento de herança

## ● Classe Concreta

- Possui todos os métodos completos

---

## Herança 一⊳
Relação hierárquica

|Gato| 一⊳ |Animal|
 Gato `É um` Animal

## Agregação ◇一
Existências independentes

|Estante| ◇一 |Livro|
Estante `Tem um` Livro

## Composição ♦一
Existências dependentes do tipo Todo parte

|Corpo| ♦一 |Cabeça|
Todo --------- Parte

## Associação →
Conexão do tipo Usa um

|Motorista| → |Carro|
Motorista `Usa um` Carro

## Realização ⋯⊳ ou ⊸
Implementa os métodos da interface

|Classe| ⋯⊳ |Interface|
Classe `implementa` Interface

## Dependência ⇢ ou 一c
Usa de métodos externos para realizar uma ação

옷 → |Façade| ⇢ |Classe|
User usa Façade `precisa de` Classe