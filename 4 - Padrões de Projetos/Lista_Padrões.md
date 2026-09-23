# Objetivo

Identificar problemas comuns em engenharia de software e utilizar soluções testadas, documentadas e nomeadas

---

## Adapter

Converte a interface de uma classe em outra interface esperada pelos clientes.

- `de Classe`: Implementa uma Interface e herda de uma Classe

옷 → |Interface| ⇠ | Adapter | 一⊳ | Classe |

- `de Objeto`: Herda de uma Classe e é agregado por outra

옷 → |Classe| ⇽ | Adapter | ◇– | Classe |

## Façade
Um ponto de acesso único para um conjunto de subsistemas. Delega requisições aos objetos apropriados.

| sistema |⋯.
| sistema |⋯⁞⋯⊳ | Façade | ◀一 옷
| sistema |⋯⁞

## Composite
Compor objetos em estruturas de árvores para representar hierarquias todo-parte, tratando conjuntos como indivíduos.


옷 → | Composite | ⇽ |Indivídos e/ou Grupos| 

## Bridge
Permita total desacoplamento entre interface e implementação. Suporta qualquer extensão através de herança.

{ BD, XML } 一⊳ | Livro | 一一一⊳ | Publicação | ← 옷
{ BD, XML } 一⊳ | Revista |一⤶

Evitamos repetição e facilitamos a manutenção:

{ Livro, Revista } 一⊳ | Publicação | ← 옷
{ BD, XML }	⋯⊳ | Inplementar | ⤶

## Singleton
Garantir que uma classe só tenha uma única instância, e prover um ponto de acesso global a ela.

`public class Facade {`
`__private static Facade instancia;`
`__private Facade() {}   // Construtor privado`

// Uma Instância só é criada se ainda não há instância;
`__public static Facade obterInstancia() {`
`____if (instancia == null) instancia = new Facade();`
`____return instancia;`
`__}`
`}`
