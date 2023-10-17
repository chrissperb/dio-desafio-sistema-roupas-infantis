# Sistema para loja de Roupas Infantis
Este repositório contém o esboço de uma aplicação API RESTful para uma loja de roupas infantis. Faz parte do último desafio do bootcamp de BackEnd Java, da DIO.


## Diagrama de classes
``` mermaid

classDiagram
    class Customer {
        -name: string
        -address: string
        -phone: string
        -email: string
    }
    
    class Product {
        -description: string
        -code: string
        -price: float
        -size: string
        -color: string
        -category: string
    }
    
    class Stock {
        -code: string
        -quantity: int
    }
    
    class Sale {
        -date_time: string
        -customer: Customer
        -sold_products: SoldProduct[]
        -total_sale: float
        -payment_method: string
        -employee: string
    }
    
    class SoldProduct {
        -code: string
        -quantity: int
    }

    Customer "1" --> "1..*" Sale : has
    Product "1" --> "1..*" Sale : includes
    Product "1" --> "1..*" Stock : recorded in
    Product <-- SoldProduct : is sold
    Sale --> SoldProduct : contains

```
