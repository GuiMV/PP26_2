# Objetivo

Identificar problemas comuns em engenharia de software e utilizar soluções testadas, documentadas e nomeadas

---

## Adapter

Converte a interface de uma classe em outra interface esperada pelos clientes.

    Cliente usa Interface
        Interface ◀一 옷
    
    Adapter implementa a interface e Herda de outra classe
        Classe ⇽ Adapter ⋯⊳ Interface