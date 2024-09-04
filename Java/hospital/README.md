# Diagrama de Classes
~~~mermaid

classDiagram
    class Usuario {
        +Long id
        +DadosPessoais dadosPessoais
        +DadosHospitalares dadosHospitalares
        +DadosProfissionais dadosProfissionais
        +List~Noticia~ noticias
    }

    class DadosPessoais {
        +Long id
        +String nome
        +String cpf
        +String email
        +String telefone
        +Endereco endereco
    }

    class DadosHospitalares {
        +Long id
        +String historicoMedico
        +String alergias
        +String medicamentos
    }

    class DadosProfissionais {
        +Long id
        +String especialidade
        +String registroProfissional
    }

    class Noticia {
        +Long id
        +String titulo
        +String conteudo
        +LocalDateTime dataPublicacao
    }

    class Endereco {
        +Long id
        +String rua
        +String numero
        +String cidade
        +String estado
        +String cep
    }

    Usuario --> DadosPessoais : 1
    Usuario --> DadosHospitalares : 1
    Usuario --> DadosProfissionais : 1
    Usuario --> Noticia : "1..*"
    DadosPessoais --> Endereco : 1
