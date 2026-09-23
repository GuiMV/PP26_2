# Diagramas de Casos de Uso

Identificar Agentes e suas Interações

---

## Ator: 옷

Representa os usuários do Sistema

## Casos de Uso: (Ação)

Representa a ações a ser realizada

## Associação Simples: →

Uma conexão que permite representar as possibilidade de uso 

옷 → (Ligar Luz)

## Herança: ⇾

Relação de Herança Filho ⇾ Pai

(옷, 옷) ⇾ 옷

---

# Dependência

## <<Include>>: --->

Sempre que A for executado, B `será` executado; 

옷 → (A) ⇢ (B)

## <<Extend>>: <---

Sempre que A for executado, B `poderá` ser executado. 

옷 → (A) ⇠ (B)